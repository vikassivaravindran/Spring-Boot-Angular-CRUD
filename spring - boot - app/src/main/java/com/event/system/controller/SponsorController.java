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

import com.event.system.model.Sponsor;
import com.event.system.service.SponsorService;

/**
 * @author Vikas Siva Ravindran
 *
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", maxAge = 3600)
public class SponsorController {

	@Autowired
	private SponsorService sponsorService;

	@GetMapping(value="/sponsors" , produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Sponsor> getSponsors() {
		return sponsorService.getAllSponsors();
	}

}
