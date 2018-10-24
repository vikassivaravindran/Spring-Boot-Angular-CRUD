/**
 * 
 */
package com.event.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.event.system.model.Event;
import com.event.system.repository.EventRepository;

/**
 * @author Vikas Siva Ravindran
 *
 */
@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;

	public List<Event> getAttendeesList(){
		return eventRepository.findAll();
	}
	
}
