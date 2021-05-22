package a4.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import a4.model.SortedGenre;

public class SortedYearTest {

	@Test
	public void test() {
		SortedGenre sg = new SortedGenre();
		assertNotNull(sg);
	}

}
