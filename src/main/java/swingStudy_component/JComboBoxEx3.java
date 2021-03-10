package swingStudy_component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swingStudy_panel.Department;
import swingStudy_panel.DeptPanel;

public class JComboBoxEx3 extends JFrame implements ActionListener {

	private JPanel contentPane;
//	private ArrayList<Department> deptList = new ArrayList<Department>();
	private JButton btnAdd;
	private JComboBox cmbDept;
	private JPanel pRight;
	private JPanel pLeft;
	private DefaultComboBoxModel<Department> model;
	private ArrayList<Department> deptList;
	private DeptPanel pDept;
	private JButton btnOk;

	public JComboBoxEx3() {
		initialize();
		addDataCbb();

	}

	private void addDataCbb() {
		deptList = new ArrayList<Department>();
		deptList.add(new Department(1, "기획", 8));
		deptList.add(new Department(2, "영업", 18));
		deptList.add(new Department(3, "개발", 28));
		
		model = new DefaultComboBoxModel<Department>(new Vector<>(deptList));
		cmbDept.setModel(model);
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));

		pDept = new DeptPanel();
		pLeft.add(pDept);

		JPanel pBtn = new JPanel();
		pLeft.add(pBtn, BorderLayout.SOUTH);

		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pBtn.add(btnAdd);

		pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));

		cmbDept = new JComboBox();

		pRight.add(cmbDept);

		btnOk = new JButton("확인");
		btnOk.addActionListener(this);
		pRight.add(btnOk);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			btnOkActionPerformed(e);
		}
		if (e.getSource() == btnAdd) {
			btnAddActionPerformed(e);
		}
	}

	protected void btnAddActionPerformed(ActionEvent e) {
		Department addDept = pDept.getDepartment();
		
		if(deptList.contains(addDept)) {
			JOptionPane.showMessageDialog(null, "중복 아이템");
			return;
		}
		model.addElement(addDept);
		deptList.add(addDept); // 리스트에도 추가 해줘야됌
		pDept.ClearTf();
		JOptionPane.showMessageDialog(null, "추가되었습니다");
	}
	protected void btnOkActionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null, cmbDept.getSelectedItem());
	}
}
