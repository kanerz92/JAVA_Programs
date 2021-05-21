package a4.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import a4.model.Factory;

public class FactoryTest {

	@Test
	public void test() {
		Factory f = new Factory();
		assertNotNull(f);
	}
}