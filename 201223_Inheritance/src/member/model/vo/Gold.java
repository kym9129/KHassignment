package member.model.vo;

//Silver,Gold 멤버변수 : 이름 name,등급 grade ,포인트 point
//Silver,Gold 멤버함수 : 컨스트럭터(생성자) , setter/getter(이자포인트 getter추가)
//---> 실버 등급은 2% 를 곱한값이 이자 포인트
//---> 골드 등급은 5% 를 곱한값이 이자 포인트



public class Gold extends Entity {
	
	public Gold() {
		super();
	}
	
	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getEjaPoint() {
		return super.getPoint() * 0.05;
	}

	
	
}
