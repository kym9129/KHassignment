package member.model.vo;

public class VIP extends Entity {
	
	public VIP() {
		super();
	}
	
	public VIP(String name, String grade, int point) {
		super(name, grade, point);
	}

	@Override
	public double getEjaPoint() {
		return super.getPoint() * 0.1;
	}

	
	
}
