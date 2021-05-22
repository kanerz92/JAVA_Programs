package a4.tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import a4.model.ItemContainer;

public class ItemContainerTest {

	@Test
	public void test() {
		ItemContainer ic = new ItemContainer();
		assertNotNull(ic);
	}

}
