import java.util.Scanner;

public class Q4Exponentiation {

	 static long N = 1000000007L; // prime modulo value 
	    public static void main(String[] args) 
	    { 
	        long base = 0; 
	        long exp = 0; 
	        
	        Scanner inputs = new Scanner(System.in);
	  
	        System.out.println("Enter base number");
	        base = inputs.nextLong();
	        System.out.println("Enter exponentiation");
	        exp = inputs.nextLong();
	        
	        long modulo = exponentiation(base, exp); 
	        System.out.println(modulo); 
	    } 
	  
	    static long exponentiation(long base, long exp) 
	    { 
	        if (exp == 0) 
	            return 1; 
	  
	        if (exp == 1) 
	            return base % N; 
	  
	        long t = exponentiation(base, exp / 2); 
	        t = (t * t) % N; 
	  
	        // if exponent is even value 
	        if (exp % 2 == 0) 
	            return t; 
	  
	        // if exponent is odd value 
	        else
	            return ((base % N) * t) % N; 
	      
	    }    
	} 