package com.goaltech.login.service;

import com.goaltech.login.vo.UserVO;

public interface LoginService {

	/* ȸ������ */
	public int insertUser(UserVO user) throws Exception;

	/* �α��� */
	public UserVO userLogin(UserVO user) throws Exception;

	/* �α׾ƿ� */
	public void userLogout(UserVO user) throws Exception;
}
