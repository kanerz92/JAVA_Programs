
public class Student {
	private String  name;
	private long id;
	private String grade;
	private int[] test;
	private final int NUM_TESTS = 3;
	
	//Student Constructor hold object details
	public Student() { 
		name = null;
		id = 0;
		grade = null;
		test = new int[NUM_TESTS];
	}
	//Student constructor for user input/creation
	public Student(String name, long id) { 
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}

	//i for instance of test inputed [] for array of int
	public int getTest(int i) {
		return test[i];
	}

	public void setTest(int i, int test) {
		this.test[i] = test;
	}

	public int getNUM_TESTS() {
		return NUM_TESTS;
	}
	
	public void calculateResult() {
		
	}
	//Method for printing
	public String toString() {
		return ("Name: " + this.name + " Student ID: " + this.id + " Grade: " + this.grade);	
	}

}
