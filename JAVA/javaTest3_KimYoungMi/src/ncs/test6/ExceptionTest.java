package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();

		Scanner sc = new Scanner(System.in);
		System.out.println("2~5 사이의 정수를 입력하세요. : ");
		int input = sc.nextInt();
		
		try {
			System.out.println("결과값 : " + c.getSum(input));

			
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
