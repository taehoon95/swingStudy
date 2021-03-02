package swingStudy_layout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class panelAbsoulte extends JPanel {
	private JTextField textField;

	public panelAbsoulte() {
		
		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(287, 34, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(165, 134, 97, 23);
		add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(44, 222, 121, 23);
		add(rdbtnNewRadioButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(84, 95, 30, 21);
		add(comboBox);
	}
}
