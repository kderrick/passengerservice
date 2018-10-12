package com.kyle.restwsclient;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.kyle.restwsclient.model.Passenger;


@Path("/passengerservice")
@Produces("application/xml")
@Consumes("application/xml, application/x-www-form-urlencoded")
public interface PassengerService {
	
	
		@Path("/passengers")
		@GET
		List<Passenger> getPassengers(int start, int size);
		
		@Path("/passengers")
		@POST
		void addPassenger(@FormParam("firstName")String firstName, @FormParam("lastName")String lastName);
}
