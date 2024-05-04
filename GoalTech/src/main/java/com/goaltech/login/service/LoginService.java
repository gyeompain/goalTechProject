package com.goaltech.login.service;
import com.goaltech.login.vo.UserVO;

public interface LoginService {

	/* 회원가입 */
	public void insertUser(UserVO user) throws Exception;
	
	/* 로그인 */
	public UserVO selectUser(UserVO user) throws Exception;

	/* 로그아웃 */
	public void logoutUser(UserVO user) throws Exception;
	
	/* 암호화 비밀번호 가져오기 */
	public String selectPassword(String password) throws Exception;
}
