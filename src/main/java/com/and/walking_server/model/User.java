package com.and.walking_server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User{
   
    private String password;
    private String userId;
    private String nickname;
    private String email;
}