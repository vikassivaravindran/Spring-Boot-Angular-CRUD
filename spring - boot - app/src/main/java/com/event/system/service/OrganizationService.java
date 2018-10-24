/**
 * 
 */
package com.event.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.system.model.Organizer;
import com.event.system.repository.OrganizerRepository;

/**
 * @author Vikas Siva Ravindran
 *
 */
@Service
public class OrganizationService {
	
	@Autowired
	private OrganizerRepository orgRepo;
	
	public List<Organizer> getAllOrganizers(){
		return orgRepo.findAll();
	}
}
