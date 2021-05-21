
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import a4.controller.*;
import a4.model.*;
import a4.view.*;

public class Main {

	public static void main(String[] args) {

		ItemContainer ic = new ItemContainer();
		ObjectMapper objectMapper = new ObjectMapper();
		Context contextForYear = new Context(new SortedYear());
		Context contextForGenre = new Context(new SortedGenre());
		
		/*
		 * Using jackson ObjectMapper to read data from a json file
		 */
		try {
			ic = objectMapper.readValue(new File("data.json"), ItemContainer.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * Creating model object and populating it form the ItemContainer
		 */
		Model model = new Model(ic);
		model.setProfiles(ic.getProfiles());
		model.populatePeopleMap(ic);
		model.populateGenreMap(ic);
		
		/*
		 * Implementation of the Strategy pattern
		 */
		contextForYear.executeStrategy(model);
		contextForGenre.executeStrategy(model);

		/*
		 * Initializing all views
		 */
		VideoCatalogueView mainView = new VideoCatalogueView();
		AddItemView aiView = new AddItemView();
		SwitchProfileView profileView = new SwitchProfileView();
		ItemDetails infoView = new ItemDetails();
		YearView yearView = new YearView();
		GenreView genreView = new GenreView();

		/*
		 * Initializing controller
		 */
		Controller c = new Controller(mainView, aiView, profileView, infoView, yearView, genreView, model);
	}
}