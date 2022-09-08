package com.hexaware.flightbooking.service;

import com.hexaware.flightbooking.entity.Flight;
import java.util.List;

public interface IFlightService {
	
	public List<Flight> getAllFlights();
    public Flight getFlightById(long flightId);
    public Flight saveFlight(Flight flight);
    public void deleteFlightById(long flightId);

}
