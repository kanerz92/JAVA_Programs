
public class UnderGraduate extends Student { //Inherited class
	
	public UnderGraduate() { //Empty class for user creation
		
	}
	public UnderGraduate(String name, long id) {
	
		this.setName(name);
		this.setId(id);
	}
	public void calculateResult() {
		int total = 0;
		for (int i = 0; i < this.getNUM_TESTS(); i++) {
			
			total += this.getTest(i);
			
		}	
		int avg = total/this.getNUM_TESTS();
		
		if (avg >= 40) {
			this.setGrade("Passed");
		}
		else {
			this.setGrade("Failed");
		}
	}

}
