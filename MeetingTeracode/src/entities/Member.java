package entities;

import java.util.Date;
import java.util.ArrayList;

public class Member{

	private String DNI;
	private String Name;
	private ArrayList<Meeting> meetingsBooked;
	
	
	public Meeting createMeeting(String room,Date date, int duration) {
		if((duration< Meeting.MIN_TIME_MEETING) || (duration > Meeting.MAX_TIME_MEETING) ) {
			return null;
		}	
		if(!this.isAvailable(date, duration)) {
			return null;
		}
		Meeting newMeeting =  new Meeting(this, room, date, duration);
		meetingsBooked.add(newMeeting);
		return new Meeting(this, room, date, duration);
	}
	
	public boolean addToMeeting(Meeting m) {
		if(this.isAvailable(m.getDate(), m.getDuration())) {
			m.addMemberToMeeting(this);
			meetingsBooked.add(m);
		}
		return false;
	}
	
	public boolean isAvailable(Date newDate, int duration) {
		Date newDateEnd = new Date(newDate.getTime()+ duration*60*1000);
		for(Meeting m : meetingsBooked) {
			Date dateEnd =	new Date(m.getDate().getTime()+ m.getDuration()*60*1000);
			if((newDate.before(dateEnd))  &&  (newDateEnd.after(m.getDate()))){
				return false;
			}
		}
		return true;
	}
	
	public boolean addMemberToMeeting(Member member, Meeting meeting) {
		if(meeting.getOwner()!=this) {
			return false;
		}
		return member.addToMeeting(meeting);
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public ArrayList<Meeting> getMeetingsBooked() {
		return meetingsBooked;
	}
	 
	
}
