/**
 * 
 */
package com.event.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.system.model.Volunteer;

/**
 * @author Vikas Siva Ravindran
 *
 */

public interface VolunteerRepository extends JpaRepository<Volunteer, String>{

	List<Volunteer> findAll();
	
}
