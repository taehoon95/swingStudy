package swingStudy_component;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JListEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator ;
	private ImageIcon[] icons = {
			new ImageIcon(imgPath + "house.png"),
			new ImageIcon(imgPath + "glasses.png"),
			new ImageIcon(imgPath + "wifi.png"),
			new ImageIcon(imgPath + "key.png"),
	};
	private String[] fruits = new String[] {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private JButton btn01;
	private JList<String> strList;
	public JListEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JList예제1");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 0));
		
//		JList<String> strList = new JList<String>(fruits); //이러면 디자인창에 안보임

		strList = new JList(fruits);
//		strList.setListData(fruits); // 디자인창에 보이게 하는법
		contentPane.add(strList);
		
		JList<ImageIcon> list = new JList(icons);
//		list.setListData(icons);
		contentPane.add(list);
		
		JPanel pBtn = new JPanel();
		contentPane.add(pBtn);
		
		btn01 = new JButton("첫리스트선택확인");
		btn01.addActionListener(this);
		pBtn.add(btn01);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn01) {
			btn01ActionPerformed(e);
		}
	}
	protected void btn01ActionPerformed(ActionEvent e) {
		int idx = strList.getSelectedIndex();
		String selStr = strList.getSelectedValue();
		List<String> selectedList = strList.getSelectedValuesList();
		String msg = String.format("index : %d%nselectedValue : %s%nselectedList : %s"
				,idx,selStr,selectedList);
		JOptionPane.showMessageDialog(null, msg);
	}
}
