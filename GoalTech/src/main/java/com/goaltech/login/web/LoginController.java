package com.goaltech.login.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.goaltech.login.service.LoginService;
import com.goaltech.login.vo.UserVO;

@Controller
public class LoginController {
	
	//@Autowired라는 어노테이션으로 서비스 등록
	@Autowired
	private LoginService loginService;
	
	//@Autowired
	//BCryptPasswordEncoder passwordEncoder;
	
	@RequestMapping(value = "/join", method = { RequestMethod.GET, RequestMethod.POST})
	public String showJoinDetail(HttpServletRequest request, ModelMap model) throws Exception {
		
		return "com.login.join";
		
	}
	
	//@RequestMapping = 해당 요청값을 매핑해주는 어노테이션
	@RequestMapping(value = "insertMember.do", method= RequestMethod.POST)
	public String insertMember(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception{

				
		//1. 폼에서 인자값 변수에 담기
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String name = request.getParameter("user_name");
		String phone = request.getParameter("user_phone");

		
		//2. vo에 값 담기
		UserVO vo = new UserVO();
		vo.setUser_id(id);
		vo.setUser_pw(pw);
		vo.setUser_name(name);
		vo.setUser_phone(phone);

		//3. userVO에 Insert하기
		Object hi;
		loginService.insertUser(vo);
		model.addAttribute(vo);
		return "main";

	}
	
	@RequestMapping(value="join.do")
	public String join() {
		return "com/login/join";
	}
	
	@RequestMapping(value="login.do", method= RequestMethod.GET)
	public String login() {
		return "com/login/login";
	}
	
	@RequestMapping(value="login_proc.do", method= RequestMethod.POST)
	public String loginProc(HttpServletRequest request) throws Exception {
		
		//1. 사용자 입력 정보 추출
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		if(!isValidInput(id, pw)) {
			return "login";
		}
		
		//2. DB 연동 처리
		UserVO userVO = new UserVO();
		userVO.setUser_id(id);
		userVO.setUser_pw(pw);
		
		//3. 사용자 인증
		UserVO authenticatedUser = loginService.selectUser(userVO);
		if(null!=authenticatedUser.getUser_name() && authenticatedUser !=null) {
			System.out.println("로그인 후 메인 페이지로 이동");
			return "redirect:/main";
		}else {
			System.out.println("로그인 화면으로 이동");
			return "login";			
		}

	}
	
	private boolean isValidInput(String id, String pw) {
		
		return true;
	}



}


