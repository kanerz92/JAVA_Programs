package a1Classes;

import java.text.DecimalFormat;

public class Triangle extends Polygon{//Leaf class
	
	private String name;
	private double base;
	private double height;
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public Triangle(String name, double base, double height) {
		super();
		this.name = name;
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		
		return base * height /2 ;//Using Triangle equation to calculate area
	}
	
	public String getName() {
		return name;
	}
	public String toString() {
		return "Triangle Shape name:\t " +name +"\t Area: " + df2.format(getArea());
	}

}
