import java.text.DecimalFormat;
import java.util.Scanner;

public class TicketSales {

	public static void main(String[] args) {
		
		int typeASeat, typeBSeat, typeCSeat; 			//variable for number of tickets sold per type
		double priceA, priceB, priceC, totalSales; 		//variable for storing currency values
		
		Scanner inputs = new Scanner(System.in); 		//creating new scanner object called inputs(System console input)
		DecimalFormat df = new DecimalFormat("0.00"); 	//To format numbers currency values to 0.00 using an object called df
		
		
		System.out.print("Enter number of A seats sold:"); //To get inputs for each type (number sold and price per ticket)
		typeASeat=inputs.nextInt();
		System.out.print("Enter price of A tickets:");
		priceA=inputs.nextDouble();
		
		System.out.print("Enter number of B seats sold:");
		typeBSeat=inputs.nextInt();
		System.out.print("Enter price of B tickets:");
		priceB=inputs.nextDouble();
		
		System.out.print("Enter number of C seats sold:");
		typeCSeat=inputs.nextInt();
		System.out.print("Enter price of C tickets:");
		priceC=inputs.nextDouble();
		
		totalSales = typeASeat*priceA + typeBSeat*priceB + typeCSeat*priceC; //Calculate the total sales and store in double variable totalSales
		
		System.out.println("Ticket Type \t Tickets Sold\t Price per Ticket"); 	//Console output
		System.out.println("------------\t ------------\t-----------------");
		System.out.println("A Tickets:\t\t" + typeASeat + "\t  \t" + df.format(priceA));
		System.out.println("B Tickets:\t\t" + typeBSeat + "\t  \t" + df.format(priceB));
		System.out.println("C Tickets:\t\t" + typeCSeat + "\t  \t" + df.format(priceC));
		System.out.println("\n");
		System.out.println("\t Total Sales $" + df.format(totalSales));
		
	
	}					//End main method
	
	
}    					//End Class TicketSales
