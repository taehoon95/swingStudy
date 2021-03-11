package swingStudy_honja.dto;

public class product {
	private String procode;
	private String proname;
	private int proprice;
	private int stock;

	public product() {}

	public product(String procode, String proname, int proprice, int stock) {
		this.procode = procode;
		this.proname = proname;
		this.proprice = proprice;
		this.stock = stock;
	}

	public product(String procode, String proname) {
		this.procode = procode;
		this.proname = proname;
	}

	public product(String procode) {
		this.procode = procode;
	}

	public String getProcode() {
		return procode;
	}

	public void setProcode(String procode) {
		this.procode = procode;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public int getProprice() {
		return proprice;
	}

	public void setProprice(int proprice) {
		this.proprice = proprice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return String.format("product [procode=%s, proname=%s, proprice=%s, stock=%s]", procode, proname, proprice,
				stock);
	}

}
