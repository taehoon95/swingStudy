package swingStudy_component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class JComboBoxEx2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox<String> cmb;
	private String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	private ImageIcon[] icons = { 
			new ImageIcon(imgPath + "apple.jpg"), 
			new ImageIcon(imgPath + "pear.jpg"),
			new ImageIcon(imgPath + "cherry.jpg")};
	private JLabel lblImage;
	private Map<String, ImageIcon> map = new HashMap<String, ImageIcon>();
	private String[] fruits = { "apple", "pear", "cherry" }; 

	public JComboBoxEx2() {
		for(int i = 0; i < icons.length; i++) {
			map.put(fruits[i], icons[i]);
		}
		initialize();
		
	}

	private void initialize() {
		setTitle("JComboBox 이벤트 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);

		cmb = new JComboBox<>();
		cmb.setModel(new DefaultComboBoxModel<String>(fruits));
		cmb.setSelectedIndex(-1);
		cmb.addActionListener(this);
		pNorth.add(cmb);

		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.CENTER);
		pSouth.setLayout(new GridLayout(0, 1, 0, 0));

		lblImage = new JLabel("");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		pSouth.add(lblImage);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cmb) {
			cmbActionPerformed(e);
		}
	}

	protected void cmbActionPerformed(ActionEvent e) {
		Object obj = cmb.getSelectedItem();
		
		lblImage.setIcon(map.get(obj));
	}
}
