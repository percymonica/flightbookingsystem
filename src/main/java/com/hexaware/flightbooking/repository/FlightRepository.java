package com.hexaware.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.flightbooking.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

}