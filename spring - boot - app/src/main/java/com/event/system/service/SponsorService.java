/**
 * 
 */
package com.event.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.system.model.Sponsor;
import com.event.system.repository.SponsorRepository;

/**
 * @author Vikas Siva Ravindran
 *
 */
@Service
public class SponsorService {

	@Autowired
	public SponsorRepository sponsorRepo;
	
	public List<Sponsor> getAllSponsors(){
		return sponsorRepo.findAll();
	}
	
	
}
