package com.hexaware.flightbooking.service;

import com.hexaware.flightbooking.entity.Aircraft;

import java.util.List;

public interface IAircraftService {
	public List<Aircraft> getAllAircrafts();
	public Aircraft getAircraftById(Long aircraftId);
	public Aircraft saveAircraft(Aircraft aircraft);
	public void deleteAircraftById(Long aircraftId);

}
