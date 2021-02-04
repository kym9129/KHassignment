package com.api.member.model.vo;

import java.util.Calendar;

public class Member {
	
	private int memberNo;
	String memberName;
	int height;
	int weight;
	Calendar birth;
	Calendar cal = Calendar.getInstance();
	
	public Member() {
		
	}
	
	public Member(int memberNo, String memberName, int height, int weight, Calendar birth) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.height = height;
		this.weight = weight;
		this.birth = birth;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Calendar getBirth() {
		return birth;
	}

	public void setBirth(Calendar birth) {
//		cal.set(year, month, date);
		this.birth = birth;
	}
	
	public String information() {
		return "회원번호 : " + Integer.toString(this.memberNo) + "\n"
				+ "이름 : " + this.memberName + "\n"
				+ "키 : " + Integer.toString(this.height) + "\n"
				+ "몸무게 : " + Integer.toString(this.weight) + "\n"
				+ "생일 : " + (cal.get(Calendar.YEAR) + "년" + cal.get(Calendar.MONDAY+1) + "월" + cal.get(Calendar.DATE));
	}

}
