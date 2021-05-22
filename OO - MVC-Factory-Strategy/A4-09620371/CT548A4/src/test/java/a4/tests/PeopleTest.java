package a4.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import a4.model.People;

public class PeopleTest {

	@Test
	public void createAndTest() {
		People p = new People();		
		assertNotNull(p);
	}
	
	@Test
	public void compareTest() {
		People p = new People();
		p.setName("Lucio Fulci");
		People p2 = new People();
		p2.setName("Dario Argento");
		p.compareTo(p2);
	}
}
