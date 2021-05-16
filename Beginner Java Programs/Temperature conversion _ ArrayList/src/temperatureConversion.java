import java.util.Scanner;

public class temperatureConversion {

	public static void main(String[] args) {
		int choice = 0; //Declaring variables
		int temp;
		
		Scanner inputs = new Scanner(System.in);
	
		
		
		while ( choice != 3) {//Loop while input not 3
			System.out.println("1. Fahrenheit to Celsius");
			System.out.println("2. Celsius to Fahrenheit");		
			System.out.println("3. Exit");
		
		choice = inputs.nextInt();
		
			if (choice == 1) {//choice 1 call method toCelsius
				System.out.println("Enter temperature:");
				temp = inputs.nextInt();
			
				int celsius = toCelsius(temp);//using temp variable to be used in method and to display
				System.out.println(temp +" Degrees Fahrenheit is " +celsius + " in Celsius");
				System.out.println();//Adding new line
			}
			else if (choice ==2) {//choice 2 call method toFahrenheit
				System.out.println("Enter temperature:");
				temp = inputs.nextInt();
			
				int fahrenheit = toFahrenheit(temp);//using temp variable for method
				System.out.println(temp +" Degrees Celsius is " +fahrenheit + " in Fahrenheit");
				System.out.println();
			}
		}//Closing the while loop
		System.out.println("Program Terminated");
		inputs.close();
	}
	//method to convert and store calculation for Fahr to Celsius
	private static int toCelsius(int temp) {
		 temp =(int) (5.0/9.0*(temp-32));
		return temp;
	}
	//method to convert and store calculation for Celsius to Fahr
	private static int toFahrenheit(int temp) {
		temp =(int) (9.0/5.0*temp+32);
		return temp;
		
	}

}