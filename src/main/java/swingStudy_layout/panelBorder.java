package swingStudy_layout;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class panelBorder extends JPanel {

	public panelBorder() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(10, 10));
		
		JLabel lblNorth = new JLabel("North");
		lblNorth.setFont(new Font("굴림", Font.BOLD, 26));
		lblNorth.setOpaque(true); //jlabel은 원래 투명 -> 불투명
		lblNorth.setBackground(Color.ORANGE);
		lblNorth.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNorth, BorderLayout.NORTH);
		
		JLabel lblCenter = new JLabel("Center");
		lblCenter.setFont(new Font("굴림", Font.BOLD, 26));
		lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCenter.setOpaque(true);
		lblCenter.setBackground(Color.GREEN);
		add(lblCenter, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("West");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(Color.PINK);
		add(lblNewLabel_2, BorderLayout.WEST);
		
		JLabel lblNewLabel_3 = new JLabel("East");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_3.setBackground(Color.CYAN);
		lblNewLabel_3.setOpaque(true);
		add(lblNewLabel_3, BorderLayout.EAST);
		
		JLabel lblNewLabel_4 = new JLabel("South");
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(Color.MAGENTA);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_4, BorderLayout.SOUTH);
	}

}
