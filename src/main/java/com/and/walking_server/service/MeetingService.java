package com.and.walking_server.service;

import java.util.List;

import com.and.walking_server.model.Meeting;
import com.and.walking_server.model.Userinmeeting;

public interface MeetingService {
	
	public List<Meeting> doGetMeetingList();

	public void doInsertMeeting(Meeting meeting);
//
	public Meeting doGetOneMeeting(String title);
	
	public void doInsertUserinmeeting(Userinmeeting userinmeeting);
//
//	public List<Trip> doGetMyTripList(String userName);
}
