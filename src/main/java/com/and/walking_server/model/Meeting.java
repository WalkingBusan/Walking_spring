package com.and.walking_server.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meeting {
	
	
	private String meeting_title;
	private String meeting_content;
	private String start_date;
	private String end_date;
	private String email;
	private String meeting_place;
//    var meeting_img:String
}

