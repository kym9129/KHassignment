package shape;

public class Rectangle extends Shape implements Resize {
	
	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height, String color) {
		super(width, height, color);
	}
	
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public void setResize(int size) {
		width += size;
	}

}
