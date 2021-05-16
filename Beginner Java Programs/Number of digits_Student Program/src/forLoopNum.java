import java.util.Scanner;

public class forLoopNum {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int number, Count=0;
		Scanner inputs = new Scanner(System.in);	
	
		System.out.println("\n Please Enter any Number: ");
		number = inputs.nextInt();
		for (number != -1){
			System.out.println("enterdigitsis");
		
		for (Count = 0; number > 0; number = number/10) {
			Count = Count + 1; 
		}
		System.out.format("\n Number of Digits in a Given Number = %d", Count);
		}
	}
}




