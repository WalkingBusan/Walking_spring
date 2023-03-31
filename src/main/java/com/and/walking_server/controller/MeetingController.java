package com.and.walking_server.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.and.walking_server.model.Meeting;
import com.and.walking_server.model.User;
import com.and.walking_server.model.Userinmeeting;
import com.and.walking_server.service.MeetingService;

@RestController
@RequestMapping("/walking/meeting/")
public class MeetingController {

	@Autowired
	private MeetingService meetingService;
	
	@GetMapping("list")
	public Map<String,List<Meeting>> doGetMeetingList() {
		Map<String,List<Meeting>> map = new HashMap<String,List<Meeting>>();
		map.put("meetings", meetingService.doGetMeetingList());
		System.out.println("체크222");
		return map;
	}
	
	@GetMapping("oneMeeting")
	public Meeting doGetOneMeeting(@RequestParam("title") String title) {
		Meeting meeting = meetingService.doGetOneMeeting(title);
		
		return meeting;
	}
	
	
	
	
	@PostMapping("insert")
	public Meeting doInsertTrip(@RequestBody Meeting meeting) {
		if(!meeting.getMeeting_title().equals("")) {
			meetingService.doInsertMeeting(meeting);
		}
	
		
		return meeting;
	}
	
	@PostMapping("insertuserinmeeting")
	public Userinmeeting doInsertTrip(@RequestBody Userinmeeting userinmeeting) {
		if(!userinmeeting.getMeeting_id().equals("")) {
			meetingService.doInsertUserinmeeting(userinmeeting);
		}
	
		
		return userinmeeting;
	}
	
	
	@GetMapping("oneUserinmeeting")
	public Userinmeeting doGetOneUserinmeeting(@RequestParam("userinmeeting_val") String userinmeeting_val) {
		Userinmeeting userinmeeting = meetingService.doGetOneUserinmeeting(userinmeeting_val);
		
		return userinmeeting;
	}
	
	@GetMapping("chatMemberList")
	public List<User> doGetChatMemberList(@RequestParam("meeting_id") int meeting_id) {
		List<User> memberList = meetingService.doGetChatMemberList(meeting_id);
		
		return memberList;
	}
	
	
	
}
