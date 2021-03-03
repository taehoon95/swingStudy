package swingStudy_component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class JLabelEx extends JFrame implements MouseListener {

	private JPanel contentPane;
	private String path = System.getProperty("user.dir") + File.separator + "images";
	private JLabel lblCenter;
	private JLabel lblTop;
	private JLabel lblSouth;
	public JLabelEx() {
		System.out.println(path + "\\\\jisoo.jpg");
		initialize();
	}
	private void initialize() {
		setTitle("JLabel");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblTop = new JLabel("\uC0AC\uB791\uD569\uB2C8\uB2E4");
		lblTop.addMouseListener(this);
		lblTop.setBackground(Color.MAGENTA);
		lblTop.setOpaque(true);
		lblTop.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTop, BorderLayout.NORTH);
		
		lblCenter = new JLabel("New label");
		lblCenter.setIcon(new ImageIcon(path+"\\jisoo.jpg"));
		lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCenter, BorderLayout.CENTER);
		
		lblSouth = new JLabel("\uC804\uD654\uC8FC\uC138\uC694");
		lblSouth.setIcon(new ImageIcon(path+"\\zion.jpg"));
		lblSouth.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblSouth, BorderLayout.SOUTH);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblTop) {
			lblTopMouseClicked(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	
	protected void lblTopMouseClicked(MouseEvent e) {
		lblCenter.setIcon(new ImageIcon(path+"\\zion.jpg"));
		lblSouth.setText("010-1234-1234");
		JOptionPane.showMessageDialog(null, "변경완료");
	}
}
