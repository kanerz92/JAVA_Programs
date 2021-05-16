import java.util.Scanner;

public class Q3bFibonacciRecursive {

	public static int fibonacciRecursion(int n){//function to return nth fib #
		if(n == 0){//base cases
		return 0;
	}
		if(n == 1 || n == 2){
			return 1;
		}
		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);//adds previous two numbers in the series and stores
	}
    	public static void main(String args[]) {
    		int maxNumber = 0;//numbers to have series go to 
    		Scanner inputs = new Scanner(System.in);
	
    		System.out.println("Enter number to calculate fibonacci series of");
	
    		maxNumber = inputs.nextInt();
	
    		System.out.print("Fibonacci Series of "+maxNumber+" : ");
    		for(int i = 0; i < maxNumber; i++){
			System.out.print(fibonacciRecursion(i) +" ");
		}
	}
}