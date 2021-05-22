package a4.view;

import java.awt.*;
import java.util.*;
import javax.swing.*;


 // Class for the main view which creates all the swing elements, Adding
 // the relevant JLabel elements into an ArrayList so they can be changed
 // dynamically, with getters and setters for all
 
public class VideoCatalogueView {

	private ArrayList<JLabel> elements;
	private JFrame mainViewFrame;
	private JLabel itemTitle1;
	private JLabel itemTitle2;
	private JLabel itemTitle3;
	private JLabel itemTitle4;
	private JLabel itemTitle5;
	private JLabel itemYear;
	private JLabel itemYear2;
	private JLabel itemYear3;
	private JLabel itemYear4;
	private JLabel itemYear5;
	private JLabel itemGenre;
	private JLabel itemGenre2;
	private JLabel itemGenre3;
	private JLabel itemGenre4;
	private JLabel itemGenre5;
	private JLabel profileName;
	private JButton selectProfileButton;
	private JButton addNewItemButton;
	private JButton yearButton;
	private JButton genreButton;

	public VideoCatalogueView() {

		mainViewFrame = new JFrame("Video Catalogue");
		mainViewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainViewFrame.setSize(758, 361);
		mainViewFrame.setLocation(600, 250);
		mainViewFrame.setVisible(false);

		selectProfileButton = new JButton("Switch Profile");
		selectProfileButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		selectProfileButton.setBounds(15, 39, 200, 36);
		mainViewFrame.getContentPane().add(selectProfileButton);

		addNewItemButton = new JButton("Add New");
		addNewItemButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addNewItemButton.setBounds(15, 105, 200, 40);
		mainViewFrame.getContentPane().add(addNewItemButton);

		yearButton = new JButton("List By Year");
		yearButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		yearButton.setBounds(15, 177, 200, 36);
		mainViewFrame.getContentPane().add(yearButton);

		genreButton = new JButton("List By Genre");
		genreButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		genreButton.setBounds(15, 245, 200, 36);
		mainViewFrame.getContentPane().add(genreButton);

		profileName = new JLabel("user");
		profileName.setFont(new Font("Tahoma", Font.BOLD, 14));
		profileName.setBounds(510, 15, 200, 20);
		mainViewFrame.getContentPane().add(profileName);

		itemTitle1 = new JLabel("Test1");
		itemTitle1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemTitle1.setForeground(Color.blue);
		itemTitle1.setBounds(235, 50, 145, 45);
		mainViewFrame.getContentPane().add(itemTitle1);

		itemTitle2 = new JLabel("Test2");
		itemTitle2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemTitle2.setForeground(Color.blue);
		itemTitle2.setBounds(235, 100, 145, 45);
		mainViewFrame.getContentPane().add(itemTitle2);

		itemTitle3 = new JLabel("Test3");
		itemTitle3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemTitle3.setForeground(Color.blue);
		itemTitle3.setBounds(235, 150, 145, 45);
		mainViewFrame.getContentPane().add(itemTitle3);

		itemTitle4 = new JLabel("Test4");
		itemTitle4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemTitle4.setForeground(Color.blue);
		itemTitle4.setBounds(235, 200, 145, 45);
		mainViewFrame.getContentPane().add(itemTitle4);

		itemTitle5 = new JLabel("Test5");
		itemTitle5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemTitle5.setForeground(Color.blue);
		itemTitle5.setBounds(235, 250, 145, 45);
		mainViewFrame.getContentPane().add(itemTitle5);

		itemYear = new JLabel("year1");
		itemYear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemYear.setBounds(390, 50, 55, 45);
		mainViewFrame.getContentPane().add(itemYear);

		itemYear2 = new JLabel("year2");
		itemYear2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemYear2.setBounds(390, 100, 90, 45);
		mainViewFrame.getContentPane().add(itemYear2);

		itemYear3 = new JLabel("year3");
		itemYear3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemYear3.setBounds(390, 150, 90, 45);
		mainViewFrame.getContentPane().add(itemYear3);

		itemYear4 = new JLabel("year4");
		itemYear4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemYear4.setBounds(390, 200, 90, 45);
		mainViewFrame.getContentPane().add(itemYear4);

		itemYear5 = new JLabel("year5");
		itemYear5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemYear5.setBounds(390, 250, 90, 45);
		mainViewFrame.getContentPane().add(itemYear5);

		itemGenre = new JLabel("genre");
		itemGenre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemGenre.setBounds(510, 50, 200, 45);
		mainViewFrame.getContentPane().add(itemGenre);

		itemGenre2 = new JLabel("genre2");
		itemGenre2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemGenre2.setBounds(510, 100, 200, 45);
		mainViewFrame.getContentPane().add(itemGenre2);

		itemGenre3 = new JLabel("genre3");
		itemGenre3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemGenre3.setBounds(510, 150, 200, 45);
		mainViewFrame.getContentPane().add(itemGenre3);

		itemGenre4 = new JLabel("genre4");
		itemGenre4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemGenre4.setBounds(510, 200, 222, 45);
		mainViewFrame.getContentPane().add(itemGenre4);

		itemGenre5 = new JLabel("genre5");
		itemGenre5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemGenre5.setBounds(510, 250, 222, 45);
		mainViewFrame.getContentPane().add(itemGenre5);

		elements = new ArrayList<JLabel>();
		elements.add(itemTitle1);
		elements.add(itemYear);
		elements.add(itemGenre);

		elements.add(itemTitle2);
		elements.add(itemYear2);
		elements.add(itemGenre2);

		elements.add(itemTitle3);
		elements.add(itemYear3);
		elements.add(itemGenre3);

		elements.add(itemTitle4);
		elements.add(itemYear4);
		elements.add(itemGenre4);

		elements.add(itemTitle5);
		elements.add(itemYear5);
		elements.add(itemGenre5);
		mainViewFrame.getContentPane().setLayout(null);
	}

	public ArrayList<JLabel> getElements() {
		return elements;
	}

	public void setElements(ArrayList<JLabel> elements) {
		this.elements = elements;
	}

	public JFrame getMainViewFrame() {
		return mainViewFrame;
	}

	public void setMainViewFrame(JFrame mainViewFrame) {
		this.mainViewFrame = mainViewFrame;
	}

	public JLabel getItemTitle1() {
		return itemTitle1;
	}

	public void setItemTitle1(JLabel itemTitle1) {
		this.itemTitle1 = itemTitle1;
	}

	public JLabel getItemTitle2() {
		return itemTitle2;
	}

	public void setItemTitle2(JLabel itemTitle2) {
		this.itemTitle2 = itemTitle2;
	}

	public JLabel getItemTitle3() {
		return itemTitle3;
	}

	public void setItemTitle3(JLabel itemTitle3) {
		this.itemTitle3 = itemTitle3;
	}

	public JLabel getItemTitle4() {
		return itemTitle4;
	}

	public void setItemTitle4(JLabel itemTitle4) {
		this.itemTitle4 = itemTitle4;
	}

	public JLabel getItemTitle5() {
		return itemTitle5;
	}

	public void setItemTitle5(JLabel itemTitle5) {
		this.itemTitle5 = itemTitle5;
	}

	public JLabel getItemYear() {
		return itemYear;
	}

	public void setItemYear(JLabel itemYear) {
		this.itemYear = itemYear;
	}

	public JLabel getItemYear2() {
		return itemYear2;
	}

	public void setItemYear2(JLabel itemYear2) {
		this.itemYear2 = itemYear2;
	}

	public JLabel getItemYear3() {
		return itemYear3;
	}

	public void setItemYear3(JLabel itemYear3) {
		this.itemYear3 = itemYear3;
	}

	public JLabel getItemYear4() {
		return itemYear4;
	}

	public void setItemYear4(JLabel itemYear4) {
		this.itemYear4 = itemYear4;
	}

	public JLabel getItemYear5() {
		return itemYear5;
	}

	public void setItemYear5(JLabel itemYear5) {
		this.itemYear5 = itemYear5;
	}

	public JLabel getItemGenre() {
		return itemGenre;
	}

	public void setItemGenre(JLabel itemGenre) {
		this.itemGenre = itemGenre;
	}

	public JLabel getItemGenre2() {
		return itemGenre2;
	}

	public void setItemGenre2(JLabel itemGenre2) {
		this.itemGenre2 = itemGenre2;
	}

	public JLabel getItemGenre3() {
		return itemGenre3;
	}

	public void setItemGenre3(JLabel itemGenre3) {
		this.itemGenre3 = itemGenre3;
	}

	public JLabel getItemGenre4() {
		return itemGenre4;
	}

	public void setItemGenre4(JLabel itemGenre4) {
		this.itemGenre4 = itemGenre4;
	}

	public JLabel getItemGenre5() {
		return itemGenre5;
	}

	public void setItemGenre5(JLabel itemGenre5) {
		this.itemGenre5 = itemGenre5;
	}

	public JLabel getProfileName() {
		return profileName;
	}

	public void setProfileName(JLabel profileName) {
		this.profileName = profileName;
	}

	public JButton getSelectProfileButton() {
		return selectProfileButton;
	}

	public void setSelectProfileButton(JButton selectProfileButton) {
		this.selectProfileButton = selectProfileButton;
	}

	public JButton getAddNewItemButton() {
		return addNewItemButton;
	}

	public void setAddNewItemButton(JButton addNewItemButton) {
		this.addNewItemButton = addNewItemButton;
	}

	public JButton getYearButton() {
		return yearButton;
	}

	public void setYearButton(JButton yearButton) {
		this.yearButton = yearButton;
	}

	public JButton getGenreButton() {
		return genreButton;
	}

	public void setGenreButton(JButton genreButton) {
		this.genreButton = genreButton;
	}

}