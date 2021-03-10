package swingStudy_panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import com.toedter.calendar.JDateChooser;


public class EmployeePanel extends JPanel {
	private JTextField tfNo;
	private JTextField tfName;
	private JComboBox tfTitle;
	private JComboBox tfManager;
	private JSpinner tfSalary;
	private JComboBox tfDept;
	private JDateChooser tfHireDate;
	private JTextField tfPass1;
	private JTextField tfPass2;

	public EmployeePanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "\uC0AC\uC6D0 \uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pTop = new JPanel();
		add(pTop, BorderLayout.NORTH);
		
		JPanel pPic = new JPanel();
		pTop.add(pPic);
		pPic.setLayout(new BorderLayout(0, 0));
		
		JPanel pBtnpic = new JPanel();
		pPic.add(pBtnpic, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("\uC0AC\uC9C4 \uCD94\uAC00");
		pBtnpic.add(btnNewButton);
		
		JLabel lblpic = new JLabel("");
		lblpic.setHorizontalAlignment(SwingConstants.CENTER);
		lblpic.setIcon(new ImageIcon("C:\\workspace_java\\swingStudy\\images\\dog22.png"));
		pPic.add(lblpic, BorderLayout.CENTER);
		
		JPanel pItem = new JPanel();
		add(pItem, BorderLayout.CENTER);
		pItem.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNo = new JLabel("\uC0AC\uC6D0\uBC88\uD638");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblNo);
		
		tfNo = new JTextField();
		pItem.add(tfNo);
		tfNo.setColumns(10);
		
		JLabel lblName = new JLabel("\uC0AC\uC6D0\uBA85");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblName);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		pItem.add(tfName);
		
		JLabel lblTitle = new JLabel("\uC9C1\uCC45");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblTitle);
		
		tfTitle = new JComboBox();
		pItem.add(tfTitle);
		
		JLabel lblManager = new JLabel("\uC9C1\uC18D\uC0C1\uC0AC");
		lblManager.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblManager);
		
		tfManager = new JComboBox();
		pItem.add(tfManager);
		
		JLabel lblSalary = new JLabel("\uAE09\uC5EC");
		lblSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblSalary);
		
		tfSalary = new JSpinner();
		pItem.add(tfSalary);
		
		JLabel lblDept = new JLabel("\uBD80\uC11C");
		lblDept.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblDept);
		
		tfDept = new JComboBox();
		pItem.add(tfDept);
		
		JLabel lblHireDate = new JLabel("\uC785\uC0AC\uC77C");
		lblHireDate.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblHireDate);
		
		tfHireDate = new JDateChooser();
		pItem.add(tfHireDate);
		
		JLabel lblPass1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblPass1.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblPass1);
		
		tfPass1 = new JTextField();
		tfPass1.setColumns(10);
		pItem.add(tfPass1);
		
		JLabel lblPass2 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblPass2.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblPass2);
		
		tfPass2 = new JTextField();
		tfPass2.setColumns(10);
		pItem.add(tfPass2);
		
		JPanel spacePanel = new JPanel();
		pItem.add(spacePanel);
		
		JPanel lblResultPanel = new JPanel();
		pItem.add(lblResultPanel);
		lblResultPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblResult = new JLabel("New label");
		lblResult.setForeground(Color.RED);
		lblResult.setFont(new Font("굴림", Font.BOLD, 20));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultPanel.add(lblResult);
	}
	public void setEmployee(Employee employee) {
		
	}
	
	public Employee getEmployee() {
		return null;
	}
	
	public void clearTf() {
		
	}
}
