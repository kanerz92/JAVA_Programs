import java.util.Scanner;

public class MovieTester {

	

	public static void main(String[] args) {
		//creating three movie objects
		
		Movie one = new Movie();
		Movie two = new Movie();
		Movie three = new Movie();
		
		//creating array of objects
		Movie[] movies = new Movie[3];
		
		//empty object arrays
		movies[0] = one;
		movies[1] = two;
		movies[2] = three;
		 
		Scanner inputs = new Scanner(System.in);
		//for loop to set title, genre, rating
		for (int i = 0; i < movies.length; i++){
			
			//Enter Movie Details
			System.out.println("Please enter the title of Movie:");
			//String title =inputs.nextLine();
			//movies[i].setTitle(title);
			movies[i].setTitle(inputs.nextLine());
			System.out.println("Please enter the genre of Movie:");
			movies[i].setGenre(inputs.nextLine());
			System.out.println("Please enter the rating of Movie (1-5):");
			movies[i].setRating(inputs.nextInt());
			inputs.nextLine(); 
			System.out.println();	
		}
		
           //for loop to display movie contents
			for (int i = 0; i<movies.length; i++) {
				Movie movie = movies[i];
				
				System.out.println("Movie " +(i+1) +" Title: " + movie.getTitle());
				System.out.println("Movie " +(i+1) +" Genre: " + movie.getGenre());
				System.out.println("Movie " +(i+1) +" Rating: " + movie.getRating());
				movies[i].playIt(); //Calling playIt method for each movie
				System.out.println();			
			}
	}
}

