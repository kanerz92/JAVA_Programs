package assignment2;

import java.util.Random;

public class Main {
	public static void main(String args[]) {
		Random rand = new Random(System.currentTimeMillis());
		
		
	
	CarShowroom cs = new CarShowroom(5);//Creating showroom with capacity of 5
	int days = 0;//Variable for loop, 30days
	
	while(days<30) {
		 days++;
		 
		 System.out.println("Day " +days +" beginning. There are "+cs.getCarcount() +" in the showroom today");	
		   int n = rand.nextInt(3) + 1;


	        for(int j=0 ; j< n; j++) {//Loop for random amount of Buyers/Threads to be created

	        	Buyer b = new Buyer(cs); //Creating Buyer 
	        	Thread t = new Thread(b);//Creating new Thread with Buyer object
	        	t.start();//Starting thread, which calls Buyers run method.
	            
	        }
	        int m = rand.nextInt(3)+1; //Loop for random amount of Sellers/Threads to be created
	        
	        for(int j=0 ; j< m; j++) {
	        	Seller s = new Seller(cs);
	        	Thread t2 = new Thread(s);
	        	t2.start();        	
	        }
	        try {
				Thread.sleep(1000);//Cause threads to sleep 1 second at end of each day
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}

}
