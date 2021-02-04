package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test1 {
	

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();

	}
	
	public void test() {
		/**
		 * 수하나 입력받아, 그 수가 양수일때만 입력된 
    수를 행 수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
    출력예)
    정수 하나 입력 : 5
    1
    12
    123
    1234
    12345
    출력예)
    정수 하나 입력 : -5
    양수가 아닙니다.

		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		if(input < 0) {
			System.out.println("양수가 아닙니다.");
			return;
		}
		else {
			for(int i = 1; i <= input; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print(j + "");
				}
				System.out.println();
			}
			
			
			
			
			
		}
		
		
		
		
		
	}

}
