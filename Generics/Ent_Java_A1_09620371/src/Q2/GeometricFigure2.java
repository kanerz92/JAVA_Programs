package Q2;

public abstract class GeometricFigure2{//Abstract class, can't be instantiated
		public static final double PI = 3.141592653;
		private boolean filled;
		
		public GeometricFigure2() {
			filled = false;
	}
		public boolean isFilled() {
			return filled;
	}
		
		public void setFilled(boolean filled) {
			this.filled = filled;
	}
		public void display() {
			System.out.println("This is some geometric figure.");
	}
		public abstract double calcArea();//Abstract method to be implemented in subclasses
	}


