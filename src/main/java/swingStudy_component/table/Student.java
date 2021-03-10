package swingStudy_component.table;

public class Student {
	private int stdno;
	private String stdName;
	private int kor;
	private int eng;
	private int math;


	public int getStdno() {
		return stdno;
	}

	public void setStdno(int stdno) {
		this.stdno = stdno;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getStdName() {
		return stdName;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTotal() {
		return kor+eng+math;
	}

	public double getAvg() {
		return (double)getTotal()/3;
	}

	public Student(int stdno, String stdName, int kor, int eng, int math) {
		this.stdno = stdno;
		this.stdName = stdName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	@Override
	public String toString() {
		return String.format("Student2 [stdno=%s, stdName=%s, kor=%s, eng=%s, math=%s, total=%s, avg=%s]", stdno,
				stdName, kor, eng, math, getTotal(), getAvg());
	}

}
