package com.and.walking_server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.and.walking_server.mapper.MeetingMapper;
import com.and.walking_server.model.Meeting;

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
}
