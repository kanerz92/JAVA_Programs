


public class Tester { //creation of tester main class

	public static void main(String[] args) {
		
		Student[] studentArray = new Student[6]; //creation of array of reference/objects, student class objects
			
		studentArray[0] = new Student("Joe Blogs", 123456); // creation of the student objects, instances of student
		studentArray[1] = new Student("Martin White", 987568); //(Name, IDnumber)
		studentArray[2] = new Student("Mary Jane", 687231);
		studentArray[3] = new Student("Sean O'Connor", 784698);
		studentArray[4] = new Student("Blake White", 986789);
		studentArray[5] = new Student("Joan Collins", 988789);
	
		 		 
		System.out.println(" Student Details:"); 
		for (int i = 0; i < studentArray.length; ++i) { //for loop to go through array and print
			System.out.println(studentArray[i].toString()); //parse array to string to display content
		}
}
}