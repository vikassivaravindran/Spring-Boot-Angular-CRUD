/**
 * 
 */
package com.event.system.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Vikas Siva Ravindran
 *
 */
@Entity
@Table(name="event",schema="epms_project_team_27")
public class Event implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int Event_id;

	private String Event_Name;

	private String Event_Details;

	private String Organizer_Id;

	private String Volunteer_Id;

	private String Sponsor_Id;

	private Date Event_Date;

	public int getEvent_id() {
		return Event_id;
	}

	public void setEvent_id(int event_id) {
		Event_id = event_id;
	}

	public String getEvent_Name() {
		return Event_Name;
	}

	public void setEvent_Name(String event_Name) {
		Event_Name = event_Name;
	}

	public String getEvent_Details() {
		return Event_Details;
	}

	public void setEvent_Details(String event_Details) {
		Event_Details = event_Details;
	}

	public String getOrganizer_Id() {
		return Organizer_Id;
	}

	public void setOrganizer_Id(String organizer_Id) {
		Organizer_Id = organizer_Id;
	}

	public String getVolunteer_Id() {
		return Volunteer_Id;
	}

	public void setVolunteer_Id(String volunteer_Id) {
		Volunteer_Id = volunteer_Id;
	}

	public String getSponsor_Id() {
		return Sponsor_Id;
	}

	public void setSponsor_Id(String sponsor_Id) {
		Sponsor_Id = sponsor_Id;
	}

	public Date getEvent_Date() {
		return Event_Date;
	}

	public void setEvent_Date(Date event_Date) {
		Event_Date = event_Date;
	}

	public Event(int event_id, String event_Name, String event_Details, String organizer_Id, String volunteer_Id,
			String sponsor_Id, Date event_Date) {
		super();
		Event_id = event_id;
		Event_Name = event_Name;
		Event_Details = event_Details;
		Organizer_Id = organizer_Id;
		Volunteer_Id = volunteer_Id;
		Sponsor_Id = sponsor_Id;
		Event_Date = event_Date;
	}

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Event [Event_id=" + Event_id + ", " + (Event_Name != null ? "Event_Name=" + Event_Name + ", " : "")
				+ (Event_Details != null ? "Event_Details=" + Event_Details + ", " : "")
				+ (Organizer_Id != null ? "Organizer_Id=" + Organizer_Id + ", " : "")
				+ (Volunteer_Id != null ? "Volunteer_Id=" + Volunteer_Id + ", " : "")
				+ (Sponsor_Id != null ? "Sponsor_Id=" + Sponsor_Id + ", " : "")
				+ (Event_Date != null ? "Event_Date=" + Event_Date : "") + "]";
	}

}
