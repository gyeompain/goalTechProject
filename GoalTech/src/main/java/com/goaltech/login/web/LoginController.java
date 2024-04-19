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

	// @Autowired라는 어노테이션으로 서비스 등록
	@Autowired
	private LoginService loginService;

	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	@RequestMapping(value = "/join", method = { RequestMethod.GET, RequestMethod.POST })
	public String showJoinDetail(HttpServletRequest request, ModelMap model) throws Exception {

		return "com.login.join";

	}

	// @RequestMapping = 해당 요청값을 매핑해주는 어노테이션
	@RequestMapping(value = "insertMember.do", method = RequestMethod.POST)
	public String insertMember(HttpServletRequest request, HttpServletResponse response, Model model, HttpSession session) throws Exception {

		// 1. 폼에서 인자값 변수에 담기
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String name = request.getParameter("user_name");
		String phone = request.getParameter("user_phone");

		// 2. vo에 값 담기
		UserVO vo = new UserVO();
		vo.setUser_id(id);
		vo.setUser_pw(passwordEncoder.encode(pw));

		vo.setUser_name(name);
		vo.setUser_phone(phone);

		// 3. userVO에 Insert하기
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

		// 1. 사용자 입력 정보 추출
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");

		// 2. DB 연동 처리
		UserVO userVO = new UserVO();
		userVO.setUser_id(id);

		// 암호화된 비밀번호 변수 담기
		String encodePassword = loginService.selectPassword(userVO);

		if (passwordEncoder.matches(pw, encodePassword)) {

			/*
			 * 로그인 로직 수정사항 1. 사용자가 로그인한 비밀번호를 변수에 담는다. 2. 인코더 매치가 되면 암호화된 비밀번호를 꺼낸다.
			 */
			userVO.setUser_id(id);
			userVO.setUser_pw(passwordEncoder.encode(pw));

			UserVO authenticatedUser = loginService.selectUser(userVO);

			if (null != authenticatedUser.getUser_name() && authenticatedUser != null) {

				System.out.println("로그인 후 메인 페이지로 이동");

				session.setAttribute("User", authenticatedUser);
				model.addAttribute("User", authenticatedUser);

			} else {
				System.out.println("로그인 화면으로 이동");
				return "login";
			}

		}

		return "redirect:/main.do";
	}

	private boolean isValidInput(String id, String pw) {

		return true;
	}

}
