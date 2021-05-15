package a1Classes;

import java.text.DecimalFormat;
import java.util.HashSet;

public class CompositeShapes extends Shapes{//Composite class
	
	private String name;
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");//Formating double area results two decimal places
	
	HashSet<Shapes> shapeSet = new HashSet<Shapes>();//Creating HashSet of shapes to form compositeshapes HashSet
	
	
	public CompositeShapes(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void addShape(Shapes s) {//Method to add Shapes to HashSet
		shapeSet.add(s);
			
	}
	public void removeShape(Shapes s) {//Method to remove Shapes from HashSet
		shapeSet.remove(s);
		
	}
	@Override
	public double getArea() {
		double area = 0.0;
		
		for(Shapes element: shapeSet) {//enhanced loop to calculate composite shape area
			area += element.getArea();//storing and adding area from shape used in composite shape set
		}
		return area;
	}
	public String toString() {
		String sname = " ";//Local variable to print names of composite shape
		
		for(Shapes element: shapeSet) {
			sname += (element.getName());
		
		}
		return name +" is made out of " +sname +" " + "and its total Area is: " +df2.format(getArea());
	}
	
	
}

