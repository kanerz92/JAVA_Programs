package assignment2;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Seller implements Runnable{

	//private static Integer totSellers;
	//private static Integer totSale;
	private CarShowroom show;//Declaring variables
	private Car c;
	
	private static AtomicInteger gc = new AtomicInteger(1);//Atomic Integer to keeptrack of unique seller/thread number, starting at 1
	
	
	public Seller(CarShowroom show) {//Seller contructor
		this.show = show;
		this.c = new Car();//Creating random car for Seller 
	}

	@Override
	public void run() {//Implementing run method from interface runnable
		int uniqueThreadNumber = gc.getAndIncrement();
		System.out.println("Seller  " + uniqueThreadNumber +" has entered the showroom, with a "+c.toString());
	
		
		synchronized(show) {
			
		while(show.isFull()) {//Calling isFull method to check if showroom full
			try {
				show.wait();//Method to cause seller on thread to wait until been notified or when showroom not full
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}	
			}
			show.addCar(c);//Adding sellers random car to showroom
			System.out.println("Seller number "+uniqueThreadNumber +" sold their " +c.toString());
			show.notifyAll();
		}		
	}
}
