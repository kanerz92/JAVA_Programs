
public class PostGraduate  extends Student { //Inherited Class 
	
	public PostGraduate() { //Empty class for user input/creation
	}

	public PostGraduate(String name, long id) {
		
		this.setName(name);
		this.setId(id);
	}
	public void calculateResult() {
		int total = 0; //Loop adding 3 test results
		for (int i = 0; i < this.getNUM_TESTS(); i++ ) {
			
			total += this.getTest(i);
		}
		//calculating average from 3 test inputs
		int avg = total/this.getNUM_TESTS();
		
		if(avg >= 50) {
			this.setGrade("Passed");
		}
		else {
			this.setGrade("Failed");
		}
	}
}
