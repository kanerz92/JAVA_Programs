package ie.nuig.ct548.assignment3.tests;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

import ie.nuig.ct548.assignment3.AvgScoreDisplay;
import ie.nuig.ct548.assignment3.CricketData;
import ie.nuig.ct548.assignment3.CurrentScoreDisplay;

public class CurrentScoreDisplayTests extends CurrentScoreDisplay{

	//Testing CurrentScoreDsiplay object is created from constructor
	@Test
	public void createAndTest() {
		CurrentScoreDisplay ccDisplay = new CurrentScoreDisplay();
		
		assertNotNull(ccDisplay);
	}
	//Testing CurrentScoreDisplay update method with nullPointerException
	@Test (expected = NullPointerException.class)
	public void updateNullObserver() {
		
		CurrentScoreDisplay ccd = new CurrentScoreDisplay();
		ccd.update(null, null);
	}

}
