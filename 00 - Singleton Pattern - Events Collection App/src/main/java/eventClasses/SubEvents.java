package eventClasses;



public class SubEvents extends Events{
	
	//Constructor using superclass Events
	public SubEvents() {
		super();	
	}
	//Overriding toString method in Events class, using this to use SubClass inherited methods 
	public String toString() {
		return  "\t\t \n   SubEvent Year: " +this.getYear() +" Event Name: " +this.getName() + " Event Type: " +this.getType() +" ";
	}
}

