package swingStudy_component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import swingStudy_panel.Department;
import swingStudy_panel.DeptPanel;


public class JListEx3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnAdd;
	private DeptPanel pLeftCenter;
	private JList<Department> deptList;
	private DefaultListModel<Department> model;
	private JButton btnConfirm;
	private JButton btnModi;
	private JButton btnDel;
	
	public JListEx3() {
		initialize();
		model.addElement(new Department(1,"기획",8));
		model.addElement(new Department(2,"영업",18));
		model.addElement(new Department(3,"개발",28));
	}
	private void initialize() {
		setTitle("JList응용예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 537, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 20, 0));
		
		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));
		
		pLeftCenter = new DeptPanel();
		pLeft.add(pLeftCenter, BorderLayout.CENTER);
		
		JPanel pLeftSouth = new JPanel();
		pLeft.add(pLeftSouth, BorderLayout.SOUTH);
		
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pLeftSouth.add(btnAdd);
		
		JPanel pRight = new JPanel();
		pRight.setBorder(new TitledBorder(null, "\uBD80\uC11C\uBAA9\uB85D", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pRight);
		pRight.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		pRight.add(scrollPane);
		
		deptList = new JList<>();
		deptList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		model = new DefaultListModel<Department>();
		deptList.setModel(model);
		scrollPane.setViewportView(deptList);
		
		JPanel panel = new JPanel();
		pRight.add(panel, BorderLayout.SOUTH);
		
		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		panel.add(btnConfirm);
		
		btnModi = new JButton("수정");
		btnModi.addActionListener(this);
		panel.add(btnModi);
		
		btnDel = new JButton("삭제");
		btnDel.addActionListener(this);
		panel.add(btnDel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnDel) {
			btnDelActionPerformed(e);
		}
		if (e.getSource() == btnModi) {
			btnModiActionPerformed(e);
		}
		if (e.getSource() == btnConfirm) {
			btnConfirmActionPerformed(e);
		}
		if (e.getSource() == btnAdd) {
			if(btnAdd.getText().equals("추가"))
				btnAddActionPerformed(e);
			else
				btnUpdateActionPerformed(e);
		}
	}
	private void btnUpdateActionPerformed(ActionEvent e) {
		Department updateDept = pLeftCenter.getDepartment();
		int idx = deptList.getSelectedIndex();
//		model.remove(idx);
//		model.add(idx, updateDept);
		model.set(idx, updateDept);
		pLeftCenter.ClearTf();
		if(btnAdd.getText().equals("수정")) {
			btnAdd.setText("추가");
		}
		JOptionPane.showMessageDialog(null, "수정 되었습니다.");
	}
	protected void btnAddActionPerformed(ActionEvent e) {
		Department dept = pLeftCenter.getDepartment();
		pLeftCenter.ClearTf();
		
		model.addElement(dept);
		JOptionPane.showMessageDialog(null, btnAdd.getText()+ "되었습니다.");
	}
	
	protected void btnConfirmActionPerformed(ActionEvent e) {
		/*
		 * int idx = deptList.getSelectedIndex(); Department selDept = model.get(idx);
		 * String message1 = String.format("%d %s %d",
		 * selDept.getDeptNo(),selDept.getDeptName(), selDept.getFloor());
		 */
		Department dept = deptList.getSelectedValue();
		String message = String.format("%d %s %d", dept.getDeptNo(),dept.getDeptName(),dept.getFloor());
		JOptionPane.showMessageDialog(null, message /* +"\n"+ message1 */);
	}
	protected void btnModiActionPerformed(ActionEvent e) {
		btnAdd.setText("수정");
		Department dept = deptList.getSelectedValue();
		pLeftCenter.setDepartment(dept);
		
	}
	protected void btnDelActionPerformed(ActionEvent e) {		
		int idx = deptList.getSelectedIndex();
		model.remove(idx);
		JOptionPane.showMessageDialog(null, "삭제되었습니다.");
	}
}
