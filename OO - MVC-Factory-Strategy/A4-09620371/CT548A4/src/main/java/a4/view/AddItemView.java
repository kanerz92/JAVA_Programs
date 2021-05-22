package a4.view;

import java.awt.Font;
import javax.swing.*;


 // Class for the Add Item Details view which creates all the Swing elements with
 // getters and setters for all
 
public class AddItemView {

	private JFrame addItemViewFrame;
	private JTextField titleText;
	private JTextArea descriptionText;
	private JSpinner yearText;
	private JTextField genreText;
	private JTextField directorText;
	private JTextField castText;
	private JCheckBoxMenuItem checkbox;
	private JButton saveButton;
	private SpinnerNumberModel spinner;
	private JLabel titleLabel;
	private JLabel descriptionLabel;
	private JLabel yearLabel;
	private JLabel genreLabel;
	private JLabel directorLabel;
	private JLabel castLabel;

	public AddItemView() {

		addItemViewFrame = new JFrame("Add Item");
		addItemViewFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		addItemViewFrame.setSize(485, 600);
		addItemViewFrame.setLocation(600, 250);
		addItemViewFrame.setVisible(false);

		saveButton = new JButton("Save");
		saveButton.setBounds(304, 473, 113, 41);
		addItemViewFrame.getContentPane().add(saveButton);

		checkbox = new JCheckBoxMenuItem("Tv Series");
		checkbox.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		checkbox.setBounds(50, 464, 100, 50);
		addItemViewFrame.getContentPane().add(checkbox);

		titleText = new JTextField();
		titleText.setBounds(138, 30, 280, 35);
		addItemViewFrame.getContentPane().add(titleText);

		descriptionText = new JTextArea();
		descriptionText.setWrapStyleWord(true);
		descriptionText.setBounds(138, 90, 279, 50);
		addItemViewFrame.getContentPane().add(descriptionText);

		spinner = new SpinnerNumberModel(1900, 1900, 2020, 1);
		yearText = new JSpinner(spinner);
		yearText.setBounds(138, 165, 279, 32);
		addItemViewFrame.getContentPane().add(yearText);

		genreText = new JTextField();
		genreText.setBounds(138, 225, 279, 66);
		addItemViewFrame.getContentPane().add(genreText);

		directorText = new JTextField();
		directorText.setBounds(138, 309, 280, 37);
		addItemViewFrame.getContentPane().add(directorText);

		castText = new JTextField();
		castText.setBounds(138, 367, 279, 66);
		addItemViewFrame.getContentPane().add(castText);

		titleLabel = new JLabel("Title:");
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		titleLabel.setBounds(15, 30, 100, 20);
		addItemViewFrame.getContentPane().add(titleLabel);

		descriptionLabel = new JLabel("Description:");
		descriptionLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		descriptionLabel.setBounds(15, 90, 100, 20);
		addItemViewFrame.getContentPane().add(descriptionLabel);

		yearLabel = new JLabel("Year:");
		yearLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		yearLabel.setBounds(15, 165, 100, 20);
		addItemViewFrame.getContentPane().add(yearLabel);

		genreLabel = new JLabel("Genre:");
		genreLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		genreLabel.setBounds(15, 225, 100, 20);
		addItemViewFrame.getContentPane().add(genreLabel);

		directorLabel = new JLabel("Director/Creator:");
		directorLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		directorLabel.setBounds(15, 309, 115, 20);
		addItemViewFrame.getContentPane().add(directorLabel);

		castLabel = new JLabel("Cast:");
		castLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		castLabel.setBounds(15, 367, 100, 20);
		addItemViewFrame.getContentPane().add(castLabel);

		addItemViewFrame.getContentPane().setLayout(null);
	}

	public JFrame getAddItemViewFrame() {
		return addItemViewFrame;
	}

	public void setAddItemViewFrame(JFrame addItemViewFrame) {
		this.addItemViewFrame = addItemViewFrame;
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

	public JTextField getCastText() {
		return castText;
	}

	public void setCastText(JTextField castText) {
		this.castText = castText;
	}

	public JCheckBoxMenuItem getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(JCheckBoxMenuItem checkbox) {
		this.checkbox = checkbox;
	}

	public JButton getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(JButton saveButton) {
		this.saveButton = saveButton;
	}

	public SpinnerNumberModel getSpinner() {
		return spinner;
	}

	public void setSpinner(SpinnerNumberModel spinner) {
		this.spinner = spinner;
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

}