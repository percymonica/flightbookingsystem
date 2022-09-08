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

import com.hexaware.flightbooking.entity.Passenger;
import com.hexaware.flightbooking.service.IPassengerService;

@RestController
@RequestMapping("/api/passenger")
public class PassengerController {
	
	@Autowired
	private IPassengerService passengerService;
	
	@PostMapping("/addpassenger")
	public ResponseEntity<String> savePassenger(@RequestBody Passenger passenger){
		Passenger rpassenger = passengerService.savePassenger(passenger);
		if(rpassenger!=null)
			return new ResponseEntity<>("Successfully saved passenger", HttpStatus.OK);
		else
			return new ResponseEntity<>("Passenger could not be added", HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/getallpassengers")
	public List<Passenger> getAllPassengers(){
		return passengerService.getAllPassengers();
	}
	
	@GetMapping("/getpassengerbyid/{passengerid}")
	public Passenger getPassengerById(@PathVariable("passengerid") Long passengerId) {
		return passengerService.getPassengerById(passengerId);
	}
	
	@DeleteMapping("/deletepassenger/{passengerid}")
	public void deletePassengerById(@PathVariable("passengerid") Long passengerId){
		 passengerService.deletPassengerById(passengerId);
	}

}
