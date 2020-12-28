package member.model.vo;

public class Silver extends Entity {
	
	public Silver() {
		
	}
	
	public Silver(String name, String grade, int point) {
		super.setName(name);
		super.setGrade(grade);
		super.setPoint(point);
	}
	
	@Override
	public double getEjaPoint() {
		return super.getPoint() * 0.02;
	}
	
	

}
