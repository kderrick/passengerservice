package com.kyle.restwsclient;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.stereotype.Service;

import com.kyle.restwsclient.model.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService {
	
	List<Passenger> passengers = new ArrayList<>();
	int currentId = 123;

	@Override
	public List<Passenger> getPassengers(@QueryParam("start") int start, @QueryParam("size") int size) {
		System.out.println(start);
		System.out.println(size);
		return null;
	}

	@Override
	public void addPassenger(String firstName, String lastName, String agent) {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(agent);
	}

}
