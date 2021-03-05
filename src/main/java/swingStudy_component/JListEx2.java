package swingStudy_component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;

public class JListEx2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfValue;
	private JPanel pList;
	private JScrollPane scrollPane;
	private JList<String> nameList;
	private ArrayList<String> stdList = new ArrayList<String>();
	private JScrollPane pList2;
	private JList nameList2;
	
	public JListEx2() {
		stdList.add("김인환");
		stdList.add("이태훈");
		stdList.add("김상건");
		stdList.add("전수린");
		initialize();
	}
	private void initialize() {
		setTitle("실시간 추가");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("이름 입력후 엔터키");
		pNorth.add(lblTitle);
		
		tfValue = new JTextField();
		tfValue.addActionListener(this);
		pNorth.add(tfValue);
		tfValue.setColumns(10);
		
		pList = new JPanel();
		pList.setBorder(new EmptyBorder(0, 100, 0, 100));
		contentPane.add(pList, BorderLayout.CENTER);
		pList.setLayout(new GridLayout(1, 1, 10, 10));
		
		scrollPane = new JScrollPane();
		pList.add(scrollPane);
		
		nameList = new JList<>();
		nameList.setListData(new Vector<String>(stdList));
		
		nameList.setFixedCellWidth(100);
		nameList.setVisibleRowCount(5);
		scrollPane.setViewportView(nameList);
		
		pList2 = new JScrollPane();
		pList.add(pList2);
		
		nameList2 = new JList<>();
		nameList2.setModel(getModel(stdList));
		pList2.setViewportView(nameList2);
		
		
	}

	private ListModel getModel(List<String> stdList) {
		DefaultListModel<String> model = new DefaultListModel<String>();
		for(String e : stdList) {
			model.addElement(e);	
		}
		return model;
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tfValue) {
			tfValueActionPerformed(e);
		}
	}
	protected void tfValueActionPerformed(ActionEvent e) {
		String value = tfValue.getText().trim();
//		JOptionPane.showMessageDialog(null, value);
		
		stdList.add(value);
		nameList.setListData(new Vector<String>(stdList));
		tfValue.setText("");
		tfValue.requestFocus();
		
		DefaultListModel<String> model = (DefaultListModel<String>)nameList2.getModel();
		model.addElement(value);
	}
}
