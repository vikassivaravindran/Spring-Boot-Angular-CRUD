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
@Table(name="sponsor",schema="epms_project_team_27")
public class Sponsor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String Sponsor_Id;

	private String Organization_Name;

	private String Point_Of_Contact;

	private String Email;

	private String PhoneNumber;

	public String getSponsor_Id() {
		return Sponsor_Id;
	}

	public void setSponsor_Id(String sponsor_Id) {
		Sponsor_Id = sponsor_Id;
	}

	public String getOrganization_Name() {
		return Organization_Name;
	}

	public void setOrganization_Name(String organization_Name) {
		Organization_Name = organization_Name;
	}

	public String getPoint_Of_Contact() {
		return Point_Of_Contact;
	}

	public void setPoint_Of_Contact(String point_Of_Contact) {
		Point_Of_Contact = point_Of_Contact;
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

	public Sponsor(String sponsor_Id, String organization_Name, String point_Of_Contact, String email,
			String phoneNumber) {
		super();
		Sponsor_Id = sponsor_Id;
		Organization_Name = organization_Name;
		Point_Of_Contact = point_Of_Contact;
		Email = email;
		PhoneNumber = phoneNumber;
	}

	public Sponsor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sponsor [" + (Sponsor_Id != null ? "Sponsor_Id=" + Sponsor_Id + ", " : "")
				+ (Organization_Name != null ? "Organization_Name=" + Organization_Name + ", " : "")
				+ (Point_Of_Contact != null ? "Point_Of_Contact=" + Point_Of_Contact + ", " : "")
				+ (Email != null ? "Email=" + Email + ", " : "")
				+ (PhoneNumber != null ? "PhoneNumber=" + PhoneNumber : "") + "]";
	}

}
