package ie.nuig.ct548.assignment3.tests;

import static org.junit.Assert.*;

import org.junit.Test;


import ie.nuig.ct548.assignment3.AvgScoreDisplay;


public class AvgScoreDisplayTests extends AvgScoreDisplay{
	
	@Test
	public void createAndTest() {
		AvgScoreDisplay avgDisplay = new AvgScoreDisplay();
		
		assertNotNull(avgDisplay);
	}
	//Testing AvgScoreDisplay update method with nullPointerException
		@Test (expected = NullPointerException.class)
		public void updateNullObserver() {
			
			AvgScoreDisplay avgDisplay = new AvgScoreDisplay();
			avgDisplay.update(null, null);
		}
	
	

}
