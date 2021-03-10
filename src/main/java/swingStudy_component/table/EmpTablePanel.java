package swingStudy_component.table;

import javax.swing.SwingConstants;

import swingStudy_panel.Employee;

public class EmpTablePanel extends AbstractCustomTablePanel<Employee> {

	@Override
	protected void setAlignAndWidth() {
		// 컬럼내용 정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3, 5);
		setTableCellAlign(SwingConstants.RIGHT, 4);

		// 컬럼별 너비 조정
		setTableCellWidth(100, 250, 100, 100, 100, 100);
	}

	@Override
	public Object[] toArray(Employee t) {
		return new Object[] {
				t.getEmpNo(),
				t.getEmpName(),
				String.format("%s(%d)", t.getTitle().getTname(),t.getTitle().getTno()),
				t.getManager()==null?"":t.getManager().getEmpName(),
				String.format("%,d", t.getSalary()),
				String.format("%s(%d)",t.getDept().getDeptName(),t.getDept().getDeptNo())
				}; // String과 int등 모든것에 되어야하므로 object배열
	}

	@Override
	public String[] getColumnNames() {
		return new String[] {"사원","사원명","직책","직속상사","급여","부서"};
	}

}
