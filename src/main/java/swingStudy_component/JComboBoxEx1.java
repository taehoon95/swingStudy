package swingStudy_component;

import java.awt.GridLayout;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JComboBoxEx1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox<String> cmb1;
	private JComboBox<String> cmb2;
	private JComboBox<String> cmb3;
	private JTextField tfCmb1;
	private JTextField tfCmb2;
	private JTextField tfCmb3;

	public JComboBoxEx1() {
		initialize();

		addDataCmb1();
		addDataCmb2();
		addDataCmb3();
	}

	private void addDataCmb1() {//배열 + 반복문
		String[] fruits = {"apple", "banana", "kiwi"};
		
		for(String f : fruits) {
			cmb1.addItem(f);
		}
	}

	private void addDataCmb2() { // 모델 + 반복문 이용해서 값넣기
		String[] fruits = {"apple", "banana", "kiwi"};
		
		DefaultComboBoxModel<String> cbm = (DefaultComboBoxModel<String>) cmb2.getModel();
		
		for(String f : fruits) {
			cbm.addElement(f);
		}
		
		
	}

	private void addDataCmb3() { //ArrayList는 Vector로 감싸서 넣어준다.
		List<String> fruits = Arrays.asList("apple", "banana", "kiwi");
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(new Vector<>(fruits));
		
		cmb3.setModel(model);
	}

	private void initialize() {
		setTitle("JComboBox 기본 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 0));

		JPanel pCmb1 = new JPanel();
		contentPane.add(pCmb1);

		cmb1 = new JComboBox<>();
		pCmb1.add(cmb1);
		
		tfCmb1 = new JTextField();
		tfCmb1.addActionListener(this);
		pCmb1.add(tfCmb1);
		tfCmb1.setColumns(10);

		JPanel pCmb2 = new JPanel();
		contentPane.add(pCmb2);

		cmb2 = new JComboBox<>();
		pCmb2.add(cmb2);
		
		tfCmb2 = new JTextField();
		tfCmb2.addActionListener(this);
		pCmb2.add(tfCmb2);
		tfCmb2.setColumns(10);

		JPanel pCmb3 = new JPanel();
		contentPane.add(pCmb3);

		cmb3 = new JComboBox<>();
		pCmb3.add(cmb3);
		
		tfCmb3 = new JTextField();
		tfCmb3.addActionListener(this);
		pCmb3.add(tfCmb3);
		tfCmb3.setColumns(10);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tfCmb1) {
			tfCmb1ActionPerformed(e);
		}
		if (e.getSource() == tfCmb3) {
			tfCmb3ActionPerformed(e);
		}
		if (e.getSource() == tfCmb2) {
			tfCmb2ActionPerformed(e);
		}
	}
	protected void tfCmb1ActionPerformed(ActionEvent e) {
		String item = tfCmb1.getText().trim();
		cmb1.addItem(item);
		tfCmb1.setText("");
	}
	protected void tfCmb2ActionPerformed(ActionEvent e) {
		String item = tfCmb2.getText().trim();
		cmb2.addItem(item);
		tfCmb2.setText("");
		
	}
	protected void tfCmb3ActionPerformed(ActionEvent e) {
		String item = tfCmb3.getText().trim();
		DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cmb3.getModel();
		model.addElement(item);
		tfCmb3.setText("");
	}
	
}
