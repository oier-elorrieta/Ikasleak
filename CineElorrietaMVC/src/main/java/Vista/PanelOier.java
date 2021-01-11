package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class PanelOier extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelOier() {
		setBackground(Color.MAGENTA);
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 61, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(71, 151, 89, 23);
		add(btnNewButton);

	}
}
