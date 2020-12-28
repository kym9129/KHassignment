package member.model.vo;

public class VVip extends Member {
	
	public VVip() {
		super();
	}
	
	public VVip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getEjaPoint() {
		return super.getPoint() * 0.15;
	}

	
	
}
