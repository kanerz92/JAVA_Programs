package a4.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


 // Genre class implements the compareTo method for Genres
 // and uses Jackson annotations to identify it's id

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "gid", scope = Genres.class)
public class Genres implements Comparable<Genres> {

	private int gid;
	private String genre;
	private static int numGID = 10;

	public Genres() {
	}

	
	 // Overloaded constructor that takes in a name and assigns an id based on the
	 // number in the JSON file
	 
	public Genres(String genre) {
		this.genre = genre;
		this.setGid(getNumGID());
		numGID++;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public static int getNumGID() {
		return numGID;
	}

	public static void setNumGID(int numGID) {
		Genres.numGID = numGID;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format(genre);
	}

	public int compareTo(Genres o) {
		return this.getGenre().compareTo(o.getGenre());
	}
}
