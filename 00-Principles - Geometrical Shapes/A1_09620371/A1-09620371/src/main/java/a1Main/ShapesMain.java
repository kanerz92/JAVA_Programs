package a1Main;

import a1Classes.Circle;
import a1Classes.CompositeShapes;
import a1Classes.Ellipse;
import a1Classes.Polygon;
import a1Classes.PrimitiveShapes;
import a1Classes.Rectangle;
import a1Classes.Shapes;
import a1Classes.Triangle;

public class ShapesMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shapes e1 = new Ellipse("Ellipse_1 ",3,2);//Shapes or Ellipse reference (Polymorphism)
		Ellipse e2 = new Ellipse("Ellipse_2 ",7,3);//Creating Shape objects with constructors
		Circle c1 = new Circle("Circle_1 ", 4);
		Shapes c2 = new Circle("Circle_2 ", 3);
		Polygon p1 = new Polygon("Polygon_1 ",3,10);
		Shapes p2 = new Polygon("Polygon_2 ",4,9);	
		Triangle t1 = new Triangle("Triangle_1 ",3,3);
		PrimitiveShapes t2 = new Triangle("Triangle_2 ",2,4);//Polymorphism example
		PrimitiveShapes r1 = new Rectangle("Rectangle_1 ", 5,5);
		Rectangle r2 = new Rectangle("Rectangle_2 ", 8,5);
		
		CompositeShapes comp1 = new CompositeShapes("Composite Shape 1,");//Creating composite shape objects	
		CompositeShapes comp3 = new CompositeShapes("Composite Shape 3,");
		CompositeShapes comp4 = new CompositeShapes("Composite Shape 4,");
		CompositeShapes comp5 = new CompositeShapes("Composite Shape 5,");
		
		comp1.addShape(c1);//Adding Shape objects to compositeshapes 
		comp1.addShape(r1);
		comp1.addShape(t1);
		
		comp3.addShape(e1);
		comp3.addShape(e2);
		comp3.addShape(r1);
		
		comp4.addShape(t2);
		comp4.addShape(c2);
		comp4.addShape(r2);
		comp4.addShape(r1);
		
		comp5.addShape(r1);
		comp5.addShape(r1);//Demonstrating use of HashSet 
		comp5.addShape(r2);//Only made up of r1 and r2, not r1, r1 and r2 
		
			
		System.out.println(e1.toString());//Calling classes toString method for printing
		System.out.println(e2.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(comp1.toString());
		System.out.println(comp3.toString());
		System.out.println(comp4.toString());
		System.out.println(comp5.toString());	
	}

}



