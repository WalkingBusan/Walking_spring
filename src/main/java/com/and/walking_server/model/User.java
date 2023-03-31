package com.and.walking_server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User{
   
	private int user_id ;
	private String email;
    private String password;
    private String nickname;
    private String profile_id;
    
}