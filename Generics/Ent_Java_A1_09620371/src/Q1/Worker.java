package Q1;

public class Worker {//Worker Superclass
		public static final int RETIREMENT_AGE = 65;//Initialised final variable
		protected String name = null;//Protected fields to be implemented in subclass Workaholic
		protected int age = 0;
		protected float earned = 0.0f;
		protected float hourlyIncome = 0.0f;
		private Worker coWorker = null;
	
	public Worker(String name, float hourlyIncome, int age, Worker coWorker) {//Constructor for worker objects
		this.name = name;
		this.hourlyIncome = hourlyIncome;
		this.age = age;
		this.coWorker = coWorker;
	}

	public void work(int hours) {//Simplified work method, inputting hours in main
		while(age++ < RETIREMENT_AGE) {//Method calculates salary earned and call delegate method if applicable
			for(int i = 1; i<=hours; i++) {
				earned += hourlyIncome;
				
				if(coWorker!=null && i%5==0)
					delegate(1);
				}
		}
	}
	private void delegate(int hours) {//Method that takes delegated hours from work method assigns to coworker
		coWorker.work(hours);
	}
	public void info() {//Method for printing
		System.out.println("Worker name: " +name + " earned " + earned);
	}


}
