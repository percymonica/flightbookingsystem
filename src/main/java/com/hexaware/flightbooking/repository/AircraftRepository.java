package com.hexaware.flightbooking.repository;

import com.hexaware.flightbooking.entity.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, Long>{
	

}
