package com.goaltech.login.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goaltech.login.dao.LoginDAO;
import com.goaltech.login.mapper.UserMapper;
import com.goaltech.login.vo.UserVO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDAO loginDAO;
	@Resource(name = "userMapper")
	private UserMapper userMapper;
	
	
	
	
	@Override
	public int insertUser(UserVO user) throws Exception {
		int result;
		result = userMapper.insertMember(userVO);
		return result;
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
