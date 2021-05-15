package ie.nuig.cs.ct545rest;

import java.util.ArrayList;
import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.*;


// Specifiying the url path /bookingservice
@Path("/bookingservice")
@Singleton
public class BookingService {

	Bookings list;
	Customer cust1 = new Customer("Ethan", "Kane", "Sycamore Lodge");
	Vehicle vehc1 = new Vehicle("04-G-2089", "VW", "Black");

	 // Overloaded constructor instantiating Bookings class and instantiating BookingDetail object	
	public BookingService() {
		list = new Bookings();
		list.setbList(new ArrayList<BookingDetails>());
		list.getbList()
		.add(new BookingDetails(cust1, vehc1,"10/3/20", "17/03/20",0));
	}
	
	//Get request annotation returning BookingDetails list and status
	@GET
	@Produces(MediaType.APPLICATION_JSON)//Method called if json requested
	public Response getAllBookings() {
		return Response.ok(list).status(200).build();
	}

	//Post annotation for adding to arraylist in json format with status 201 ok response
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addBookingDetails(BookingDetails bd) {
		list.getbList().add(bd);
		return Response.ok(bd).status(201).build();
	}


	//Get annotation for specific object corresponding to id path paramater
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response getBookingDetails(@PathParam("id") int id) {
		for (BookingDetails booking : list.getbList()) {
			if (booking.getId() == id) {
				return Response.ok(booking).status(200).build();
			}
		}
		return Response.status(Status.NOT_FOUND).build();//Returning 404 error if no id match
	}

	// Delete annotation remove method called on arraylist by specific id paramater
		@DELETE
		@Path("/{id}")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response deleteBooking(BookingDetails bd, @PathParam("id") int id) {
			for (BookingDetails e : list.getbList()) {
				if (e.getId() == id) {
					list.getbList().remove(bd);
					return Response.ok(200).status(200).build();
				}
			}
			return Response.status(Status.NOT_FOUND).build();
		}
		
	//Put to update specific object with correct id paramater, updates each variable by there set methods
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateBooking(BookingDetails bd, @PathParam("id") int id) {
		for (BookingDetails e : list.getbList()) {
			if (e.getId() == id) {
				e.setCustomer(bd.getCustomer());
				e.setVehicle(bd.getVehicle());
				e.setStartDate(bd.getStartDate());
				e.setEndDate(bd.getEndDate());
				return Response.ok(e).status(200).build();
			}
		}
		return Response.status(Status.NOT_FOUND).status(404).build();
	}


}
