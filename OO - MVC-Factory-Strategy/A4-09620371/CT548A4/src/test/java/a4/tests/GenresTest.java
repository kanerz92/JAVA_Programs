package a4.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import a4.model.Genres;

public class GenresTest {

	@Test
	public void createAndTest() {
		Genres g = new Genres("Giallo");		
		assertNotNull(g);
	}
	
	@Test
	public void compareTest() {
		Genres g = new Genres();
		g.setGenre("Fantasy");
		Genres g2 = new Genres();
		g2.setGenre("Noir");
		g.compareTo(g2);
	}

}
