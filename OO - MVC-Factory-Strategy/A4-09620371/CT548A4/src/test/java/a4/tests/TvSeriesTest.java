package a4.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import a4.model.TvSeries;

public class TvSeriesTest {

	@Test
	public void createAndTest() {
		TvSeries tv = new TvSeries();		
		assertNotNull(tv);
	}
	
	@Test
	public void compareTest() {
		TvSeries tv = new TvSeries();
		tv.setTitle("Community");
		TvSeries tv2 = new TvSeries();
		tv2.setTitle("The Good Place");
		tv.compareTo(tv2);
	}
}