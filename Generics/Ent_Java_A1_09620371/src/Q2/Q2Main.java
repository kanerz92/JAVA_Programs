package Q2;

import java.util.Scanner;

public class Q2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Octagon  o1 = new Octagon("Octagon_1",5);//Creating 2 Octagon Objects
		Octagon  o2 = new Octagon("Octagon_2",10);
		
		boolean run = true;//Boolean variable for while loop
		
		while(run==true) {//Allowing code to run one cycle atleast
			Scanner input = new Scanner(System.in);//scanner
			
			
		
		o1.writeToConsole();//Objects call to method for printing
		o2.writeToConsole();
		
		
		if(o1.compareTo(o2)==1) {//Compare to implementation
			System.out.println(o1.getName() +" Area is larger than " +o2.getName());
		}
		else if (o1.compareTo(o2)==0) {
			System.out.println(o1.getName() + " And " + o2.getName() + " have equal areas");
		} 
		else{
			System.out.println(o1.getName() +" Area is smaller than " +o2.getName());
		}	
		
		System.out.println("Recalculate Octagons? (Y/N)");
		String val = input.next();//Variable for user input and control of program flow
		
	
		if(val.contentEquals("Y")|| val.contentEquals("y")){
	
		o1.updateFromConsole();//Calling update method to change side lengths and loop again
		o2.updateFromConsole();
		
			}
			else {
				run = false;//Exit loop and terminate
				input.close();
			}
		}		
	}
}

		
		
		
		

	


