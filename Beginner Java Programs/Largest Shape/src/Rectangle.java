import java.text.DecimalFormat;
import java.text.NumberFormat;

public abstract  class Rectangle extends Shapes{

	
	
	private double length;
	private double width;
	private Object area;


	Rectangle(){
	super();
	this.length = 0;
	this.width = 0;
}


Rectangle(double length, double width){
	super();
	this.length = length;
	this.width = width;
}

public void setLength(double length) {
	this.length = length;
	
}

public double getLength() {
	
	return length;
}

public void setWidth(double width) {
	
	this.width = width;
}

public double getWidth() {
	return width;
}

public String toString() {
	NumberFormat df = new DecimalFormat("#0.00");
	return "A Rectangle: \tArea = " + df.format(this.area) + "\tLength = " + df.format(this.length) + "\tWidth = " + df.format(this.width);
}

public void CalculateArea() {
	 area = width * length;
}
 
}

