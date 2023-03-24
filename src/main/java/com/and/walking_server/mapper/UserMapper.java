package com.and.walking_server.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.and.walking_server.model.User;

@Repository
@Mapper
public interface UserMapper {
	
	public User doGetOneUser(String email);

	public void doInsertUser(User user);

}
