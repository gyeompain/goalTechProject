package com.goaltech.login.service;
import com.goaltech.login.vo.UserVO;

public interface LoginService {

	/* ȸ������ */
	public void insertUser(UserVO user) throws Exception;
	
	/* �α��� */
	public UserVO selectUser(UserVO user) throws Exception;

	/* �α׾ƿ� */
	public void logoutUser(UserVO user) throws Exception;
	
	/* ��ȣȭ ��й�ȣ �������� */
	public String selectPassword(String password) throws Exception;
}
