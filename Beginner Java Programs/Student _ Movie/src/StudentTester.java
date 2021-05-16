import java.util.ArrayList;

public class StudentTester {

	public static void main(String[] args) {
		
		//Creating Student Objects
		Student s1 = new Student("John Smith", 123456, "Programming I");
		Student s2 = new Student("Jane Smith", 125678, "Programming I");
		Student s3 = new Student("Joe Smith", 129876, "Programming I");
		//Creating array list
		ArrayList<Student> studentList = new ArrayList<Student>();
		//adding student objects to array list
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		//enhanced for loop to print objects
		for (Student s : studentList)
			System.out.println(s);
		}
	}

