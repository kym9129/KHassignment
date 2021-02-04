package com.collection.map.student;

public class Student {

	private int sno;
	private String sname;
	private int kor, eng, math, sum;
	private double avg;
	public static final int MAX_SUBJECT = 3;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sno, String sname, int kor, int eng, int math) {
		//생성자, 파라미터생성자(sno, sname, kor, eng, math)를 입력받고, 
		//sum, avg는 계산해서 초기화
		//avg는 소수점둘째자리에서 반올림처리.
		super();
		this.sno = sno;
		this.sname = sname;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor + eng + math;
		this.avg = Math.round((sum / MAX_SUBJECT)*100)/100.0;
		

		
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		
		this.sum = sum;
	}

	public double getAvg() {
		
		return avg;
	}

	public void setAvg(double avg) {
		
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}


	
	
	
	
}
