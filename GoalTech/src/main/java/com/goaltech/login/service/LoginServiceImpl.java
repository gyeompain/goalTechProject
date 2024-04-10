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

		String user_status = "1"; // 무슨 뜻이죠..?
		String role_code = "2"; //역할코드 1.관리자 2. 사용자

		userVO.setUser_status(user_status);
		userVO.setRole_code(role_code);
		
		//userMapper.insertUserRole(userVO);
		userMapper.insertUser(userVO);


	}

	@Override
	public UserVO userLogin(UserVO user) throws Exception {
		return null;
	}

	@Override
	public void userLogout(UserVO user) throws Exception {

	}

}
