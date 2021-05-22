package a4.model;

import java.util.ArrayList;


 // Abstract class that has common elements of TVSeries and Films form the JSON
 // and implements Comparable of items
 
public abstract class Items implements Comparable<Items> {

	private String title, description;
	private int year;
	private ArrayList<Genres> genres;
	private ArrayList<People> cast;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year2) {
		this.year = year2;
	}

	public ArrayList<Genres> getGenre() {
		return genres;
	}

	public void setGenre(ArrayList<Genres> genres) {
		this.genres = genres;
	}

	public ArrayList<People> getCast() {
		return cast;
	}

	public void setCast(ArrayList<People> cast) {
		this.cast = cast;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
