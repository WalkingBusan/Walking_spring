package com.and.walking_server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.and.walking_server.mapper.MeetingMapper;
import com.and.walking_server.model.Meeting;
import com.and.walking_server.model.Userinmeeting;


@Transactional
@Service
public class MeetingServiceImpl implements MeetingService {

	@Autowired
	private MeetingMapper meetingMapper;
	
	@Override
	public List<Meeting> doGetMeetingList() {
		return meetingMapper.doGetMeetingList();
	}

	@Override
	public Meeting doGetOneMeeting(String title) {
		return meetingMapper.doGetOneMeeting(title);
	}
	
	
	@Override
	public void doInsertMeeting(Meeting meeting) {
		meetingMapper.doInsertMeeting(meeting);
		meetingMapper.doInsertUserinmeeting(meeting);
	}
	
	@Override
	public void doInsertUserinmeeting(Userinmeeting userinmeeting) {
		meetingMapper.doInsertUserinmeeting2(userinmeeting);
		
	}
	
	
}
