package assignment2;

public class Car {  //Variables to create random car object
	private String registration;
	private int saleValue;
	private String colour;
	
	private static final String [] COLOUR = {"Black", "Blue", "Red"};//Array to choose random colour
	private static final String [] COUNTY = {"G","D","C","CE"};//Array to choose random county
	
	
	public Car () {//Car constructor
		this.registration = randRegistration();
		this.saleValue = generateSale();
		this.colour = carColour();
			
	}
	public int generateSale() {//Method to create random sale value
		int value = (int)(Math.random()*20000);//Assigning random number between 0-20k to value
		if (value <= 1000) {//To give number between 1000-20000
			return 1000;
		}else
			return value;
	}
	public String carColour() {//Method to choose random colour from array
		int index = (int) ((Math.random()*(COLOUR.length)));
		return COLOUR[index];
	}
	public String randRegistration() {//Method to create random reg
		int id = (int)(Math.random()*99999);
		int index = (int) ((Math.random()*(COUNTY.length)));
		int year = (int) (Math.random()*20);
		
		if (year <= 9) {//If statement to add 0 to numbers less than 9
			return ("0"+ year +"-" +COUNTY[index] +"-" + id);
			
			}else
				return( year +"-" +COUNTY[index] +"-" + id);
		}
		public String toString() {//Method for printing car details
			return (colour +" car with registration " + registration +" worth €" + saleValue);
		}
	}
	
