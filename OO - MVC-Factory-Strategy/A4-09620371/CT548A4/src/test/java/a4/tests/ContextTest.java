package a4.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import a4.model.Context;
import a4.model.SortedYear;
public class ContextTest {

	@Test
	public void createAndTest() {
		Context c = new Context(new SortedYear());		
		assertNotNull(c);
	}

}
