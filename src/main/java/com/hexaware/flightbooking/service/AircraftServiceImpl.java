package com.hexaware.flightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.flightbooking.entity.Aircraft;
import com.hexaware.flightbooking.repository.AircraftRepository;

@Service
public class AircraftServiceImpl implements IAircraftService {
	
	@Autowired
	private AircraftRepository aircraftRepository;
	
	@Override
	public List<Aircraft> getAllAircrafts() {
		return aircraftRepository.findAll();
	}

	@Override
	public Aircraft getAircraftById(Long aircraftId) {
		return aircraftRepository.findById(aircraftId).orElse(null);
	}

	@Override
	public Aircraft saveAircraft(Aircraft aircraft) {
		if(aircraft==null) throw new IllegalArgumentException();
		return aircraftRepository.save(aircraft);
	}

	@Override
	public void deleteAircraftById(Long aircraftId) {
		aircraftRepository.deleteById(aircraftId);
		
	}

}
