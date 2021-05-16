import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		
		Scanner inputs = new Scanner(System.in); //calling scanner inputs
		
		int n, sum = 0; 		//initialising our int variables n(our inputs), sum to add inputs
		
		
		System.out.print("Enter size of your array:");
		
		n = inputs.nextInt();  //entering size of array using n
		int a[] = new int[n];  //using n to create array called a with the size n
	
		
		
		System.out.println("Enter your array elements");
		for(int i = 0; i < n; i++ )  //counter to take inputs up until declared n value
		{
			
			a[i] = inputs.nextInt();  //scanner taking inputs and storing in array a[]
			
			sum = sum + a[i];		//taking inputs and adding to sum then storing in sum
		}
		System.out.println ("Sum of array is:" +sum);
		System.out.println("Contents of array:");
		
		for(int i=0; i<n; i++) {    //outputing values in new for loop for each input
			System.out.println(a[i]);
		}
		}
		
	}
	


