package member.model.vo;

public class Entity {
	
	private String name;
	private String grade;
	private int point;
	
	public Entity() {
	}
	
	public Entity(String name, String grade, int point) {
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
	
	public double getEjaPoint() {
		return point * 0.05;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


	public void setPoint(int point) {
		this.point = point;
	}

	public double getPoint() {
		// TODO Auto-generated method stub
		return point;
	}


}
