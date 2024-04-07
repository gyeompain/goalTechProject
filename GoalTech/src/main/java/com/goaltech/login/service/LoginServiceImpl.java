package com.goaltech.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goaltech.login.dao.LoginDAO;
import com.goaltech.login.vo.UserVO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDAO loginDAO;
	@Override
	public int insertUser(UserVO user) throws Exception {
		loginDAO.
		return 1;
	}

	@Override
	public UserVO userLogin(UserVO user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void userLogout(UserVO user) throws Exception {
		// TODO Auto-generated method stub

	}

}
