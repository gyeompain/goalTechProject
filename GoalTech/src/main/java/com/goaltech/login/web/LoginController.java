package com.goaltech.login.web;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.goaltech.login.service.LoginService;
import com.goaltech.login.vo.UserVO;

@Controller
public class LoginController {
	
	//@Autowired라는 어노테이션으로 서비스 등록
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/join", method = { RequestMethod.GET, RequestMethod.POST})
	public String showJoinDetail(HttpServletRequest request, ModelMap model) throws Exception {
		
		return "com.login.join";
		
	}
	
	//@RequestMapping = 해당 요청값을 매핑해주는 어노테이션
	@RequestMapping(value = "insertMember.do")
	public void insertMember(HttpServletRequest request, HttpServletResponse response) throws Exception{

				
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
		loginService.insertUser(vo);

	}
	
	

	

}


