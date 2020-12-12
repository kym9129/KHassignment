package com.kh.test.break_continue;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();

	}
	
	public void test() {
//		String tmp ="application";
//		for(char c : tmp.toCharArray()) {
//			System.out.println(c);
//		}
		/**
		 * 1~100 사이의 임의의 난수를 발생시키고, 
       정수 한 개를 입력 받아, 
       난수가 입력 받은 정수보다 작으면 “입력하신 정수보다 작습니다.” 출력, 
       난수가 입력 받은 정수보다 크면 “입력하신 정수보다 큽니다.” 출력하세요.
       단, 정답을 맞출 때까지 정수를 계속 입력 받아 프로그램이 반복되도록 하고, 
       정답인 경우 “정답입니다. 5회 만에 정답을 맞추셨습니다.”와 같이 
       몇 회 만에 정답을 맞추었는지 출력하도록 작성하세요
		 */
	
	
		//1. 1~100 난수 만들기
		int random = (int)(Math.random()*100)+1;
//		System.out.println("random = "+random);
		
		
		//3. 정답을 맞출 때까지 정수를 계속 입력받기
		
		int cnt = 0;
		while(true) {
			//2. 정수 입력받기
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 한 개를 입력하세요. >");
			int input = sc.nextInt();
			cnt++;
			
			if(input < random) {
				System.out.println("입력하신 정수보다 큽니다.");
			}
			
			else if(input > random) {
				System.out.println("입력하신 정수보다 작습니다.");
			}
			//4. input값 입력한 횟수 계산
			
			//5. 정답인 경우
			else if(input == random) {
				System.out.println("정답입니다. " + cnt + "회 만에 정답을 맞추셨습니다.");
				break;
				
			}
		}
		
	}
//		for(;;) {
//			//반복코드
//		}
//		

}

