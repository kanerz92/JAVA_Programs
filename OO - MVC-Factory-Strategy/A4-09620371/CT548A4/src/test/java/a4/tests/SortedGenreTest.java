package a4.tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import a4.model.SortedGenre;

public class SortedGenreTest {

	@Test
	public void test() {
		SortedGenre sg = new SortedGenre();
		assertNotNull(sg);
	}

}
