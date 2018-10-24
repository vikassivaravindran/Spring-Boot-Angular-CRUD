/**
 * 
 */
package com.event.system.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Vikas Siva Ravindran
 *
 */
@Entity
@Table(name="organizer",schema="epms_project_team_27")
public class Organizer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String Organizer_Id;
	
	
	private String FirstName;


	private String LastName;

	
	private String Email;

	
	private String Password;


	private String PhoneNumber;

	public String getOrganizer_Id() {
		return Organizer_Id;
	}

	public void setOrganizer_Id(String organizer_Id) {
		Organizer_Id = organizer_Id;
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

	public Organizer(String organizer_Id, String firstName, String lastName, String email, String password,
			String phoneNumber) {
		super();
		Organizer_Id = organizer_Id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Password = password;
		PhoneNumber = phoneNumber;
	}

	public Organizer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Organizer [" + (Organizer_Id != null ? "Organizer_Id=" + Organizer_Id + ", " : "")
				+ (FirstName != null ? "FirstName=" + FirstName + ", " : "")
				+ (LastName != null ? "LastName=" + LastName + ", " : "")
				+ (Email != null ? "Email=" + Email + ", " : "")
				+ (Password != null ? "Password=" + Password + ", " : "")
				+ (PhoneNumber != null ? "PhoneNumber=" + PhoneNumber : "") + "]";
	}

}
