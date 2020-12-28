package member.model.vo;

public class VVIP extends Entity {
	
	public VVIP() {
		
	}
	
	public VVIP(String name, String grade, int point) {
		super.setName(name);
		super.setGrade(grade);
		super.setPoint(point);
	}
	
	@Override
	public double getEjaPoint() {
		return super.getPoint() * 0.15;
	}

	
	
}
