package a4.model;

import java.util.*;

/**
 * Class made purely to take in the objects from the JSON file
 */
public class ItemContainer {

	ArrayList<Films> films = new ArrayList<Films>();
	ArrayList<TvSeries> tvseries = new ArrayList<TvSeries>();
	ArrayList<Genres> genres = new ArrayList<Genres>();
	ArrayList<People> people = new ArrayList<People>();
	ArrayList<Profiles> profiles = new ArrayList<Profiles>();

	public ArrayList<Films> getFilms() {
		return films;
	}

	public void setFilms(ArrayList<Films> films) {
		this.films = films;
	}

	public ArrayList<TvSeries> getTvseries() {
		return tvseries;
	}

	public void setTvseries(ArrayList<TvSeries> tvseries) {
		this.tvseries = tvseries;
	}

	public ArrayList<Genres> getGenres() {
		return genres;
	}

	public void setGenres(ArrayList<Genres> genres) {
		this.genres = genres;
	}

	public ArrayList<People> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<People> people) {
		this.people = people;
	}

	public ArrayList<Profiles> getProfiles() {
		return profiles;
	}

	public void setProfiles(ArrayList<Profiles> profiles) {
		this.profiles = profiles;
	}
}