package a1Classes;
import java.text.DecimalFormat;

public class Polygon extends PrimitiveShapes{
	
	
	private String name;
	private int sides;
	private double slength;
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public Polygon(String name, int side, double slength) {
		
		this.name = name;
		this.sides = side;
		this.slength = slength;
	}

	public Polygon() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	@Override
	public double getArea() {//Using Polygon equation to calculate area
		// TODO Auto-generated method stub
		return  (sides*(slength*slength))/(4.0*Math.tan((Math.PI/sides)));
	}
	
	public String toString() {
		return "Polygon Shape name:\t " +name +"\t Area: " + df2.format(getArea());
	}

}
