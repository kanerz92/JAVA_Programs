package ie.nuig.ct548.assignment3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;



public class CricketMatchApp {
	public static void main (String[] args) {
	//Creating CurrentScoreDisplay object
	CurrentScoreDisplay currentDisplay = new CurrentScoreDisplay();
	//Creating CricketData object
	CricketData cd = new CricketData();
	//CricketData object calling addObserver() on currentDisplay object
	cd.addObserver(currentDisplay);
	//Creating AvgScoreDisplay object
	AvgScoreDisplay avgDisplay = new AvgScoreDisplay();
	//CricketData object calling addObserver() on avgDisplay object
	cd.addObserver(avgDisplay);
	
	//Creating JFrame
	JFrame mainFrame = new JFrame("Main Window");
	
	
	mainFrame.setLayout(new GridLayout(4,2, 10, 10));
	mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	//Add the label to layout
	JLabel label1 = new JLabel("Runs:" );
	mainFrame.add(label1);
	JFormattedTextField textField1 = new JFormattedTextField(NumberFormat.getIntegerInstance());
	mainFrame.add(textField1);
	
	
	JLabel label2 = new JLabel("Overs:" );
	mainFrame.add(label2);
	JFormattedTextField textField2 = new JFormattedTextField(NumberFormat.getIntegerInstance());
	mainFrame.add(textField2);
	
	JLabel label3 = new JLabel("Wickets:" );
	mainFrame.add(label3);
	JFormattedTextField textField3 = new JFormattedTextField(NumberFormat.getIntegerInstance());
	mainFrame.add(textField3);
	
	JButton button = new JButton("Submit Score");
	mainFrame.add(button);
	
	mainFrame.pack();
	mainFrame.setSize(400, 300);
	mainFrame.setLocation(550, 350);
	mainFrame.setVisible(true);
	
	//Adding ActionListener to our button
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int runs =((Number)textField1.getValue()).intValue();
			float overs =((Number)textField2.getValue()).intValue();
			int wickets =((Number)textField3.getValue()).intValue();
			//Setting scores from inputs
			cd.setScores(runs, overs, wickets);
			
			
		}
	});
}
}
