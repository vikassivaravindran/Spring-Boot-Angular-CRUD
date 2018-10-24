/**
 * 
 */
package com.event.system.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Vikas Siva Ravindran
 *
 */
@Entity
@Table(name="attendee",schema="epms_project_team_27")
public class Attendee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String Attendee_Id;
	
	private String First_Name;
	
	private String Last_Name;
	
	private String email;
	
	private String Password;
	
	private String PhoneNumber;
	
	private int Event_Id;

	public String getAttendee_Id() {
		return Attendee_Id;
	}

	public Attendee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setAttendee_Id(String attendee_Id) {
		Attendee_Id = attendee_Id;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String First_Name) {
		First_Name = First_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String Last_Name) {
		Last_Name = Last_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public int getEvent_Id() {
		return Event_Id;
	}

	public void setEvent_Id(int event_Id) {
		Event_Id = event_Id;
	}
	
	public Attendee(String attendee_Id, String First_Name, String Last_Name, String email, String password,
		String phoneNumber, int event_Id) {
		super();
		Attendee_Id = attendee_Id;
		First_Name = First_Name;
		Last_Name = Last_Name;
		this.email = email;
		Password = password;
		PhoneNumber = phoneNumber;
		Event_Id = event_Id;
	}

	@Override
	public String toString() {
		return "Attendee [" + (Attendee_Id != null ? "Attendee_Id=" + Attendee_Id + ", " : "")
				+ (First_Name != null ? "First_Name=" + First_Name + ", " : "")
				+ (Last_Name != null ? "Last_Name=" + Last_Name + ", " : "")
				+ (email != null ? "email=" + email + ", " : "")
				+ (Password != null ? "Password=" + Password + ", " : "")
				+ (PhoneNumber != null ? "PhoneNumber=" + PhoneNumber + ", " : "") + "Event_Id=" + Event_Id + "]";
	}

	
}
