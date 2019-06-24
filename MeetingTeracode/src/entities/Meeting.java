package entities;

import java.util.Date;
import java.util.ArrayList;

public class Meeting {
	
	public static int MIN_TIME_MEETING = 15;
	public static int MAX_TIME_MEETING = 300;
	
	private ArrayList<Member> members = new ArrayList<Member>();
	private Member owner;
	private String room;
	private Date date;
	private int  duration; // in minutes
	
	
	
	
	public Meeting(Member owner, String room, Date date, int duration) {
		super();
		this.owner = owner;
		this.room = room;
		this.date = date;
		this.duration = duration;
		members.add(owner);
	}

	public void addMemberToMeeting(Member m){
		members.add(m);
	}


	public Member getOwner() {
		return owner;
	}


	public void setOwner(Member owner) {
		this.owner = owner;
	}


	public String getRoom() {
		return room;
	}


	public void setRoom(String room) {
		this.room = room;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public ArrayList<Member> getMembers() {
		return members;
	}
	

	
	
	

}
