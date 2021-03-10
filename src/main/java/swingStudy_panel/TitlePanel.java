package swingStudy_panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TitlePanel extends JPanel {
	private JTextField tfTitleNo;
	private JTextField tfTitleName;

	public TitlePanel() {

		initialize();
	}
	

	public void setTitle(Title title) {
		tfTitleNo.setText(title.getTno() + "");
		tfTitleName.setText(title.getTname());
	}

	public Title getTitle() {
		int tNo = Integer.parseInt(tfTitleNo.getText());
		String tName = tfTitleName.getText();
		return new Title(tNo, tName);
	}
	
	public void clearTf() {
		tfTitleNo.setText("");
		tfTitleName.setText("");
	}
	private void initialize() {
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblTitleNo = new JLabel("\uC9C1\uCC45\uBC88\uD638");
		lblTitleNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTitleNo);
		
		tfTitleNo = new JTextField();
		add(tfTitleNo);
		tfTitleNo.setColumns(10);
		
		JLabel lblTitleName = new JLabel("\uC9C1\uCC45\uBA85");
		lblTitleName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTitleName);
		
		tfTitleName = new JTextField();
		tfTitleName.setColumns(10);
		add(tfTitleName);
	}

}
