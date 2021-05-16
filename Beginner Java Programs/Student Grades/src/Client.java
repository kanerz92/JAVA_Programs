import java.util.Scanner;

public class Client { //Driver class

	public static void main(String[] args) {
		
		//Creating object array
		 Student[] stud = new Student[3]; 
		
		 Scanner inputs = new Scanner(System.in);
		 
		//Loop for 3 user inputs, to create 3 student objects
		 for(int i = 0; i<3; i++) { 
			 
			 int choice = 0;
				 System.out.println("Enter 1 for UnderGraduate or 2 for PostGraduate");
				 
				 choice = inputs.nextInt();
				 inputs.nextLine(); //to consume the whole line
				 
				 if(choice ==1) {
					 stud[i] = new UnderGraduate();
				 }
				 else if(choice == 2) {
					 stud[i] = new PostGraduate();
				 }
		 System.out.println("Please Enter Name: ");
		 stud[i].setName(inputs.nextLine());
		// String name = inputs.nextLine();
		// stud[i].setName(name);
		 
		 System.out.println("Please Enter Student ID Number: ");
		 //stud[i].setId(inputs.nextLong());
		 stud[i].setId(inputs.nextLong());
		 	//loop for test results input
		 for(int count = 0; count < stud[i].getNUM_TESTS(); count++) {
			 
			 System.out.println("Please Enter Test Results :");
			 int test = inputs.nextInt();
			 
			 while (test < 0 || test > 100) {
				 System.out.println("Not a valid input" + "\n  Please Enter test result ranging 0-100");
				 test = inputs.nextInt();
			 }
			 stud[i].setTest(count, test);
		 }
		 stud[i].calculateResult();//Calling method
			 
			
			 
		 }//Loop the print toString method
		 for ( int i = 0; i<stud.length; i++) {
			 System.out.println(stud[i].toString());
		 }
		 inputs.close(); //Closing Scanner
		}
		 
	}	 




