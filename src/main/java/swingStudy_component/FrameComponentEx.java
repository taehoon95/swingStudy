package swingStudy_component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class FrameComponentEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn3;
	private JButton btn2;
	private JButton btn1;
	private JButton btn_1;

	public FrameComponentEx() {
		initialize();
	}

	private void initialize() {
		setTitle("\uACF5\uD1B5 \uC18D\uC131");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));

		btn1 = createBtn();
		contentPane.add(btn1);

		btn2 = new JButton("Disabled Button");
		btn2.addActionListener(this);
		btn2.setEnabled(false);
		btn2.setFont(new Font("굴림", Font.BOLD, 30));
		contentPane.add(btn2);

		btn3 = new JButton("getX(),getY()");
		btn3.addActionListener(this);
		btn3.setFont(new Font("굴림", Font.BOLD, 30));
		contentPane.add(btn3);
	}

	public JButton createBtn() {
		btn_1 = new JButton("Magenta/Yellow Button");
		btn_1.addActionListener(this);
		btn_1.setForeground(Color.MAGENTA);
		btn_1.setBackground(Color.YELLOW);
		btn_1.setFont(new Font("굴림", Font.BOLD, 30));
		return btn_1;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_1) {
			btnActionPerformed(e);
		}
		if (e.getSource() == btn2) {
			btn2ActionPerformed(e);
		}
		if (e.getSource() == btn3) {
			btn3ActionPerformed(e);
		}
	}

	protected void btn3ActionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		FrameComponentEx parent = (FrameComponentEx) btn.getTopLevelAncestor();
		parent.setTitle(btn.getX() + ", " + btn.getY());

		if (btn2.isEnabled()) {
			btn2.setEnabled(false);
		} else {
			btn2.setEnabled(true);
		}
	}

	protected void btn2ActionPerformed(ActionEvent e) {
		if (btn1 != null) {
			contentPane.remove(btn1);
			btn1 = null;
			revalidate();		
		} else {
			btn1 = createBtn();
			contentPane.add(btn1,0);	
			revalidate();
		}
	
	}
	protected void btnActionPerformed(ActionEvent e) {
		if (btn3.isVisible()) {
			btn3.setVisible(false);
		} else {
			btn3.setVisible(true);
		}
	}
}
