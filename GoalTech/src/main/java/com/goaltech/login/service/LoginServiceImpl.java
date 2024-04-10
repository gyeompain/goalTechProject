package com.goaltech.login.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
		// ���� ��¥ ���ϱ�
		LocalDate now = LocalDate.now();
		// ���� ����
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/mm/dd");
		// ���� ����
		String formatedNow = now.format(formatter);
		
		String joindate = formatedNow;
		String updated_at = formatedNow;
		String user_status = "1"; // ���� ������..?
		String role_code = "2"; //�����ڵ� 1.������ 2. �����
		
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
