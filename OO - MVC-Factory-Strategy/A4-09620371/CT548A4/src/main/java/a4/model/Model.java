package a4.model;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Model {

	private TreeSet<Items> inventory = new TreeSet<Items>();
	private ArrayList<Profiles> profiles = new ArrayList<Profiles>();
	private TreeMap<String, TreeSet<Genres>> everyGenre = new TreeMap<String, TreeSet<Genres>>();
	private TreeMap<String, TreeSet<People>> everyPerson = new TreeMap<String, TreeSet<People>>();
	private TreeMap<Genres, TreeSet<Items>> sortedGenres = new TreeMap<Genres, TreeSet<Items>>();
	private TreeMap<Integer, TreeSet<Items>> sortedYears = new TreeMap<Integer, TreeSet<Items>>();
	
	/**
	 * Overloaded constructor which takes in an ItemContainer and immediately
	 * populates the inventory TreeSet with Films and TvSeries objects
	 */
	public Model(ItemContainer i) {
		inventory.addAll(i.getFilms());
		inventory.addAll(i.getTvseries());
	}

	/**
	 * Method that populates the everyGenre TreeMap from the Genres ArrayList in the
	 * ItemContainer
	 */
	public void populateGenreMap(ItemContainer itemContainer) {
		for (Genres genre : itemContainer.getGenres()) {
			if (everyGenre.containsKey(genre.getGenre())) {
				TreeSet<Genres> genres = everyGenre.get(genre.getGenre());
				genres.add(genre);
				everyGenre.put(genre.getGenre(), genres);
			} else {
				TreeSet<Genres> tempSet = new TreeSet<Genres>();
				tempSet.add(genre);
				everyGenre.put(genre.getGenre(), tempSet);
			}
		}
	}
	
	/**
	 * Method that populates the everyPerson TreeMap from the People ArrayList in the
	 * ItemContainer
	 */
	public void populatePeopleMap(ItemContainer itemContainer) {
		for (People person : itemContainer.getPeople()) {
			if (everyPerson.containsKey(person.getName())) {
				TreeSet<People> people = everyPerson.get(person.getName());
				people.add(person);
				everyPerson.put(person.getName(), people);
			} else {
				TreeSet<People> tempSet = new TreeSet<People>();
				tempSet.add(person);
				everyPerson.put(person.getName(), tempSet);
			}
		}
	}
	
	public TreeSet<Items> getInventory() {
		return inventory;
	}

	public void setInventory(TreeSet<Items> inventory) {
		this.inventory = inventory;
	}

	public ArrayList<Profiles> getProfiles() {
		return profiles;
	}

	public void setProfiles(ArrayList<Profiles> profiles) {
		this.profiles = profiles;
	}

	public TreeMap<String, TreeSet<Genres>> getEveryGenre() {
		return everyGenre;
	}

	public void setEveryGenre(TreeMap<String, TreeSet<Genres>> everyGenre) {
		this.everyGenre = everyGenre;
	}

	public TreeMap<String, TreeSet<People>> getEveryPerson() {
		return everyPerson;
	}

	public void setEveryPerson(TreeMap<String, TreeSet<People>> everyPerson) {
		this.everyPerson = everyPerson;
	}

	public TreeMap<Genres, TreeSet<Items>> getSortedGenres() {
		return sortedGenres;
	}

	public void setSortedGenres(TreeMap<Genres, TreeSet<Items>> sortedGenres) {
		this.sortedGenres = sortedGenres;
	}

	public TreeMap<Integer, TreeSet<Items>> getSortedYears() {
		return sortedYears;
	}

	public void setSortedYears(TreeMap<Integer, TreeSet<Items>> sortedYears) {
		this.sortedYears = sortedYears;
	}
}