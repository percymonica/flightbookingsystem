package com.hexaware.flightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.flightbooking.entity.Passenger;
import com.hexaware.flightbooking.repository.PassengerRepository;

@Service
public class PassengerServiceImpl implements IPassengerService {
	private PassengerRepository passengerRepository;
	
	@Autowired
	public PassengerServiceImpl(PassengerRepository passengerRepository) {
		this.passengerRepository = passengerRepository;
	}
	
	@Override
	public List<Passenger> getAllPassengers() {
		return passengerRepository.findAll();
	}

	@Override
	public Passenger getPassengerById(Long passengerId) {
		return passengerRepository.findById(passengerId).orElse(null);
	}

	@Override
	public Passenger savePassenger(Passenger passenger) {
		return passengerRepository.save(passenger);
	}

	@Override
	public void deletPassengerById(Long passengerId) {
		passengerRepository.deleteById(passengerId);
	}

}
