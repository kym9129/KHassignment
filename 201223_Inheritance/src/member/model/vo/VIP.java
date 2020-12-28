package member.model.vo;

public class VIP extends Entity {
	
	public VIP() {
		
	}
	
	public VIP(String name, String grade, int point) {
		super.setName(name);
		super.setGrade(grade);
		super.setPoint(point);
	}

	@Override
	public double getEjaPoint() {
		return super.getPoint() * 0.1;
	}

	
	
}
