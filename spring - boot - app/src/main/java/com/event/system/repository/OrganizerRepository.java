/**
 * 
 */
package com.event.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.system.model.Organizer;

/**
 * @author Vikas Siva Ravindran
 *
 */
public interface OrganizerRepository extends JpaRepository<Organizer, String>{

	List<Organizer> findAll();
	
}
