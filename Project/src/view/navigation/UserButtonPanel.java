package view.navigation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import view.ButtonSourceType;
import view.MainFrame;

public class UserButtonPanel extends JPanel implements ButtonPanel{
	private JButton search;
	private JButton logout;
	private NavigationPanel nPanel;
	
	public UserButtonPanel(NavigationPanel nPanel){
		super();
		this.nPanel = nPanel;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.addSearchButton();
		this.addLogout();
	}
	
	private void addSearchButton(){
		search = new JButton("Search");
		search.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage(ButtonSourceType.SEARCH);
			}
		});
		this.add(search);
	}
	
	private void addLogout(){
		logout = new JButton("Logout");
		logout.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage(ButtonSourceType.LOGOUT);
			}
		});
		this.add(logout);
	}

	@Override
	public void sendMessage(ButtonSourceType type) {
		nPanel.sendMessage(type);
	}

	@Override
	public JPanel get() {
		return this;
	}
}
