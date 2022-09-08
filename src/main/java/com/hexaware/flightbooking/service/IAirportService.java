package com.hexaware.flightbooking.service;

import com.hexaware.flightbooking.entity.Airport;

import java.util.List;

public interface IAirportService {
	public List<Airport> getAllAirPorts();
	public Airport getAirportById(Integer airportId);
	public Airport saveAirport(Airport airport);
	public void deleteAirport(Integer airportId);

}
