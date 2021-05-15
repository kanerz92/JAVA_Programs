package ie.nuig.cs.ct545rest;

/**
 * Vehicle class with private fields for registration manufacturer and colour
 * with getters and setters for all
 */
public class Vehicle {

	private String registration;
	private String manufacturer;
	private String colour;

	//Default constructor
	public Vehicle() {
	}

	/**
	 * Overloaded constructor for creating objects with required fields
	 */
	public Vehicle(String registration, String manufacturer, String colour) {
		this.registration = registration;
		this.manufacturer = manufacturer;
		this.colour = colour;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Customer [registration=" + registration + ", manufacturer=" +manufacturer + ", colour" +colour+ "]";
	}

}
