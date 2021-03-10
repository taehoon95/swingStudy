package swingStudy_component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import swingStudy_panel.DeptPanel;
import swingStudy_panel.EmployeePanel;
import swingStudy_panel.TitlePanel;

public class JTabbedPaneEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnConfirm;
	private JTabbedPane tabbedPane;
	private DeptPanel pDept;
	private TitlePanel pTitle;
	
	public JTabbedPaneEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JTabbedPane 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		pDept = new DeptPanel();
		tabbedPane.addTab("부서", null, pDept, "부서관리");
		
		pTitle = new TitlePanel();
		tabbedPane.addTab("직책", null, pTitle,"직책관리");
		
		EmployeePanel pEmp = new EmployeePanel();
		tabbedPane.addTab("사원", null, pEmp, "사원관리");
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		panel.add(btnConfirm);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConfirm) {
			btnConfirmActionPerformed(e);
		}
	}
	protected void btnConfirmActionPerformed(ActionEvent e) {
		//선택된 탭 가져와서
		int compIndex = tabbedPane.getSelectedIndex();
		
		//getXX() 호출
		if(compIndex == 0) {
			JOptionPane.showMessageDialog(null, pDept.getDepartment());
		}
		if(compIndex == 1) {
			JOptionPane.showMessageDialog(null, pTitle.getTitle());
		}
	
	}
}
