/**
 * 
 */
package com.event.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.event.system.model.Event;

/**
 * @author Vikas Siva Ravindran
 *
 */
@Repository
public interface EventRepository extends JpaRepository<Event,Integer>{

	List<Event> findAll();
	
	
}
