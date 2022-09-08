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

import com.hexaware.flightbooking.entity.Airport;
import com.hexaware.flightbooking.service.IAirportService;

@RestController
@RequestMapping("/api/airport")
public class AirportController {
	
	@Autowired
	private IAirportService airportService;
	
	@PostMapping("/addairport")
	public ResponseEntity<String> saveAirport(@RequestBody Airport airport){
		Airport rairport = airportService.saveAirport(airport);
		if(rairport!=null)
			return new ResponseEntity<>("Successfully saved airport", HttpStatus.OK);
		else
			return new ResponseEntity<>("Airport could not be added", HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/getallairports")
	public List<Airport> getAllAirports(){
		return airportService.getAllAirPorts();
	}
	
	@GetMapping("/getairportbyid/{airportid}")
	public Airport getAirportById(@PathVariable("airportid") Integer airportId) {
		return airportService.getAirportById(airportId);
	}
	
	@DeleteMapping("/deleteairport/{airportid}")
	public void deleteAirportById(@PathVariable("airportid") Integer airportId){
		 airportService.deleteAirport(airportId);
	}

}
