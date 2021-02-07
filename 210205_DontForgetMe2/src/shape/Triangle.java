package shape;

public class Triangle extends Shape implements Resize {

	public Triangle() {
		super();
	}

	public Triangle(int width, int height, String color) {
		super(width, height, color);
	}
	
	@Override
	public double getArea() {
		return (width * height) / 2;
	}

	@Override
	public void setResize(int size) {
		height += size;
		
	}

}
