package com.goaltech.login.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.goaltech.login.vo.UserVO;

@Mapper
public interface UserMapper {
	
	public void insertMember(UserVO userVO);
	
}
