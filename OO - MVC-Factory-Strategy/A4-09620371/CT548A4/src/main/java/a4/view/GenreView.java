package a4.view;

import java.awt.BorderLayout;
import java.util.*;
import javax.swing.*;


 // Class for the sorted by genre view which creates all the Swing elements,
 // Adding the relevant JLabel elements into an ArrayList so they can be changed
 // dynamically with getters and setters for all
 

public class GenreView {

	private ArrayList<JLabel> elements;

	private JFrame genreFrame;

	public GenreView() {
		genreFrame = new JFrame("List By Genre");
		genreFrame.getContentPane().setLayout(new BorderLayout());
		genreFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		genreFrame.getContentPane().setLayout(null);
		genreFrame.setSize(268, 894);
		genreFrame.setLocation(700, 50);
		genreFrame.setVisible(false);
		elements = new ArrayList<JLabel>();
	}

	public ArrayList<JLabel> getElements() {
		return elements;
	}

	public void setElements(ArrayList<JLabel> elements) {
		this.elements = elements;
	}

	public JFrame getGenreFrame() {
		return genreFrame;
	}

	public void setGenreFrame(JFrame genreFrame) {
		this.genreFrame = genreFrame;
	}
}
