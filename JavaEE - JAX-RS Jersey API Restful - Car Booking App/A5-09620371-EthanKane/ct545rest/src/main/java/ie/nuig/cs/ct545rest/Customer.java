package ie.nuig.cs.ct545rest;


public class Customer {

	private String firstName;
	private String lastName;
	private String address;

	//Default Constructor
	public Customer() {
	}

	 //Overloaded constructor to create Customer object with fields
	public Customer(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [first name=" + firstName + ", last name=" +lastName + ", address" +address+ "]";
	}
}
