package a4.view;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.*;


 // Class for the Item Details view which creates all the Swing elements mostly
 // identical to the Add Items view, with the inputs disabled and with getters
 // and setters for all
 
public class ItemDetails {

	private JFrame itemDetailsViewFrame;
	private JButton backButton;
	private JCheckBoxMenuItem tvSeriesCheckbox;
	private JTextField titleText;
	private JTextArea descriptionText;
	private JSpinner yearText;
	private SpinnerNumberModel spinner;
	private JTextField genreText;
	private JTextField directorText;
	private JTextArea castText;
	private JLabel titleLabel;
	private JLabel descriptionLabel;
	private JLabel yearLabel;
	private JLabel genreLabel;
	private JLabel directorLabel;
	private JLabel castLabel;

	public ItemDetails() {

		itemDetailsViewFrame = new JFrame("Details");
		itemDetailsViewFrame.getContentPane().setLayout(new BorderLayout());
		itemDetailsViewFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		itemDetailsViewFrame.setSize(485, 600);
		itemDetailsViewFrame.setLocation(600, 250);
		itemDetailsViewFrame.setVisible(false);

		titleText = new JTextField();
		titleText.setBounds(138, 30, 280, 35);
		titleText.setEditable(false);
		itemDetailsViewFrame.getContentPane().add(titleText);

		descriptionText = new JTextArea();
		descriptionText.setWrapStyleWord(true);
		descriptionText.setLineWrap(true);
		descriptionText.setBounds(138, 90, 279, 50);
		descriptionText.setEditable(false);
		itemDetailsViewFrame.getContentPane().add(descriptionText);

		// JSpinner with JSpinnerModel to keep the years you can enter from 1900 to 2020
		spinner = new SpinnerNumberModel(1900, 1900, 2020, 1);
		yearText = new JSpinner(spinner);
		yearText.setBounds(138, 165, 279, 32);
		yearText.setEnabled(false);
		itemDetailsViewFrame.getContentPane().add(yearText);

		genreText = new JTextField();
		genreText.setBounds(138, 225, 279, 66);
		genreText.setEditable(false);
		itemDetailsViewFrame.getContentPane().add(genreText);

		directorText = new JTextField();
		directorText.setBounds(138, 309, 280, 37);
		directorText.setEditable(false);
		itemDetailsViewFrame.getContentPane().add(directorText);

		castText = new JTextArea();
		castText.setBounds(138, 367, 279, 66);
		castText.setEditable(false);
		itemDetailsViewFrame.getContentPane().add(castText);
		itemDetailsViewFrame.getContentPane().setLayout(null);

		titleLabel = new JLabel("Title:");
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		titleLabel.setBounds(15, 30, 100, 20);
		itemDetailsViewFrame.getContentPane().add(titleLabel);

		descriptionLabel = new JLabel("Description:");
		descriptionLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		descriptionLabel.setBounds(15, 90, 100, 20);
		itemDetailsViewFrame.getContentPane().add(descriptionLabel);

		yearLabel = new JLabel("Year:");
		yearLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		yearLabel.setBounds(15, 165, 100, 20);
		itemDetailsViewFrame.getContentPane().add(yearLabel);

		genreLabel = new JLabel("Genre:");
		genreLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		genreLabel.setBounds(15, 225, 100, 20);
		itemDetailsViewFrame.getContentPane().add(genreLabel);

		directorLabel = new JLabel("Director/Creator:");
		directorLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		directorLabel.setBounds(15, 309, 115, 20);
		itemDetailsViewFrame.getContentPane().add(directorLabel);

		castLabel = new JLabel("Cast:");
		castLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		castLabel.setBounds(15, 367, 100, 20);
		itemDetailsViewFrame.getContentPane().add(castLabel);

		backButton = new JButton("Back");
		backButton.setBounds(304, 473, 113, 41);
		itemDetailsViewFrame.getContentPane().add(backButton);
	}

	public JFrame getItemDetailsViewFrame() {
		return itemDetailsViewFrame;
	}

	public void setItemDetailsViewFrame(JFrame itemDetailsViewFrame) {
		this.itemDetailsViewFrame = itemDetailsViewFrame;
	}

	public JButton getBackButton() {
		return backButton;
	}

	public void setBackButton(JButton backButton) {
		this.backButton = backButton;
	}

	public JCheckBoxMenuItem getTvSeriesCheckbox() {
		return tvSeriesCheckbox;
	}

	public void setTvSeriesCheckbox(JCheckBoxMenuItem tvSeriesCheckbox) {
		this.tvSeriesCheckbox = tvSeriesCheckbox;
	}

	public JLabel getTitleLabel() {
		return titleLabel;
	}

	public void setTitleLabel(JLabel titleLabel) {
		this.titleLabel = titleLabel;
	}

	public JLabel getDescriptionLabel() {
		return descriptionLabel;
	}

	public void setDescriptionLabel(JLabel descriptionLabel) {
		this.descriptionLabel = descriptionLabel;
	}

	public JLabel getYearLabel() {
		return yearLabel;
	}

	public void setYearLabel(JLabel yearLabel) {
		this.yearLabel = yearLabel;
	}

	public JLabel getGenreLabel() {
		return genreLabel;
	}

	public void setGenreLabel(JLabel genreLabel) {
		this.genreLabel = genreLabel;
	}

	public JLabel getDirectorLabel() {
		return directorLabel;
	}

	public void setDirectorLabel(JLabel directorLabel) {
		this.directorLabel = directorLabel;
	}

	public JLabel getCastLabel() {
		return castLabel;
	}

	public void setCastLabel(JLabel castLabel) {
		this.castLabel = castLabel;
	}

	public JTextField getTitleText() {
		return titleText;
	}

	public void setTitleText(JTextField titleText) {
		this.titleText = titleText;
	}

	public JTextArea getDescriptionText() {
		return descriptionText;
	}

	public void setDescriptionText(JTextArea descriptionText) {
		this.descriptionText = descriptionText;
	}

	public JSpinner getYearText() {
		return yearText;
	}

	public void setYearText(JSpinner yearText) {
		this.yearText = yearText;
	}

	public JTextField getGenreText() {
		return genreText;
	}

	public void setGenreText(JTextField genreText) {
		this.genreText = genreText;
	}

	public JTextField getDirectorText() {
		return directorText;
	}

	public void setDirectorText(JTextField directorText) {
		this.directorText = directorText;
	}

	public JTextArea getCastText() {
		return castText;
	}

	public void setCastText(JTextArea castText) {
		this.castText = castText;
	}

	public SpinnerNumberModel getSpinner() {
		return spinner;
	}

	public void setSpinner(SpinnerNumberModel spinner) {
		this.spinner = spinner;
	}

}