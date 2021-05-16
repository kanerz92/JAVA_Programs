import java.util.Scanner;

public class NumDigits {

	public static void main(String[] args) {
		
	    Scanner inputs = new Scanner(System.in); //scanner called inputs
	     
	      System.out.println("This program counts the number of digits in an integer entered by the user. \n Enter -1 to exit");
	      int num = 0; //store input numbers
	      int count = 0;//counter for digits
	      int newNum= 0;//to store the inputted number to print
	      
	      while(num !=-1)
	      {
	    	  System.out.println("Enter Number:");
	    	  num = inputs.nextInt(); //getting number storing in num
	    	 newNum = num;//storing num in newNum
	      
	      if (num ==-1) 
	      {
	    	  System.out.println("Program Terminated ...");
	      }
	      else 
	      {
	    	  while(num!=0 )
	    	  {
	 	         num = num/10; //counts down if number divisible by 10
	 	         count++;//iterates down and adds to the count of digits
	    	  } 
	      System.out.println("Number of digits in:" +newNum +" is = " + count);
	      count=0;
	      }
	      }
	}
}
	      
	      
	      
	      
	