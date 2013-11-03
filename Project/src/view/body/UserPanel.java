package view.body;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UserPanel extends JPanel implements DisplayPanel{
	private JTextArea textarea;
	private JComboBox jcBox;
	private JButton search;
	private BodyPanel bPanel;
	
	public UserPanel(BodyPanel bPanel){
		super();
		this.bPanel = bPanel;
		this.textarea = new JTextArea("User Page");
		this.add(textarea);
	}
	
	@Override
	public JPanel get() {
		return this;
	}

	@Override
	public void display(String result) {
		textarea.setText(result);
		this.revalidate();
	}
	
	
}
