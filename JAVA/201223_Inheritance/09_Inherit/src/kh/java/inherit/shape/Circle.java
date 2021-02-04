package kh.java.inherit.shape;


/*
 * Circle has a Point : has a 포함관계 (연관관계)
 * Circle ────> Point
 */

public class Circle extends Shape{
	
	private Point center;
	private int r;
	
	public Circle() {
		//아무런 필드 대입이 없다면, 기본값으로 세팅한다.
		this.center = new Point(100, 100);
		this.r = 100;
	}
	
	
	public Circle(Point center, int r) {
//		super(area);
		this.center = center;
		this.r = r;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	//Override : 상속받은 메소드를 고쳐쓸 수 있다.
//	1. 메소드명, 파라미터선언부, 리턴타입 모두 동일해야한다.
//	2. 접근제한자는 더 넓은 범위로 수정이 가능
//	3. 메소드가 던지는 예외클래스는 더 줄이거나, 자식클래스로 변경가능

	public void draw() {
		System.out.println("중심점이 " + center + "이고,"
				+ "반지름이 " + r + "인 원을 그리고있다.");
	}

}














