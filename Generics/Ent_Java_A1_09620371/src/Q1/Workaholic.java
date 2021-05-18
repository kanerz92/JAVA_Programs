package Q1;

public class Workaholic  extends Worker{
		
		public static final int OVERTIME = 500;//Initialised variable
	
	
	public Workaholic(String name, float hourlyIncome, int age) {//Constructor, setting coworker param to null
		super(name, hourlyIncome, age, null);
		
	}
	
	public void work(int hours) {//Simplified work method, inputting hours in main
		while(age++ < RETIREMENT_AGE) {//Method calculates total salary earned

		for(int i = 1; i<=hours; i++)
			earned += hourlyIncome;
		
		for(int j = 1; j<=OVERTIME; j++)
			earned += hourlyIncome;
		}
	}
	public void info() {//Method for printing
		System.out.println("Worker name: " +name + " earned " + earned);
	}
}


