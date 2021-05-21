package a4.view;

import java.awt.BorderLayout;
import java.util.*;
import javax.swing.*;

/**
 * Class for the sorted by year view which creates all the Swing elements,
 * Adding the relevant JLabel elements into an ArrayList so they can be changed
 * dynamically with getters and setters for all
 */
public class YearView {

	private JFrame yearFrame;
	private ArrayList<JLabel> elements;

	public YearView() {
		yearFrame = new JFrame("List By Year");
		yearFrame.getContentPane().setLayout(new BorderLayout());
		yearFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		yearFrame.setSize(268, 894);
		yearFrame.setLocation(300, 50);		
		yearFrame.getContentPane().setLayout(null);
		yearFrame.setVisible(false);
		elements = new ArrayList<JLabel>();
	}

	public JFrame getYearFrame() {
		return yearFrame;
	}

	public void setYearFrame(JFrame yearFrame) {
		this.yearFrame = yearFrame;
	}

	public ArrayList<JLabel> getElements() {
		return elements;
	}

	public void setElements(ArrayList<JLabel> elements) {
		this.elements = elements;
	}
}