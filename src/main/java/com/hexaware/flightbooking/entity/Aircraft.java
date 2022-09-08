package com.hexaware.flightbooking.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "aircraft_info")
public class Aircraft {
	 @Id
	    @GeneratedValue
	    private long aircraftId;
	    private String manufacturer;
	    private String model;
	    private Integer numberOfSeats;


	    @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name="airflight_fkid", referencedColumnName = "aircraftId")
	    private List<Flight> flights = new ArrayList<>();


	    public Aircraft() {
	    }
	    
	    public Aircraft( String manufacturer, String model, Integer numberOfSeats) {

	        this.manufacturer = manufacturer;
	        this.model = model;
	        this.numberOfSeats = numberOfSeats;
	    }

	    public long getAircraftId() {
	        return aircraftId;
	    }

	    public void setAircraftId(long aircraftId) {
	        this.aircraftId = aircraftId;
	    }

	    public String getManufacturer() {
	        return manufacturer;
	    }

	    public void setManufacturer(String manufacturer) {
	        this.manufacturer = manufacturer;
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public Integer getNumberOfSeats() {
	        return numberOfSeats;
	    }

	    public void setNumberOfSeats(Integer numberOfSeats) {
	        this.numberOfSeats = numberOfSeats;
	    }



	    public List<Flight> getFlights() {
	        return flights;
	    }

	    public void setFlights(List<Flight> flights) {
	        this.flights = flights;
	    }

		public Aircraft(String manufacturer, String model, Integer numberOfSeats, List<Flight> flights) {
			super();
			this.manufacturer = manufacturer;
			this.model = model;
			this.numberOfSeats = numberOfSeats;
			this.flights = flights;
		}

}
