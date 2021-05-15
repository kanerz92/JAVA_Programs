package assignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		

		//Initialising ArrayList to hold Measurement Objects
		List<Measurement> list = new ArrayList<Measurement>();
		//Reading the CSV file into a Stream of type string called stream
		try (Stream<String> stream = Files.lines(Paths.get("hly3723.csv"))) {
			//Creating Date formatter object to set pattern and ability to parse to string
			DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
				builder.parseCaseInsensitive();
				builder.appendPattern("d-MMM-yyyy HH:mm");
				DateTimeFormatter dateFormat = builder.toFormatter();
//				LocalDateTime test =  LocalDateTime.parse("01-jan-1989 00:00",dateFormat);
//				System.out.println(test);
				
				//Populating ArrayList of Measurement objects by reading strem by line and mapping to string array and casting Measurement constructor types to strings
				//Skip reading first 25 lines
		 list = stream.skip(25)
				 	.map(line -> {//Mapping lines into String array, splitting by comma for each cell
		                      String[] tempArray = line.split(",");
//		                      System.out.println(line);	                  //calling date formatter on [0]element in temp array    
		                      Measurement m = new Measurement((LocalDateTime.parse(tempArray[0],dateFormat)),
		                    		  Double.parseDouble(tempArray[2]),
		                    		  Double.parseDouble(tempArray[4]),
		                    		  //Having error at line[6], if cell empty add 0 if not parse double
		                            (tempArray[6] == "") ?  Double.parseDouble(tempArray[6]):0,
		                              Double.parseDouble(tempArray[7]),
		                              Double.parseDouble(tempArray[8]),
		                              Double.parseDouble(tempArray[9]),
		                              Double.parseDouble(tempArray[10]),
		                              Double.parseDouble(tempArray[12]),
		                              Double.parseDouble(tempArray[14]),
		                              Double.parseDouble(tempArray[17]));
		                      return m;
		                    }).collect(Collectors.toCollection(ArrayList::new));

	 
//		 Measurement maxTemp = Collections.max(list, Comparator.comparing(Measurement::getTemp));
//		 System.out.println(maxTemp);
		 
		 OptionalDouble maxTemp2 = list.stream()
				 .mapToDouble(Measurement::getTemp)
				 .max();
		 System.out.println("Q1 Maximum temperature all data points:" +maxTemp2.getAsDouble());
		 
	
	 
		 
		 double avgSun = list.stream()
				 .mapToDouble(Measurement::getSun)
				 .average()
				 .orElseThrow(NoSuchElementException::new);//Exception handling optional double
		 System.out.println("Q2 Average sunshine hours all datapoints: " +avgSun);
		
//		 
		 double totalRain = list.stream()
				 .mapToDouble(Measurement::getRain)
				 .sum();
				 
		 System.out.println("Q3 Total rainfall all datapoints: " +totalRain);
		 
		 
		 
		 
//		 System.out.println("Q4 Total sunshine hours in November 2001" +novSun);
//		 LocalDateTime date = LocalDateTime.parse("01-nov-2001 00:00");
//	      LocalDateTime date1 = LocalDateTime.parse("01-nov-2001 00:00");
		 List<Measurement> novList = list.stream()		
//				 .filter(m -> m.date.isAfter(LocalDateTime.parse("1-nov-2001",dateFormat)) && m.date.isBefore(LocalDateTime.parse("31-nov-2001",dateFormat)))
//				 .filter(m -> m.getDate().isAfter(date) && m.getDate().isBefore(date1))
				 .filter(m -> m.getDate().getYear()== 2001 && m.getDate().getMonth().name().equalsIgnoreCase("NOVEMBER"))
				 
				 .collect(Collectors.toList());
		 
		 double totalSunNov = novList.stream()
				 .mapToDouble(Measurement::getSun)
				 .sum();
		 System.out.println("Q4 Total sunshine hours in November 2001: " +totalSunNov);
		 


		long hoursRain = list.stream()
				 .filter(e -> e.getRain() > 5)
				 .count();
		 System.out.println("Q5 The number of hours where rainfall was greater than 5mm:" +hoursRain);		 
		 
		  
		 

		 List<Measurement> seaLvl = list.stream()
				 .filter(e -> e.getMsl() > 1047.2)
				 .collect(Collectors.toList());
		 
		 System.out.println("Q6 The list of times when Mean Sea level pressure exceeded 1047.2 hPa:" );
		 seaLvl.forEach(System.out::println);
				 
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

}
