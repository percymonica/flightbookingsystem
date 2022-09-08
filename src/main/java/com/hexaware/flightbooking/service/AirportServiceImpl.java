package com.hexaware.flightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.flightbooking.entity.Airport;
import com.hexaware.flightbooking.repository.AirportRepository;

@Service
public class AirportServiceImpl implements IAirportService{
	private AirportRepository airportRepository;

	@Autowired
    public AirportServiceImpl(AirportRepository airportRepository){
        this.airportRepository = airportRepository;
    }
	
	@Override
	public List<Airport> getAllAirPorts() {
		return airportRepository.findAll();
	}

	@Override
	public Airport getAirportById(Integer airportId) {
		return airportRepository.findById(airportId).orElse(null);
	}

	@Override
	public Airport saveAirport(Airport airport) {
		return airportRepository.save(airport);
	}

	@Override
	public void deleteAirport(Integer airportId) {
		airportRepository.deleteById(airportId);	
	}

}
