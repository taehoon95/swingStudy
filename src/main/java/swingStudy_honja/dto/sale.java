package swingStudy_honja.dto;

public class sale {
	private int orderno;
	private String date;
	private customer cusno;
	private product procode;
	private int saleamount;
	private int sales;
	private int profit;

	public sale(String date, customer cusno, product procode, int saleamount, int sales, int profit) {
		this.date = date;
		this.cusno = cusno;
		this.procode = procode;
		this.saleamount = saleamount;
		this.sales = sales;
		this.profit = profit;
	}

	
	public sale(int orderno, String date, customer cusno, product procode, int saleamount, int sales, int profit) {
		this.orderno = orderno;
		this.date = date;
		this.cusno = cusno;
		this.procode = procode;
		this.saleamount = saleamount;
		this.sales = sales;
		this.profit = profit;
	}


	public sale(String date, int orderno, customer cusno, product procode, int saleamount) {
		this.date = date;
		this.orderno = orderno;
		this.cusno = cusno;
		this.procode = procode;
		this.saleamount = saleamount;
	}
	
	public sale(String date) { // 날짜별 조회 메인문에서 사용
		this.date = date;
	}
	
	public sale() {
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getOrderno() {
		return orderno;
	}

	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public customer getCusno() {
		return cusno;
	}

	public void setCusno(customer cusno) {
		this.cusno = cusno;
	}

	public product getProcode() {
		return procode;
	}

	public void setProcode(product procode) {
		this.procode = procode;
	}

	public int getSaleamount() {
		return saleamount;
	}

	public void setSaleamount(int saleamount) {
		this.saleamount = saleamount;
	}

	@Override
	public String toString() {// main
		return String.format("%s %s %s %s %s %s %s", date, cusno.getCusno(), cusno.getCusname(), cusno.getCallno(),
				procode.getProcode(), saleamount, sales);
	}

	public String toString2() {// product
		return String.format("%4s %4s %4s %4s %4s %5s %5s", cusno.getCusno(), date, procode.getProcode(),
				procode.getProname(), saleamount, procode.getProprice(), sales, profit);
	}

	public String toString3() {// detail
		return String.format("%4s %4s %4s %4s %4s %5s %5s %s", date, procode.getProcode(), procode.getProname(),
				cusno.getCusname(), saleamount, procode.getProprice(), sales, profit);
	}
}
