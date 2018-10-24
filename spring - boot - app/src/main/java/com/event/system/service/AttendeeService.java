/**
 * 
 */
package com.event.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.system.model.Attendee;
import com.event.system.repository.AttendeeRepository;

/**
 * @author Vikas Siva Ravindran
 *
 */
@Service
public class AttendeeService {
	
	@Autowired
	private AttendeeRepository attendees;
	
	public List<Attendee> getListofAttendees(){
		return attendees.findAll(); 
	}
}
