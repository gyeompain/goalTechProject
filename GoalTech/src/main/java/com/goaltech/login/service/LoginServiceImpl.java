package com.goaltech.login.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goaltech.login.mapper.UserMapper;
import com.goaltech.login.vo.UserVO;

@Service("loginService")
@MapperScan("com.goaltech.login.mapper")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserMapper userMapper;

		
	@Override
	public void insertUser(UserVO userVO) throws Exception {

		String user_status = "1"; // ���� ������..?
		String role_code = "2"; //�����ڵ� 1.������ 2. �����

		userVO.setUser_status(user_status);
		userVO.setRole_code(role_code);
		
		//userMapper.insertUserRole(userVO);
		userMapper.insertUser(userVO);


	}

	@Override
	public UserVO selectUser(UserVO user) throws Exception {
		
		UserVO userVO;
		return userVO;

	}

	@Override
	public void logoutUser(UserVO user) throws Exception {

	}

}
