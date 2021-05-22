package a4.view;

import javax.swing.JFrame;


 // Class for the switch profile view which creates all the Swing elements, It is
 // almost entirely populated by the controller class with getters and setters
 // for all
 
public class SwitchProfileView {

	private JFrame profilesViewFrame;

	public SwitchProfileView() {
		profilesViewFrame = new JFrame("Select User");
		profilesViewFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		profilesViewFrame.setSize(300, 500);
		profilesViewFrame.getContentPane().setLayout(null);
		profilesViewFrame.setVisible(false);
	}

	public JFrame getProfilesViewFrame() {
		return profilesViewFrame;
	}

	public void setProfilesViewFrame(JFrame profilesViewFrame) {
		this.profilesViewFrame = profilesViewFrame;
	}
}
