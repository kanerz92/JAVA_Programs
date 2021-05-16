
public class Movie {

	private String title;
	private String genre;
	private int rating;
	private static int moviesCount = 0; //to store count of how many times movie constructor is run to create Movie object
	
	
	public Movie(String title, String genre, int rating) {
		this.title = title;
		this.genre = genre;
		this.rating = rating;
		moviesCount++;
		//System.out.println("Movie Number:");
	}
		//for creating empty Movie Objects

	public Movie() {
		
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public void playIt() {
		System.out.println("Playing the Movie: " +title);
	}
	
	
	
	
	
	
}
