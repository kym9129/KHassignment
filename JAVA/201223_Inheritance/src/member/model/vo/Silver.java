package member.model.vo;

public class Silver extends Member {
	
	public Silver() {
		super();
	}
	
	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getEjaPoint() {
		return super.getPoint() * 0.02;
	}
	
	

}
