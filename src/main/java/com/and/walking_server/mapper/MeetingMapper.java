package com.and.walking_server.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.and.walking_server.model.Meeting;

@Mapper
public interface MeetingMapper {

	List<Meeting> doGetMeetingList();
	
	Meeting doGetOneMeeting(String title);


}
