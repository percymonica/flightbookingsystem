package com.hexaware.flightbooking.repository;

import com.hexaware.flightbooking.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {
	
}
