package com.goaltech.login.service;

import com.goaltech.login.vo.UserVO;

public interface LoginService {

	/* 회원가입 */
	public int insertUser(UserVO user) throws Exception;

	/* 로그인 */
	public UserVO userLogin(UserVO user) throws Exception;

	/* 로그아웃 */
	public void userLogout(UserVO user) throws Exception;
}
