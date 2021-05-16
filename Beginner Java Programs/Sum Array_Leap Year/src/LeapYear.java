import java.util.Scanner;

public class LeapYear {

	public class NumberofDigitsUsingFunctions {
		  Scanner sc;
		  int Count = 0;
		  
		public void main(String[] args) {
			int Number;
			sc = new Scanner(System.in);		
			System.out.println("\n Please Enter any Number: ");
			Number = sc.nextInt();

			Count = NumberofDigits(Number);
			System.out.format("\n Number of Digits in a Given Number = %d", Count);
		}
		
		public int NumberofDigits(int Number) {
			for (Count = 0; Number > 0; Number = Number/10) {
				Count = Count + 1; 
			}
			return Count;
		}
	}
}