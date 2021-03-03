package swingStudy_component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JButtonEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "images";
	private JToggleButton tglBtn;
	
	public JButtonEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JButton \uC608\uC81C && JTOGGLEBUTTON \uC608\uC81C");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 778, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BoxLayout(pLeft, BoxLayout.Y_AXIS));
		
		JButton btnNewButton = new JButton("call~");
		btnNewButton.setIcon(new ImageIcon(imgPath + "\\KakaoTalk_20210303_140819965.gif"));
		btnNewButton.setRolloverIcon(new ImageIcon(imgPath + "\\KakaoTalk_20210303_140820194.gif"));
		btnNewButton.setPressedIcon(new ImageIcon(imgPath + "\\KakaoTalk_20210303_140820088.gif"));
		pLeft.add(btnNewButton);
		
		tglBtn = new JToggleButton("\uD1A0\uAE00\uBC84\uD2BC");
		tglBtn.addActionListener(this);
		pLeft.add(tglBtn);
		
		JPanel pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pTop = new JPanel();
		pTop.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uC218\uD3C9\uC815\uB82C", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pRight.add(pTop);
		pTop.setLayout(new GridLayout(0, 1, 0, 0));
		
		MyButton btn02 = new MyButton();
		btn02.setText("LEFT");
		btn02.setHorizontalAlignment(SwingConstants.LEFT);
		pTop.add(btn02);
		
		MyButton btn03 = new MyButton();
		btn03.setText("center");
		pTop.add(btn03);
		
		MyButton btn04 = new MyButton();
		btn04.setHorizontalAlignment(SwingConstants.RIGHT);
		btn04.setText("right");
		pTop.add(btn04);
		
		JPanel pBottom = new JPanel();
		pBottom.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uC218\uC9C1\uC815\uB82C", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pRight.add(pBottom);
		pBottom.setLayout(new GridLayout(1, 0, 0, 0));
		
		MyButton btnNewButton_1 = new MyButton();
		btnNewButton_1.setText("Top");
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		pBottom.add(btnNewButton_1);
		
		MyButton btnNewButton_2 = new MyButton();
		btnNewButton_2.setText("Center");
		pBottom.add(btnNewButton_2);
		
		MyButton btnNewButton_3 = new MyButton();
		btnNewButton_3.setText("Bottom");
		btnNewButton_3.setVerticalAlignment(SwingConstants.BOTTOM);
		pBottom.add(btnNewButton_3);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tglBtn) {
			tglBtnActionPerformed(e);
		}
	}
	protected void tglBtnActionPerformed(ActionEvent e) {
		if (tglBtn.isSelected()) {
			tglBtn.setText("눌럿네");
		}else {
			tglBtn.setText("눌러바");
		}
	}
}
