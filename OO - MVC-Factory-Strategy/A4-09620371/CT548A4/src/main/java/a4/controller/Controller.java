package a4.controller;

import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import a4.model.*;
import a4.view.*;

/**
 * Controller class acts as a bridge between the views and the models.
 */
public class Controller {

	private VideoCatalogueView mainView;
	private AddItemView aiView;
	private SwitchProfileView profileView;
	private ItemDetails infoView;
	private YearView yearView;
	private GenreView genreView;
	private Model model;
	private Factory factory;

	/**
	 * Overloaded constructor that loads the default profile view
	 */
	public Controller(VideoCatalogueView mainView, AddItemView aiView, SwitchProfileView profileView,
			ItemDetails infoView, YearView yearView, GenreView genreView, Model model) {
		this.mainView = mainView;
		this.aiView = aiView;
		this.profileView = profileView;
		this.infoView = infoView;
		this.yearView = yearView;
		this.genreView = genreView;
		this.model = model;
		loadMainView(model.getProfiles().get(0));
	}

	/**
	 * This method loads up the main view, adds action listeners to the buttons
	 */
	public void loadMainView(Profiles profiles) {
		mainView.getSelectProfileButton().addActionListener(e -> loadProfileView());
		mainView.getAddNewItemButton().addActionListener(e -> loadNewItem());
		mainView.getYearButton().addActionListener(e -> loadYearView());
		mainView.getGenreButton().addActionListener(e -> loadGenreView());
		mainView.getProfileName().setText("User Profile: " + profiles.getName());
		Genres favGenre = profiles.getPreferredGenre();

		/*
		 * This resets all the JLabels in the view to blank
		 */
		for (JLabel itemLabels : mainView.getElements()) {
			itemLabels.setText("");
		}
		/*
		 * Takes all of the Item titles from the Inventory of sorted Films and TvSeries
		 * objects in the model class and adds the to the view via enhanced for loop,
		 * also adding a MouseListener to open the Item Details screen when clicked
		 */
		int x = 0;
		for (Items items : model.getInventory()) {
			if (items.getGenre().contains(favGenre)) {
				mainView.getElements().get(x).setText(items.getTitle());
				mainView.getElements().get(x).addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						loadDetailsView(items);
					}
				});
				x++;

				/*
				 * Does the same as above for the year of the item but does not add a
				 * MouseListener
				 */
				mainView.getElements().get(x).setText(String.valueOf(items.getYear()));
				x++;
				/*
				 * Takes the genre and builds a string of all the Genres from that particular
				 * Item, then adds it to the sreen
				 */
				StringBuilder stringBuilder = new StringBuilder();
				for (int a = 0; a < items.getGenre().size() - 1; a++) {
					stringBuilder.append(items.getGenre().get(a).getGenre());
					stringBuilder.append(", ");
				}
				stringBuilder.append(items.getGenre().get(items.getGenre().size() - 1).getGenre());
				mainView.getElements().get(x).setText(stringBuilder.toString());
				x++;
			}
		}
		mainView.getMainViewFrame().setVisible(true);
	}

	public void loadProfileView() {
		/*
		 * Uses an enhanced for loop to create JButtons for each of the profiles and
		 * reloads the main view with the recommendations for that profile
		 */
		int y = 50;
		for (Profiles profiles : model.getProfiles()) {
			JButton currentProfile = new JButton(profiles.getName());
			currentProfile.setBounds(100, y, 95, 50);
			currentProfile.addActionListener(e -> loadMainView(profiles));
			profileView.getProfilesViewFrame().getContentPane().add(currentProfile);
			y += 100;
		}
		profileView.getProfilesViewFrame().setVisible(true);
	}

	/*
	 * This method creates a new Item and is where the factory method is used
	 */
	public void createNewItem() {
		/*
		 * Creates a factory object and checks to see if the user has clicked the tv
		 * series checkbox and returns either a TvSeries or Films object based on that
		 */
		Items prop;
		factory = new Factory();
		boolean selection = aiView.getCheckbox().isSelected();
		prop = factory.itemType(selection);

		/*
		 * Creates an array of People objects for the cast input from user, checks to
		 * see if they already exist, if they do it adds them to an ArrayList
		 */
		String cast = aiView.getCastText().getText();
		String[] splitCasts = cast.split(", ");
		ArrayList<People> allPeople = new ArrayList<People>();
		for (String s : splitCasts) {
			if (model.getEveryPerson().containsKey(s)) {
				for (People p : model.getEveryPerson().get(s)) {
					allPeople.add(p);
				}
			} else {
				/*
				 * If they don't exists, it adds them to an TreeSet in order to make new People
				 * objects then both are added into the TreeMap of everyPerson from the model
				 * class
				 */
				People person = new People(s);
				TreeSet<People> castSet = new TreeSet<People>();
				castSet.add(person);
				model.getEveryPerson().put(s, castSet);
				allPeople.add(person);
			}
		}
		prop.setCast(allPeople);

		/*
		 * Sets the title, description and year form user input
		 */
		prop.setTitle(aiView.getTitleText().getText());
		prop.setDescription(aiView.getDescriptionText().getText());
		int value = (Integer) aiView.getYearText().getValue();
		prop.setYear(value);

		/*
		 * Performs the exact same functions for genres as it did for cast
		 */
		String string = aiView.getGenreText().getText();
		String[] splitGenres = string.split(", ");
		ArrayList<Genres> allGenres = new ArrayList<Genres>();
		for (String s : splitGenres) {
			if (!model.getEveryGenre().containsKey(s)) {
				Genres genres = new Genres(s);
				allGenres.add(genres);
			} else {
				for (Genres g : model.getEveryGenre().get(s)) {
					allGenres.add(g);
				}
			}
		}
		prop.setGenre(allGenres);

		/*
		 * To create the director or creator, depending on the boolean from the
		 * checkbox, we either cast the Item to a Films or TvSeries object
		 */
		boolean selected = aiView.getCheckbox().isSelected();
		if (!selected) {
			Films film = (Films) prop;
			String key = aiView.getDirectorText().getText();
			/*
			 * Checks if People object exists, if it does, it sets it
			 */
			if (model.getEveryPerson().containsKey(key)) {
				for (People p : model.getEveryPerson().get(key)) {
					film.setDirector(p);
				}
			} else {
				/*
				 * If People object doesn't exist it creates one and adds one to the main
				 * TreeMap
				 */
				People person = new People(key);
				film.setDirector(person);
				TreeSet<People> folks = new TreeSet<People>();
				model.getEveryPerson().put(person.getName(), folks);
			}
			/*
			 * Adds the finished film Item to the Inventory TreeSet
			 */
			model.getInventory().add(film);

			/*
			 * Adds the newly created object to the sorted genres TreeMap, creating a new
			 * Genres object if the inputed one doesn't already exist
			 */
			for (Genres genres : film.getGenre()) {
				if (!model.getSortedGenres().containsKey(genres)) {
					TreeSet<Items> genreSet = new TreeSet<Items>();
					genreSet.add(film);
					model.getSortedGenres().put(genres, genreSet);
				} else {
					model.getSortedGenres().get(genres).add(film);
				}
			}
			/*
			 * Similarly adds the newly created object to the sorted years TreeMap
			 */
			if (!model.getSortedYears().containsKey(film.getYear())) {
				TreeSet<Items> yearSet = new TreeSet<Items>();
				yearSet.add(film);
				model.getSortedYears().put(film.getYear(), yearSet);
			} else {
				model.getSortedYears().get(film.getYear()).add(film);
			}
		} else {
			/*
			 * Casts prop to TvSeries object and performs the same actions for setting the
			 * creator as it did for setting the director
			 */
			TvSeries tv = (TvSeries) prop;
			String key = aiView.getDirectorText().getText();
			if (model.getEveryPerson().containsKey(key)) {
				for (People p : model.getEveryPerson().get(key)) {
					tv.setCreator(p);
				}
			} else {
				People person = new People(key);
				tv.setCreator(person);
				TreeSet<People> folks = new TreeSet<People>();
				folks.add(person);
				model.getEveryPerson().put(person.getName(), folks);
			}
			/*
			 * Add TvSeries object to Inventory TreeSet
			 */
			model.getInventory().add(tv);

			/*
			 * Adds TvSeries object to sorted genres and years TreeMaps
			 */
			for (Genres genres : tv.getGenre()) {
				if (!model.getSortedGenres().containsKey(genres)) {
					TreeSet<Items> genreSet = new TreeSet<Items>();
					genreSet.add(tv);
					model.getSortedGenres().put(genres, genreSet);
				} else {
					model.getSortedGenres().get(genres).add(tv);
				}
			}
			if (model.getSortedYears().containsKey(tv.getYear())) {
				model.getSortedYears().get(tv.getYear()).add(tv);
			} else {
				TreeSet<Items> yearSet = new TreeSet<Items>();
				yearSet.add(tv);
				model.getSortedYears().put(tv.getYear(), yearSet);
			}
		}
		aiView.getAddItemViewFrame().setVisible(false);
	}

	/**
	 * Adds ActionListener to save button
	 */
	public void loadNewItem() {
		aiView.getSaveButton().addActionListener(e -> createNewItem());
		aiView.getAddItemViewFrame().setVisible(true);
	}

	/*
	 * Loads the details of each item
	 */
	public void loadDetailsView(Items items) {
		/*
		 * Adding ActionLIstener to close the frame and setting the text, description
		 * and year from the Item object
		 */
		infoView.getBackButton().addActionListener(e -> infoView.getItemDetailsViewFrame().setVisible(false));
		infoView.getTitleText().setText(items.getTitle());
		infoView.getDescriptionText().setText(items.getDescription());
		infoView.getYearText().setValue(items.getYear());

		/*
		 * Getting the genres from the Item object, appending and setting them
		 */
		StringBuilder stringBuilder = new StringBuilder(items.getGenre().get(0).getGenre());
		for (int a = 1; a < items.getGenre().size(); a++) {
			stringBuilder.append(", ");
			stringBuilder.append(items.getGenre().get(a).getGenre());
		}
		infoView.getGenreText().setText(stringBuilder.toString());
		infoView.getItemDetailsViewFrame().setVisible(true);

		/*
		 * Checks to see if the Item object is a Film or a tv series and setting the
		 * director/creator element accordingly
		 */
		if (items instanceof TvSeries) {
			TvSeries tvSeries = (TvSeries) items;
			infoView.getDirectorText().setText(tvSeries.getCreator().getName());
		} else {
			Films films = (Films) items;
			infoView.getDirectorText().setText(films.getDirector().getName());
		}
		/*
		 * Getting the cast People objects from the Item object, appending and setting
		 * them
		 */
		StringBuilder stringBuild = new StringBuilder("");
		for (People people : items.getCast()) {
			stringBuild.append(people.getName());
			stringBuild.append(", ");
		}
		infoView.getCastText().setText(stringBuild.toString());
		infoView.getItemDetailsViewFrame().setVisible(true);
	}

	public void loadYearView() {
		/*
		 * Resets JLabels in order to update with new Item objects
		 */
		for (JLabel l : yearView.getElements()) {
			yearView.getYearFrame().remove(l);
		}

		/*
		 * Gets the year from the sorted years TreeMap and puts them into a set in
		 * descending order, then uses an enhanced for loop which creates a new JLabel
		 * with each Item in the set and adds them to the ArrayList of JLabels in the
		 * year view
		 */
		int y = 15;
		Set<Integer> years = model.getSortedYears().descendingKeySet();
		for (Integer a : years) {
			JLabel year = new JLabel(a.toString());
			year.setBounds(20, y, 90, 35);
			yearView.getYearFrame().getContentPane().add(year);
			yearView.getElements().add(year);

			/*
			 * Does the same for the above but for Item titles, adding an ActionListener to
			 * load the details of each Item
			 */
			for (Items items : model.getSortedYears().get(a)) {
				JLabel title = new JLabel(items.getTitle());
				title.setForeground(Color.blue);
				title.setBounds(15, (y + 15), 120, 35);
				title.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						loadDetailsView(items);
					}
				});
				yearView.getYearFrame().getContentPane().add(title);
				yearView.getElements().add(title);
				y += 20;
			}
			y += 35;
		}
		yearView.getYearFrame().setVisible(true);
	}

	/**
	 * Does the exact same as the method above but works on genres rather than years
	 */
	public void loadGenreView() {
		for (JLabel l : genreView.getElements()) {
			genreView.getGenreFrame().remove(l);
		}
		int y = 15;
		Set<Genres> genres = model.getSortedGenres().keySet();
		for (Genres genre : genres) {
			JLabel gLabel = new JLabel(genre.getGenre());
			gLabel.setBounds(20, y, 90, 35);
			genreView.getGenreFrame().getContentPane().add(gLabel);
			genreView.getElements().add(gLabel);
			TreeSet<Items> ts = model.getSortedGenres().get(genre);
			for (Items items : ts) {
				JLabel tLabel = new JLabel(items.getTitle());
				tLabel.setForeground(Color.blue);
				tLabel.setBounds(15, (y + 15), 120, 35);
				tLabel.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						loadDetailsView(items);
					}
				});
				genreView.getGenreFrame().getContentPane().add(tLabel);
				genreView.getElements().add(tLabel);
				y += 20;
			}
			y += 35;
		}
		genreView.getGenreFrame().setVisible(true);
	}
}