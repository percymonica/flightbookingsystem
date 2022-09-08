package com.hexaware.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.flightbooking.entity.Flight;
import com.hexaware.flightbooking.service.IFlightService;

@RestController
@RequestMapping("/api/flight")
public class FlightController {
	
	@Autowired
	private IFlightService flightService;
	
	@PostMapping("/addflight")
	public ResponseEntity<String> saveFlight(@RequestBody Flight flight){
		Flight rflight = flightService.saveFlight(flight);
		if(rflight!=null)
			return new ResponseEntity<>("Successfully added Flight",HttpStatus.OK);
		else
			return new ResponseEntity<>("Could not add Flight",HttpStatus.NOT_FOUND);
		
	}
	
	@GetMapping("/getallflights")
	public List<Flight> getAllFlights(){
		return flightService.getAllFlights();
	}
	
	@GetMapping("/getflightbyid/{fid}")
	public Flight getFlightById(@PathVariable("fid") Long flightId) {
		return flightService.getFlightById(flightId);
	}
	
	@DeleteMapping("/deleteflight/{fid}")
	public void deleteFlightById(@PathVariable("fid") Long flightId) {
		flightService.deleteFlightById(flightId);
	}

	
	
}