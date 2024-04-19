package com.goaltech.login.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.goaltech.login.service.LoginService;
import com.goaltech.login.vo.UserVO;

@Controller
public class LoginController {

	// @Autowired��� ������̼����� ���� ���
	@Autowired
	private LoginService loginService;

	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	@RequestMapping(value = "/join", method = { RequestMethod.GET, RequestMethod.POST })
	public String showJoinDetail(HttpServletRequest request, ModelMap model) throws Exception {

		return "com.login.join";

	}

	// @RequestMapping = �ش� ��û���� �������ִ� ������̼�
	@RequestMapping(value = "insertMember.do", method = RequestMethod.POST)
	public String insertMember(HttpServletRequest request, HttpServletResponse response, Model model, HttpSession session) throws Exception {

		// 1. ������ ���ڰ� ������ ���
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String name = request.getParameter("user_name");
		String phone = request.getParameter("user_phone");

		// 2. vo�� �� ���
		UserVO vo = new UserVO();
		vo.setUser_id(id);
		vo.setUser_pw(passwordEncoder.encode(pw));

		vo.setUser_name(name);
		vo.setUser_phone(phone);

		// 3. userVO�� Insert�ϱ�
		loginService.insertUser(vo);
		model.addAttribute(vo);
		session.setAttribute("User", vo);
		return "redirect:/main.do";

	}

	@RequestMapping(value = "main.do")
	public String main(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {

		return "main";
	}

	@RequestMapping(value = "join.do")
	public String join() {
		return "com/login/join";
	}

	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String login() {
		return "com/login/login";
	}

	@RequestMapping(value = "login_proc.do", method = RequestMethod.POST)
	public String loginProc(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			HttpSession session) throws Exception {

		// 1. ����� �Է� ���� ����
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");

		// 2. DB ���� ó��
		UserVO userVO = new UserVO();
		userVO.setUser_id(id);

		// ��ȣȭ�� ��й�ȣ ���� ���
		String encodePassword = loginService.selectPassword(userVO);

		if (passwordEncoder.matches(pw, encodePassword)) {

			/*
			 * �α��� ���� �������� 1. ����ڰ� �α����� ��й�ȣ�� ������ ��´�. 2. ���ڴ� ��ġ�� �Ǹ� ��ȣȭ�� ��й�ȣ�� ������.
			 */
			userVO.setUser_id(id);
			userVO.setUser_pw(passwordEncoder.encode(pw));

			UserVO authenticatedUser = loginService.selectUser(userVO);

			if (null != authenticatedUser.getUser_name() && authenticatedUser != null) {

				System.out.println("�α��� �� ���� �������� �̵�");

				session.setAttribute("User", authenticatedUser);
				model.addAttribute("User", authenticatedUser);

			} else {
				System.out.println("�α��� ȭ������ �̵�");
				return "login";
			}

		}

		return "redirect:/main.do";
	}

	private boolean isValidInput(String id, String pw) {

		return true;
	}

}
