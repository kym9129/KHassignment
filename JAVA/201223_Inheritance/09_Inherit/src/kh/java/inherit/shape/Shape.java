package kh.java.inherit.shape;

public class Shape {
	
	private double area;  //넓이
	
	public Shape() {
		
	}
	

	public Shape(double area) {
		super();
		this.area = area;
	}

	public double getArea() {
		Rectangle r = new Rectangle();
		return r.getWidth() * r.getHeight();
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public void draw() {
		System.out.println("도형을 그리고 있다.");
	}
	
	

}
