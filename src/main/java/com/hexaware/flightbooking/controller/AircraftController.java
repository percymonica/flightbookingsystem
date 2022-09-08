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

import com.hexaware.flightbooking.entity.Aircraft;
import com.hexaware.flightbooking.service.IAircraftService;

@RestController
@RequestMapping("/api/aircraft")
public class AircraftController {
	
	@Autowired
	private IAircraftService aircraftService;
	
	@PostMapping("/addaircraft")
	public ResponseEntity<String> saveAircraft(@RequestBody Aircraft aircraft){
		Aircraft raircraft = aircraftService.saveAircraft(aircraft);
		if(raircraft!=null)
			return new ResponseEntity<>("Successfullu saved aircraft", HttpStatus.OK);
		else
			return new ResponseEntity<>("Aircraft could not be added", HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/getallaircrafts")
	public List<Aircraft> getAllAircrafts(){
		return aircraftService.getAllAircrafts();
	}
	
	@GetMapping("/getaircraftbyid/{aircraftid}")
	public Aircraft getAircraftById(@PathVariable("aircraftid") Long aircraftId) {
		return aircraftService.getAircraftById(aircraftId);
	}
	
	@DeleteMapping("/deleteaircraft/{aircraftid}")
	public void deleteAircraftById(@PathVariable("aircraftid") Long aircraftId){
		 aircraftService.deleteAircraftById(aircraftId);
	}
	
	

}
