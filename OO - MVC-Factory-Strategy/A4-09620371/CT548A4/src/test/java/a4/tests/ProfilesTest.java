package a4.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import a4.model.Genres;
import a4.model.Profiles;

public class ProfilesTest {

	@Test
	public void createAndTest() {
		Profiles g = new Profiles();		
		assertNotNull(g);
	}
	
	@Test
	public void setPreferredGenreTest() {
		Genres g = new Genres("Surrealist");
		Profiles p = new Profiles();
		p.setPreferredGenre(g);
	}
	

}
