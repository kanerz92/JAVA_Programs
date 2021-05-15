package ie.nuig.ct548.assignment3;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

//Observer class that updates

public class AvgScoreDisplay extends JFrame implements Observer{

	//Observer class that updates
	private JLabel runsperover;
	private JLabel runsperwicket;
	private JLabel wicketsperovers;
	
	public AvgScoreDisplay() {
		
		super("Average Scores");
		this.setLayout(new GridLayout(3,3));
		runsperover = new JLabel();
		runsperwicket = new JLabel();
		wicketsperovers = new JLabel();
		this.add(new JLabel("Runs per over: "));
		this.add(runsperover);
	
		this.add(new JLabel("Runs per wickets: "));
		this.add(runsperwicket);
		this.add(new JLabel("Wickets per overs: "));
		this.add(wicketsperovers);
		this.pack();
		this.setSize(400, 300);
		this.setLocation(1000, 500);
		this.setVisible(true);
		
	}

	public void update(Observable o, Object arg) {
		if(o == null) {
			throw new NullPointerException();
		}
		
		CricketData run = (CricketData) o;
		String runsString = Float.toString((run.getRuns()/run.getOvers()));
		//Updating Runs per Over JLabel
		runsperover.setText(runsString);
		
		String oversString = Float.toString(run.getRuns()/run.getWickets());
		
		runsperwicket.setText(oversString);
		
		String wicketsString = Float.toString((run.getWickets()/run.getOvers()));
		
		wicketsperovers.setText(wicketsString);
	
		
	}

}
