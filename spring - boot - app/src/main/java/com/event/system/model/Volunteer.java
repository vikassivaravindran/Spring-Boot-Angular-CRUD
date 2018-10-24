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
@Table(name="Volunteer",schema="epms_project_team_27")
public class Volunteer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String Volunteer_Id;
	
	private String FirstName;
	
	private String LastName;
	
	private String Email;
	
	private String PhoneNumber;

	public String getVolunteer_Id() {
		return Volunteer_Id;
	}

	public void setVolunteer_Id(String volunteer_Id) {
		Volunteer_Id = volunteer_Id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public Volunteer(String volunteer_Id, String firstName, String lastName, String email, String phoneNumber) {
		super();
		Volunteer_Id = volunteer_Id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		PhoneNumber = phoneNumber;
	}

	public Volunteer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Volunteer [Volunteer_Id=" + Volunteer_Id + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Email=" + Email + ", PhoneNumber=" + PhoneNumber + "]";
	}

}
