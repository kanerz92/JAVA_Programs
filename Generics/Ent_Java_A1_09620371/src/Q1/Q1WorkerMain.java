package Q1;

public class Q1WorkerMain {

	public static void main(String[] args) {
		Worker jane = new Worker("Jane", 20, 25, null);//Creating Worker object
		Worker john = new Worker("John", 20, 45, jane);
		Workaholic bill = new Workaholic("Bill", 20, 25);//Creating Workaholic object
		
		jane.work(1600);//Worker object call to work method, with inputted hours
		
		john.work(1600);
		
		bill.work(2000);
		
		john.info();//Worker objects call to info method for printing
		jane.info();
		bill.info();
		
	}
	}


