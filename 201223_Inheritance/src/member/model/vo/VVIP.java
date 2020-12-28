package member.model.vo;

public class VVIP extends Entity {
	
	public VVIP() {
		super();
	}
	
	public VVIP(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getEjaPoint() {
		return super.getPoint() * 0.15;
	}

	
	
}
