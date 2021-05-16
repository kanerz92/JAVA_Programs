import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Shapes implements ShapesRelate{

	
	public static Shapes LargestShape(List<Shapes> list) {
		Shapes LargestShape = list.get(0);
	
	for(Shapes shape: list){
		if(shape.compareShapes(LargestShape) == -1){
			LargestShape = shape;
		}
	}
	
	return LargestShape;
  }
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		List<Shapes> shapes = new ArrayList<Shapes>();
		
		System.out.println("Randonly Generated Shapes\n");
		
		for(int i = 0; i < 5; i++) {
			
				double s = Math.floor(Math.random() * (10 * 100 - 100) + 1 * 100)/ 100;
				Circle circle = new Circle(s / 2);
				circle.CalculateArea();
				shapes.add(circle);
				System.out.println(circle);
				
				double x = Math.floor(Math.random() * (10 * 100 - 100) + 1 * 100) / 100;
				double y = Math.floor(Math.random() * (10 * 100 - 100) + 1 * 100) / 100;
				Rectangle rectangle = new Rectangle(x, y);
				rectangle.CalculateArea();
				shapes.add(rectangle);
				System.out.println(rectangle);
			
		}
		System.out.println("\nLargest Shape:\n");
		System.out.println(LargestShape(shapes));
		
		scan.close();
	}

	public void CalculateArea() {
		// TODO Auto-generated method stub
		
	}

}
