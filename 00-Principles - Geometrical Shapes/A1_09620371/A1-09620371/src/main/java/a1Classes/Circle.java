package a1Classes;
import java.text.DecimalFormat;

public class Circle extends PrimitiveShapes{//Leaf class
	
	private String name;
	private double radius;
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");//formatting return double from area to 2 decimal places
	
	public Circle(String name, double radius) {
		super();
		this.name = name;
		this.radius = radius;
		
	}
	public double getArea() {//Encapsulation to just read area no modification allowed
		return Math.PI * radius * radius;//Using Circle equation to calculate area
	}
	
	public String getName() {
		return name;
	}
	public String toString() {
		return "Circle Shape name:\t " +name +"\t Area: " + df2.format(getArea());
	}

}

