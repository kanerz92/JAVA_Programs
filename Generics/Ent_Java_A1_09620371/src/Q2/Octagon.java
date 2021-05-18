package Q2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Octagon extends GeometricFigure2 implements ConsoleIO, ComparableGeometricFigure<Octagon>{
	
	private String name;					//Octagon subclass, implementing ComparableGeometricFigure to take Octagon objects
	private double side;
										
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");//DF object to format area
	
	
	public Octagon(String name, double side) {//Constructor for octagon objects
		this.side = side;
		this.name = name;
		
	}
	public String getName() {
		return name;
	}

	@Override
	public void writeToConsole() {//Implemented interface method for printing
		System.out.println( "#"+name +"\t Side length = "+ side +"\t Octagon Area: " +df2.format(calcArea()));
		// TODO Auto-generated method stub
	}

	@Override
	public double calcArea() {//method to calculate octagon area
		
		double area = 2*(1+Math.sqrt(2))*Math.pow(side, 2);
		
		return area;
	}
	@Override
	public void updateFromConsole() {//Implemented interface method, to update sides of Octagon objects
		Scanner inputs = new Scanner(System.in);
		
		System.out.println("Update " +name +" side length:");
		this.side = inputs.nextDouble();
		//inputs.close();
	}
	@Override
	public int compareTo(Octagon o) {//Implemented compareTo method from interface, to compare only octagons by area
		if(calcArea() > o.calcArea())
			return 1;
			else if (calcArea() < o.calcArea())
				return -1;
			else
				return 0;
	}
}
