package assignment2;

import java.util.concurrent.atomic.AtomicInteger;

public class Buyer implements Runnable{//Buyer class implementing java runnable interface
	
	
	//private static Integer totBuyer;
	//private static Integer totPurchase;
	private CarShowroom show;//Declaring type CarShowroom 
															//Atomic Integer used to count total number of buyers created
	private static AtomicInteger gc = new AtomicInteger(1);//Atomic Integer to keeptrack of unique buyer/thread number, starting at 1
		
	
	public Buyer(CarShowroom show) {//Buyer constructor passing in Carshowroom
		this.show = show;
			
	}
	@Override
	public void run() {//Implementing run method
		int uniqueThreadNumber = gc.getAndIncrement();//Variable for Atomic Integer Buyer counter
		System.out.println("Buyer number " + uniqueThreadNumber +", has entered the showroom");
		
		
		synchronized(show) {//synchronising everything withing CarShowroom
		while (show.isEmpty()) {//Checking if showroom empty
			try {
				System.out.println("Buyer number" +uniqueThreadNumber +" wants to buy a car but showroom is empty");
				show.wait();//Printing before method wait() which causes thread to wait until notified, on Buyer object
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			Car car = show.takeCar();
			System.out.println("Buyer number " +uniqueThreadNumber +" has bought the "+car.toString());
			show.notifyAll();//NotifyAll method, to notify all other threads that are waiting	
		}	
	}
}

