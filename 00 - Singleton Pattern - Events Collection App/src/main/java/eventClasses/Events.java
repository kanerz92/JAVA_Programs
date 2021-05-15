package eventClasses;


import java.util.Set;
import java.util.TreeSet;

public class Events extends EventSuper {

	// Private Set instantiated as a TreeSet of SubEvents type
	private Set<SubEvents> subevents = new TreeSet<SubEvents>();
	//Constructor inheriting from EventSuper
	public Events() {
		super();
	}
	// Method to add subEvent to the event
	public void addSubEvent(SubEvents s) {
		subevents.add(s);
	}

	public Set<SubEvents> getSubevents() {
		return subevents;
	}
	//Method to set subevents but will not set subevents if subevent occurs before event
	public void setSubevents(Set<SubEvents> subevents)throws Exception {
		try {
			//For loop comparing subevent year to main event year
			for(SubEvents ev : subevents) {
				if(this.getYear().compareTo(ev.getYear()) > 0) {
					
					throw new Exception(ev.toString());
				}
			}//Adds subevent if no error
			this.subevents = subevents;
		}
		catch(Exception e) {
			System.out.println("Cannot Add Sub Event Occuring Prior to Main Event");
			System.out.println("Check your JSON File");
			System.out.println(e.toString());
		}
    }	
	public String toString() {
		String output = "";// Creating variable to print subevents when printing main event
		for (SubEvents element : subevents) {
			output += element.toString() + "\n";
		}
		return "\nEvent Year: " + this.getYear() + " Event Name: " + this.getName() + " Event Type: " + this.getType() + " " + output;
	}
}
