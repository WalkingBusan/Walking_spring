package com.and.walking_server.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meeting {
	
	private int meeting_id;
	private String meeting_title;
	private String meeting_content;
	private Long start_date;
	private Long end_date;
	private int user_id;
//    var meeting_img:String
}
