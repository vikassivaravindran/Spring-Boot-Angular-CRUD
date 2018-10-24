/**
 * 
 */
package com.event.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.system.model.Volunteer;
import com.event.system.repository.VolunteerRepository;

/**
 * @author Vikas Siva Ravindran
 *
 */
@Service
public class VolunteerService {

	@Autowired
	public VolunteerRepository volunteerRepo;
	
	public List<Volunteer> getVolunteers(){
		return volunteerRepo.findAll();
	}
}
