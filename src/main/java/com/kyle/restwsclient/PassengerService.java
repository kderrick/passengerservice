package com.kyle.restwsclient;

import java.util.List;

import com.kyle.restwsclient.model.Passenger;

public interface PassengerService {

		List<Passenger> getPassengers();
		
		Passenger addPassenger();
}
