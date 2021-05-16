import java.util.Scanner;

public class Q3aFibonacciNonRecursive {
	
	public static void main(String[] args) 
	{
	
		 int maxNumber = 0; //Input N
		 int previousNumber = 0;//F0
		 int nextNumber = 1;//F1
		 
		 
		    System.out.println("Enter number to calculate fibonacci series of:");
	        Scanner scanner = new Scanner(System.in);
	        maxNumber = scanner.nextInt();
	        System.out.print("Fibonacci Series of "+maxNumber+" : ");
 
	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */
 
	      
	            int sum = previousNumber + nextNumber;//sum=fib
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
 
	}
 
}