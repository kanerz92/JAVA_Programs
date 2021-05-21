package a4.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import a4.model.Films;

public class FilmsTest {

	@Test
	public void createAndTest() {
		Films f = new Films();		
		assertNotNull(f);
	}
	
	@Test
	public void compareTest() {
		Films f = new Films();
		f.setTitle("Cube");
		Films f2 = new Films();
		f2.setTitle("Saw");
		f.compareTo(f2);
	}
}
