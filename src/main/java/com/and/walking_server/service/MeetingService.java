package com.and.walking_server.service;

import java.util.List;

import com.and.walking_server.model.Meeting;

public interface MeetingService {
	
	public List<Meeting> doGetMeetingList();

//	public void doInsertTrip(Trip trip);
//
	public Meeting doGetOneMeeting(String title);
//
//	public List<Trip> doGetMyTripList(String userName);
}
