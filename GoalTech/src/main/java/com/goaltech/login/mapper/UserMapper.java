package com.goaltech.login.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.goaltech.login.vo.UserVO;

@Mapper
public interface UserMapper {
	
	public void insertUser(UserVO userVO);
	
	public void insertUserRole(UserVO userVO);
	
	public UserVO selectUser(UserVO userVO);
	
	public String selectPassword(UserVO userVO);
}
