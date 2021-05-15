package ie.nuig.cs.ct545rest;

import java.util.concurrent.atomic.AtomicInteger;

//Booking Details class to create objects to store in arraylist and be used by jersey to map to json
public class BookingDetails {
	
	
	private int id;
	private Customer customer; 
	private Vehicle vehicle; 
	private String startDate;
	private String endDate;
	
	private static AtomicInteger counterNum = new AtomicInteger();
	
	
	//Default COnstructor with atomic counter for each time instantiated 
	public BookingDetails() {
		this.id = counterNum.incrementAndGet();
		
	}	
	
	//Overloaded constructor with fields and unique id assignment when instantiated
	public BookingDetails( Customer customer, Vehicle vehicle, String startDate, String endDate,int id) {
		
		this.customer = customer;
		this.vehicle = vehicle;
		this.startDate = startDate;
		this.endDate = endDate;
		this.id = counterNum.incrementAndGet();
	}


	//Getters/Setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
