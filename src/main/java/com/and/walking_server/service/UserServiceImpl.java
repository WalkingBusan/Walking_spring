package com.and.walking_server.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.and.walking_server.mapper.UserMapper;
import com.and.walking_server.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User doGetOneUser(String email) {
		return userMapper.doGetOneUser(email);
	}

	@Override
	public void doInsertUser(User user) {
		userMapper.doInsertUser(user);
	}

}
