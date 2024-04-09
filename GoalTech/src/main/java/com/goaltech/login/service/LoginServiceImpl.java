package com.goaltech.login.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goaltech.login.dao.LoginDAO;
import com.goaltech.login.mapper.UserMapper;
import com.goaltech.login.vo.UserVO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Resource(name = "userMapper")
	private UserMapper userMapper;
	
	
	@Override
	public void insertUser(UserVO userVO) throws Exception {
		// 현재 날짜 구하기
		LocalDate now = LocalDate.now();
		// 포맷 정의
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		// 포맷 적용
		String formatedNow = now.format(formatter);
		
		String joindate = formatedNow;
		String updated_at = formatedNow;
		String user_status = "1";
		String role_code = "2"; //역할코드 1.관리자 2. 사용자
		
		userVO.setJoindate(joindate);
		userVO.setUpdated_at(updated_at);
		userVO.setUser_status(user_status);
		userVO.setRole_code(role_code);
		
		userMapper.insertMember(userVO);

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
