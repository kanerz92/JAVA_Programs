package ie.nuig.ct548.assignment3;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
//Observer class that implements java built in Observer interface
public class CurrentScoreDisplay extends JFrame implements Observer{

	//Observer class that updates
	private JLabel runs;
	private JLabel overs;
	private JLabel wickets;
	//Constructor
	public CurrentScoreDisplay() {
		
		super("Current Scores");
		this.setLayout(new GridLayout(3,3));
		runs = new JLabel();
		overs = new JLabel();
		wickets = new JLabel();
		this.add(new JLabel("Runs: "));
		this.add(runs);
	
		this.add(new JLabel("Overs: "));
		this.add(overs);
		this.add(new JLabel("Wickets: "));
		this.add(wickets);
		this.pack();
		this.setSize(400, 300);
		this.setLocation(100, 500);
		this.setVisible(true);
		
	}
	//Update method with nullpointerexception for testing if CSD object is null throw exception 
	public void update(Observable o, Object arg) {
		if(o == null) {
			throw new NullPointerException();
		}
		//Updating display based on CricketData, casting to string
		CricketData run = (CricketData) o;
		String runsString = Integer.toString(run.getRuns());//.getRuns/getOvers()
		//Setting JLabel with updated string representing CricketData
		runs.setText(runsString);
		
		String oversString = Float.toString(run.getOvers());
		overs.setText(oversString);
		
		String wicketsString = Integer.toString(run.getWickets());
		wickets.setText(wicketsString);
	
		
	}

}
