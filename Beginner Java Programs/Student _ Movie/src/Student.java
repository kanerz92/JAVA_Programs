
public class Student {

	

	//Declaring private variables
	private String name;
	private int id;
	private String course;
	
	
	//Student constructor
	public Student(String name, int id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	
}
	//Getters and Setters Student parameters
	private String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override //Method for display
	public String toString() {
		return " Student: " + getName() + "\t ID: " + getId() + "\t Course:" + getCourse();	
	}
}
