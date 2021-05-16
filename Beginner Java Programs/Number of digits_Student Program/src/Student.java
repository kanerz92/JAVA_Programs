

public class Student { //creation of student class

	private String name; //private instance variables
	private long IDnumber;
	
	public Student(String name, long IDnumber) { //Constructor of Student Class
			
		this.name = name; //initialising variable of student class, object variables
		this.IDnumber = IDnumber; //fields name and ID number
	}															
		
	
	private String getName() { //getter method to access instance variable name
		return name;
	}
	public void setName(String name) { //setter method
		this.name = name; //sets instance variable to name
	}
	private long getIDnumber() { //getter to access instance variable IDnumber
		return IDnumber;
	}
	public void setIDnumber(long IDnumber) { //setter method
		this.IDnumber = IDnumber;
	}
	
	
	public String toString() { //method to print array contents from tester
		return " Student: " + getName() + "\t ID: " + getIDnumber();	
	}
}
