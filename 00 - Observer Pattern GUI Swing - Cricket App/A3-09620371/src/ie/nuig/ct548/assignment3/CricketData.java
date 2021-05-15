package ie.nuig.ct548.assignment3;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Observable;
import java.util.Observer;


//Subject Data class extends built in java class Observable

public class CricketData extends Observable{
	//Creating private fields for cricket data
	private int runs;
	private float overs;
	private int wickets;
	//Creating an array list of type observers
	private ArrayList<Observer> observers;
	//CricketData constructor
	public CricketData() {
		this.observers = new ArrayList<Observer>();
		this.runs = 0;
		this.overs = 0.0f;
		this.wickets = 0;
	}
	
	public int getRuns() {
		return runs;
	}
	public float getOvers() {
		return overs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setScores(int runs, float overs, int wickets) {
		this.runs = runs;
		this.overs = overs;
		this.wickets = wickets;
		//Calling the notifyObservers method each time scores are changed/set
		notifyObservers();
	}
	public void addObserver(Observer o ) {
		observers.add((Observer) o);
	}
	//Remove observer from arraylist with exception handling added for test case
	public void deleteObserver(Observer o) {
		//Checking to make sure there is an observer in list before deleteObserver will work
		if(!observers.contains(o)) {
			throw new NoSuchElementException();
		}
		observers.remove(o);
	}
	//Calling the update method for each observer implementing observer interface
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update(this, o);
		}
	}
	

}
