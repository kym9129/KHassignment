package com.kh.test.loop;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}

	public void test() {
		//정수를 입력 받아 입력된 값의 구구단 프로그램을 만들어보세요.  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요. (1~9)>");
		int num = sc.nextInt();
		
		if (num ==0 || num > 9) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
			else {
				for(int i = 1; i <= 9; i++) {
					System.out.println(num + "x" + i + "=" + (num * i));	
				}	
		}
	
	}
}
