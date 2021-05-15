package assignment2;

import java.util.ArrayList;


public class CarShowroom {
	
	private int capacity;//Variable for Carshowroom constructor


	private ArrayList<Car> carlist = new ArrayList<Car>();//Creating ArrayList
	
	public CarShowroom(int cap) {//Constructor passing in capacity for creating showroom object
		this.capacity = cap;
	}
	
	
	public void addCar(Car c) {//Adding car to list
		if (!isFull()) {//Only adding if isFull method is not true
		carlist.add(c);
		}
		
	}
	public Car takeCar() {//Removing car[0] from list 
		if(!isEmpty()) {//Only taking car if isEmpty method not true
		return carlist.remove(0);
		}
		return null;
	}
	
	public boolean isEmpty() {//Method to check that the array list of cars is not <=0
		if (carlist.size()<=0) {
		return true;
		}
		else return false;
	}
	public boolean isFull() {//Method to check if list is at capacity
		if(carlist.size()>=capacity) {
			return true;
		}else 
			return false;	
	}
	public int getCarcount() {//Method for printing number of cars in showroom which equal arraylist size
		return carlist.size();
	}
}
