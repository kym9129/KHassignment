package com.exception.number;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Run r = new Run();
		r.test();

	}
	
	public void test() {
		//2 개의 정수를 입력받아, checkDouble 메소드로 전달하면서 실행함
//	    리턴된 결과로  결과로 "ooo의 배수이다/배수가 아니다." 출력함
		
		//정수 2개 입력받기
		System.out.println("----배수 구하기----");
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		NumberProcess np = new NumberProcess();
		try {
			if(np.checkDouble(num1, num2) == true)
				System.out.println(num2 + "의 배수이다.");
			else
				System.out.println(num2 + "의 배수가 아니다.");
				
		} catch (NumberRangeException e) {
			System.out.println("1부터 100사이의 값이 아닙니다.");
		}
		
	}

}
