/**
 * 
 */
package com.event.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.system.model.Attendee;
import com.event.system.service.AttendeeService;

/**
 * @author Vikas Siva Ravindran
 *
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", maxAge = 3600)
public class AttendeeController {

	@Autowired
	private AttendeeService attendeeService;
	
	@GetMapping(value="/attendees" , produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Attendee> getAttendees(){
		return attendeeService.getListofAttendees();	
	}
		
	
}
