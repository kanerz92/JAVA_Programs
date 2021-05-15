package eventClasses;

import java.util.ArrayList;
import java.util.Collections;

//Class to store user range of events needed and to implement a sorting method
public class EventTimeline {

	//Creating private Arraylist of event type
	private ArrayList<Events> indexList = new ArrayList<Events>();
	// static variable single_instance of type Singleton 
	private static EventTimeline singleInstance = null;
	//Private Constructor
	private EventTimeline() {
		
	}
	// static method to create instance of Singleton class 
	public static EventTimeline getInstance() {
		if (singleInstance == null)
			singleInstance = new EventTimeline();
		return singleInstance;
	}
	//Method to add events to ArrayList
	public void addEvent(Events e) {
		indexList.add(e);
		
	}
	//Method to sort our ET list, based on the compareTo in classes, comparing by year
	public void toSort() {
		
	Collections.sort(indexList);	
	}
	
	public ArrayList<Events> getList(){
		return indexList;
	}
}
