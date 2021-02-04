package ncs.test4;

import java.util.Scanner;

public class ProductTest {
	
//	main 함수 안에서 Product 객체 초기값을 키보드로 입력 받아 초기화 생성하고, 
//	필드 값을 초회해서 계산하고 출력 한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명 입력 (ex. 갤럭시 s7) : ");
		String name = sc.nextLine();
		System.out.println("가격 입력 (정수만) : ");
		int price = sc.nextInt();
		System.out.println("수량 입력 (정수만) : ");
		int quantity = sc.nextInt();
		
		Product p = new Product(name, price, quantity);
		System.out.println("상품명 : " + p.getName());
		System.out.println("가격 : " + p.getPrice() + " 원");
		System.out.println("수량 : " + p.getQuantity() + " 개");
		System.out.println("총 구매 가격 : " + (p.getPrice() * p.getQuantity()) + " 원");

	}

}
