package com.hexaware.flightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.flightbooking.entity.Flight;
import com.hexaware.flightbooking.repository.FlightRepository;

@Service
public class FlightServiceImpl implements IFlightService{
	

	@Autowired
	private FlightRepository flightrepository;
	
	@Override
	public List<Flight> getAllFlights() {
		return flightrepository.findAll();
		}

	@Override
	public Flight getFlightById(long flightId) {
		return flightrepository.findById(flightId).orElse(null);
	}

	@Override
	public Flight saveFlight(Flight flight) {
		return flightrepository.save(flight);
	}

	@Override
	public void deleteFlightById(long flightId) {
		flightrepository.deleteById(flightId);
		
	}

}