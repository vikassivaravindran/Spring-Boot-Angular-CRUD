/**
 * 
 */
package com.event.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.system.model.Attendee;

/**
 * @author Vikas Siva Ravindran
 *
 */
public interface AttendeeRepository extends JpaRepository<Attendee, String>{
	
	List<Attendee> findAll();
}
