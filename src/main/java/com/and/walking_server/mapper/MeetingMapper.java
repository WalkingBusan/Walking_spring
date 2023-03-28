package com.and.walking_server.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.and.walking_server.model.Meeting;
import com.and.walking_server.model.Userinmeeting;

@Mapper
public interface MeetingMapper {

	List<Meeting> doGetMeetingList();
	
	Meeting doGetOneMeeting(String title);
	
	void doInsertMeeting(Meeting meeting);
	
	void doInsertUserinmeeting(Meeting meeting);
	
	void doInsertUserinmeeting2(Userinmeeting userinmeeting);

}
