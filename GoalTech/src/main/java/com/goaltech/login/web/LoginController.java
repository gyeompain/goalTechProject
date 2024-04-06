package com.goaltech.login.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goaltech.login.vo.UserVO;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/join", method = { RequestMethod.GET, RequestMethod.POST})
	public String showJoinDetail(HttpServletRequest request, ModelMap model) throws Exception {
		
		return "com.login.join";
		
	}
	
	

	

}
