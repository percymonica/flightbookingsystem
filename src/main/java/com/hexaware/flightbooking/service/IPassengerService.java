package com.hexaware.flightbooking.service;

import java.util.List;

import com.hexaware.flightbooking.entity.Passenger;

public interface IPassengerService {
	public List<Passenger> getAllPassengers();
	public Passenger getPassengerById(Long passengerId);
	public Passenger savePassenger(Passenger passenger);
	public void deletPassengerById(Long passengerId);

}
