package a1Classes;
import java.text.DecimalFormat;

public class Ellipse extends PrimitiveShapes{//Leaf class
	
	private String name;
	private double xaxis;
	private double yaxis;
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	
	public Ellipse(String name, double xaxis, double yaxis) {
		super();
		this.name = name;
		this.xaxis = xaxis;
		this.yaxis = yaxis;
	}
	@Override
	public double getArea() {//Using Ellipse equation to calculate area
		// TODO Auto-generated method stub
		return Math.PI * xaxis * yaxis;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Ellipse Shape name:\t " +name +"\t Area: " + df2.format(getArea());
	}

}
