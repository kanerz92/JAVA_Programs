package eventClasses;

import java.time.Year;
/**
 * Abstract class for all Events. All Events have
 * a name, year and a type. Implementing comparable interface so they can be compared to one another exclusively by year.
 * Also to enable sorting collection by year
 */

public abstract class EventSuper implements Comparable<EventSuper>{
	private String name;
	private Year year; // Creating Year object variable
	private String type;
	
	public EventSuper() {

	}
	//Constructor
	public EventSuper(String name, Year year, String type) {
		this.name = name;
		this.year = year;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public int compareTo(EventSuper e) {
		if (e.getYear().equals(this.year)) {
			return 0;// If Year object which comparing is equal
		} else if (e.getYear().compareTo(this.year) > 0) {
			return -1;
		} else
			return 1;
	}
}


