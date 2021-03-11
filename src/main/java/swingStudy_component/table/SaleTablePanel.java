package swingStudy_component.table;

import javax.swing.SwingConstants;

import swingStudy_honja.dto.sale;

public class SaleTablePanel extends AbstractCustomTablePanel<sale> {
	public SaleTablePanel() {
	}

	@Override
	protected void setAlignAndWidth() {
		//컬럼내용 정렬 
		setTableCellAlign(SwingConstants.RIGHT, 0,1,4,5,6); 
		setTableCellAlign(SwingConstants.CENTER, 2,3); 
		 
		//컬럼별 너비 조정
		setTableCellWidth(100, 250, 100,100,50,200,200);
		 
	}

	@Override
	public Object[] toArray(sale t) {
		return new Object[] {
				t.getOrderno(),
				t.getDate(),
				t.getCusno(),
				t.getProcode().getProcode(),
				t.getSaleamount(),
				t.getSales(),
				t.getProfit()
				};
	}

	@Override
	public String[] getColumnNames() {
		return new String[] {"주문번호","날짜","회원번호","제품코드","주문수량","판매액","이익금액"};
	}

}
