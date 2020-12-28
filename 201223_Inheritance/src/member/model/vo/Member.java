package member.model.vo;

public class Member {
	
	//커스텀클래스를 상속하는 경우 protected 지정 가능
	//자식 클래스가 접근할 수 있음.
	private String name;
	private String grade;
	private int point;
	private Silver silver;
	private Gold gold;
	private Vip vip;
	private VVip vvip;
	
	public Member() {
	}
	
	public Member(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public double getEjaPoint() {
		return point * 0.05;
	}


}
