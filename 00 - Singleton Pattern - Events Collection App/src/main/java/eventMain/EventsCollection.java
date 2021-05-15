package eventMain;

import java.util.Set;
import java.util.TreeSet;

import eventClasses.Events;

//Class to hold Set of Events being imported by Jackson
public class EventsCollection {
	//Tree set to store events, for events to implement and be comparable
	private Set<Events> events = new TreeSet<Events>();
	// private static variable single_instance of type Singleton 
	private static EventsCollection singleInstance = null;
	//Private constructor restricted to this class
	private EventsCollection() {
		
	}
	// static method to create instance of EventsCollection Singleton class 
	//Only one instance will ever be created
	public static EventsCollection getInstance() {
		if (singleInstance == null)
			singleInstance = new EventsCollection();
		return singleInstance;
	}
	
	public void addEvents(Events e) {
		events.add(e);
	}

	public Set<Events> getEvents() {
		return events;
	}

	public void setEvents(Set<Events> events) {
		this.events = events;
	}
}
