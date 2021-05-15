package eventMain;
import java.io.File;
import java.io.IOException;
import java.time.Year;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import eventClasses.EventTimeline;
import eventClasses.Events;


public class Application {
	
	public static void main (String args[]) {
		//Creating ObjectMapper object
		ObjectMapper mapper = new ObjectMapper();
		//Creating File from JSON
		File readfile = new File("assignment_2_data.json");
		
		try {
			// instantiating EventsCollection Singleton class with variable e
			EventsCollection ec = EventsCollection.getInstance();
			//Deserialising JSON file into EventsCollection instance
			ec = mapper.readValue(readfile, EventsCollection.class);
			//System.out.println("Successfully read json");
			//Calling method to get user input, passing in our EventsCollection
			getUserInput(ec);
		
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	//Method to get user choice whether to search specific year or range
	public static void getUserInput(EventsCollection c) {
		int choice = 8;
		System.out.println("Would you like to enter a specific year or range of two years?");
		while(choice !=0) {
		System.out.println("Enter 1 for specific year");
		System.out.println("Enter 2 to enter range of two years");
		System.out.println("Enter 0 to exit");
		Scanner inputs = new Scanner(System.in);
		 choice = inputs.nextInt();
		//while(choice !=0) {
			//Calling method associated to user inputting 1
		if (choice == 1) {
			getInput1(c);	
		}
		//Calling method associated to user inputting 2
		else if (choice == 2) {
			getInputRange(c);
			}
		}
	}
	//Method for taking User Input for One Year to Search
	public static void getInput1(EventsCollection ec) {
		Scanner inputs = new Scanner(System.in);
		
		String userInput;
		int inYear = 0;
		
			do {
			System.out.println("Please enter a year to search, YYYY format only");
			userInput = inputs.next();
			}
			//Storing Year in a string and validating using Regex
			while(! userInput.matches("[0-9]{4}"));
			//Casting String to Integer
			inYear = Integer.parseInt(userInput);
			//Casting Integer to Year
			Year yIn = Year.of(inYear);
		
		//Enhanced loop to check collection for matching year
		for (Events yearElement : ec.getEvents()) {
			if(yearElement.getYear().equals(yIn)) {
				System.out.println(yearElement.toString());
				System.out.println("------"+"\t"+ "------"+"\t"+  "------"+"\t"+ "------"+"\t"+ "------"+"\t"+ "------"+"\t"+ "------"+"\t"+ "------");

			}
		}
	}
	//Method to search and return events within range of two inputted years
	public static void getInputRange(EventsCollection ec) {
		Scanner inputs = new Scanner(System.in);
		System.out.println("Please enter two years to display events, YYYY format only");
		
		EventTimeline eT = EventTimeline.getInstance();//Creating an EventTimeline object
		System.out.println("Enter Start of Year Range");
		//Getting first year Input
		int inYear = inputs.nextInt();
		//Assigning instance of inputed year to Year variable yIn
		Year yIn = Year.of(inYear);
		System.out.println("Enter the End of Year Range");
		int inYear2 = inputs.nextInt();
		Year yIn2 = Year.of(inYear2);
		
		//Loop through collection and adding to EventTimeline instance
		for (Events yearElement : ec.getEvents()) {
			if(yearElement.getYear().compareTo(yIn)>= 0 && yearElement.getYear().compareTo(yIn2)<= 0) {
				eT.addEvent(yearElement);	
				}
			}
			//Calling our ET sort method and enhanced loop through list
			eT.toSort();
			for(Events element : eT.getList()) {
				System.out.println(element.toString());
				System.out.println("------"+"\t"+ "------"+"\t"+  "------"+"\t"+ "------"+"\t"+ "------"+"\t"+ "------"+"\t"+ "------"+"\t"+ "------");			
			}	
	}	
}

