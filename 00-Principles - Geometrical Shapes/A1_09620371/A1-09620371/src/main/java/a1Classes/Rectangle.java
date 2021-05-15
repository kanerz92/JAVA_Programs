package a1Classes;
import java.text.DecimalFormat;

public class Rectangle extends Polygon{//Leaf class
	
	private String name;
	private double width;
	private double height;
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	
	public Rectangle(String name, double width, double height) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {//Using Rectangle equation to calculate area
		
		return width * height; 
	}
	
	public String getName() {
		return name;
	}
	public String toString() {
		return "Rectangle Shape name:\t " +name +"\t Area: " + df2.format(getArea());
	}

}
