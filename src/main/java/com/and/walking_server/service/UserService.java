package com.and.walking_server.service;

import com.and.walking_server.model.User;

public interface UserService {

	public User doGetOneUser(String email);
	
	public void doInsertUser(User user);
}
