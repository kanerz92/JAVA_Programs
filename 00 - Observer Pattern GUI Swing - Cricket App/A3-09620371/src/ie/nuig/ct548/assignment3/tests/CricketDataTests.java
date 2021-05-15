package ie.nuig.ct548.assignment3.tests;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import ie.nuig.ct548.assignment3.AvgScoreDisplay;
import ie.nuig.ct548.assignment3.CricketData;

public class CricketDataTests extends CricketData{
	
	//Testing CricketData setScores() 
	@Test
	public void setterTest() {
		CricketData cd = new CricketData();
		cd.setScores(30, 4, 2);
		//Testing to make sure output is correct and the getter methods are working.
		assertEquals(cd.getRuns(),30);
		assertEquals(cd.getOvers(),4, 0);
		assertEquals(cd.getWickets(),2);
			
	}//Testing exception is handled correctly, negative test
	@Test (expected = NoSuchElementException.class)
	public void deleteEmptyArray() {
		CricketData cd = new CricketData();
		AvgScoreDisplay ad = new AvgScoreDisplay();
		cd.deleteObserver(ad);
	}

}
