package swingStudy_component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import swingStudy_component.table.Student;
import swingStudy_panel.Department;
import swingStudy_panel.Employee;
import swingStudy_panel.Title;
import swingStudy_component.table.MyTablePanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import java.awt.Color;
import swingStudy_component.table.DeptTablePanel;
import swingStudy_component.table.TitleTablePanel;
import swingStudy_component.table.EmpTablePanel;

public class JTableEx extends JFrame {

	private JPanel contentPane;
	private List<Student> stdList = new ArrayList<>();
	private JPanel pTable1;
	private JTable table1;
	private List<Department> deptList = new ArrayList<>();
	private List<Title> titleList = new ArrayList<>();
	private List<Employee> empList = new ArrayList<>();
	
	
	public JTableEx() {
		stdList.add(new Student(1, "김인환", 50, 60, 60));
		stdList.add(new Student(2, "이태훈", 70, 71, 70));
		stdList.add(new Student(3, "김상건", 90, 92, 100));
		stdList.add(new Student(4, "전수린", 50, 63, 67));
		
		deptList.add(new Department(1, "기획", 7));
		deptList.add(new Department(2, "개발", 8));
		deptList.add(new Department(3, "총무", 10));
		
		titleList.add(new Title(1,"사장"));
		titleList.add(new Title(2,"부장"));
		titleList.add(new Title(3,"과장"));
		titleList.add(new Title(4,"대리"));

		empList.add(new Employee(1, "김상건", titleList.get(0), null , 4500000, deptList.get(0)));
		empList.add(new Employee(2, "이성래", titleList.get(1), new Employee(1, "김상건") , 1500000, deptList.get(1)));
		empList.add(new Employee(3, "이태훈", titleList.get(2), new Employee(1, "김상건") , 2000000, deptList.get(2)));
		initialize();
	}

	private void initialize() {
		setTitle("JTable 예");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 887, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));

		pTable1 = new JPanel();
		pTable1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uAE30\uBCF8 \uD14C\uC774\uBE14 \uC0DD\uC131", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pTable1);
		pTable1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		pTable1.add(scrollPane, BorderLayout.CENTER);
		
		table1 = new JTable();
		table1.setModel(getModel());
		scrollPane.setViewportView(table1);

		JPanel pTable2 = new JPanel();
		contentPane.add(pTable2);
		pTable2.setLayout(new BorderLayout(0, 0));
		
		MyTablePanel pCustomTable2 = new MyTablePanel();
		
		pTable2.add(pCustomTable2, BorderLayout.CENTER);
		pCustomTable2.setList(stdList);
		JPanel pTable3 = new JPanel();
		contentPane.add(pTable3);
		pTable3.setLayout(new BorderLayout(0, 0));
		
		DeptTablePanel panel = new DeptTablePanel();
		panel.setList(deptList);
		pTable3.add(panel, BorderLayout.CENTER);

		JPanel pTable4 = new JPanel();
		contentPane.add(pTable4);
		pTable4.setLayout(new BorderLayout(0, 0));
		
		TitleTablePanel pTitleTable4 = new TitleTablePanel();
		pTitleTable4.setList(titleList);
		pTable4.add(pTitleTable4, BorderLayout.CENTER);
		
		JPanel pTable5 = new JPanel();
		contentPane.add(pTable5);
		pTable5.setLayout(new BorderLayout(0, 0));
		
		EmpTablePanel pEmpTable = new EmpTablePanel();
		pEmpTable.setList(empList);
		pTable5.add(pEmpTable, BorderLayout.CENTER);
		
		JPanel pTable6 = new JPanel();
		contentPane.add(pTable6);
		pTable6.setLayout(new BorderLayout(0, 0));
	}

	public DefaultTableModel getModel() {
		CustomTableModel model = new CustomTableModel(getData(), getColumnNames());
		return model;
	}
	
	class CustomTableModel extends DefaultTableModel{

		public CustomTableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
	}

	public Object[][] getData() {
		return new Object[][] { { 1, "박유진", 10, "여자" }, { 2, "이태훈", 11, "남자" }, };
	}

	public String[] getColumnNames() {
		return new String[] { "학생번호", "학생명", "나이", "성별" };
	}

}
