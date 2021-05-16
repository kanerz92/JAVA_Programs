import java.text.DecimalFormat;
import java.text.NumberFormat;

public abstract  class Circle extends Shapes{
	
	private double radius;
	private double PI = 3.142857;
	private Object area;
	
	Circle(){
		
		super();
		this.radius = 0;
		
	}
	
	Circle(double radius){
		super();
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setPI(double PI) {
		this.PI = PI;
	}
	
	public double getPI() {
		return PI;
	}
	
	public void CalculateArea() {
		this.area = (this.PI * (this.radius * this.radius));
		
	}
	
	public String toString() {
		NumberFormat df = new DecimalFormat("#0.00");
		return "A Circle: \tArea = " + df.format(this.area) + "\tRadius = " + df.format(this.radius);
	}
	

}



