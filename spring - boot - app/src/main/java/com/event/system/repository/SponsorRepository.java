package com.event.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.system.model.Sponsor;

public interface SponsorRepository extends JpaRepository<Sponsor, String>{

	List<Sponsor> findAll();
	
}
