package kh.java.inherit.shape;

import java.util.Arrays;

public class Rectangle extends Shape {
	
	private Point[] points = new Point[4];
	private int width;
	private int height;
	
	public Rectangle(Point[] points, int width, int height) {
		super();
		this.points = points;
		this.width = width;
		this.height = height;
		
	}

	public Rectangle() {
		this.points[0] = new Point(0, 0); //NullPointerException
		this.points[1] = new Point(200, 0);
		this.points[2] = new Point(200, 100);
		this.points[3] = new Point(0, 100);
		this.width = 200;
		this.height = 100;
	}

	public Point[] getPoints() {
		return points;
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("네 꼭지점이 " + points[0] + ", " + points[1] + ", " + points[2] + ", " + points[3] + "이고,"
				+ "너비가 " + width + ", 높이가 " + height + "인 사각형을 그린다.");
	}
	
	@Override
	public double getArea() {
		return super.getArea();
	}
	
	@Override
	public String toString() {
		return Arrays.toString(points) + ", " + width + ", " + height;
	}
	
	
	

}
