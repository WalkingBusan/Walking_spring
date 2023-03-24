package com.and.walking_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.and.walking_server.model.User;
import com.and.walking_server.service.UserService;

@RestController
@RequestMapping("/walking/user/")
public class UserController {
	

	@Autowired
	UserService userService;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping("join")
	public User doJoin(@RequestBody User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		System.out.println("user 값 : "+ user);
		userService.doInsertUser(user);
		System.out.println("=======================join 수행 후================123");
		return user;
	}
	
	@GetMapping("oneUser")
	public User doGetOneUser(@RequestParam("email") String email) {
		User user = userService.doGetOneUser(email);
		System.out.println("oneUser=====doGetOneUser==============="+user);
		return user;
	}
	

}
