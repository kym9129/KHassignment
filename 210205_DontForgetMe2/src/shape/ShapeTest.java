package shape;

public class ShapeTest {

	public static void main(String[] args) {
		
		// (1.조건)에서 주어진 데이터를 기반으로 Shape type의 객체를 생성 하여
		Shape[] shapeArr = new Shape[6];
		
		// 6개의 도형 객체를 배열에 넣는다.
		shapeArr[0] = new Triangle(7, 5, "Blue");
		shapeArr[1] = new Rectangle(4, 6, "Blue");
		shapeArr[2] = new Triangle(6, 7, "Red");
		shapeArr[3] = new Rectangle(8, 3, "Red");
		shapeArr[4] = new Triangle(9, 8, "White");
		shapeArr[5] = new Rectangle(5, 7, "White");
		
		// 모든 객체의 넓이 정보와 색상 정보를 for Loop를 이용하여 화면에 출력 한다
		System.out.println("기본정보");
		for(int i = 0; i < shapeArr.length; i++){
			if(shapeArr[i] instanceof Triangle) {
				System.out.println("Triangle	" + shapeArr[i].getArea() + "	" + shapeArr[i].getColor());			
			}
			else if(shapeArr[i] instanceof Rectangle) {
				System.out.println("Rectangle	" + shapeArr[i].getArea() + "	" + shapeArr[i].getColor());							
			}
		}
		
		// 모든 객체들을 for Loop문을 이용하여 setResize함수를 이용하여 
		// 5를 입력 하고 사이즈를 변경 후 화면에 출력 한다
		System.out.println("\n사이즈를 변경 후 정보");
		for(int i = 0; i < shapeArr.length; i++) {
			if(shapeArr[i] instanceof Triangle) {
				((Triangle)shapeArr[i]).setResize(5);
				System.out.println("Triangle	" + shapeArr[i].getArea() + "	" + shapeArr[i].getColor());			
			}else if(shapeArr[i] instanceof Rectangle) {
				((Rectangle)shapeArr[i]).setResize(5);
				System.out.println("Rectangle	" + shapeArr[i].getArea() + "	" + shapeArr[i].getColor());							
			}
		}
		
		
		

	}

}
