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

import com.event.system.model.Organizer;
import com.event.system.service.OrganizationService;

/**
 * @author Vikas Siva Ravindran
 *
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", maxAge = 3600)
public class OrganizerController {

	@Autowired
	private OrganizationService orgService;
	
	@GetMapping(value="/organizers", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Organizer> getOrganizers(){
		return orgService.getAllOrganizers();
	}
	
}
