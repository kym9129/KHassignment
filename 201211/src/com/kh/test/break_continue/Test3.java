package com.kh.test.break_continue;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	
	public void test() {
		/**
		 * 2보다 큰 정수를 입력 받고, 입력 받은 정수가 소수이면 “소수다“, 소수가 아니면 “소수가 아니다.” 출력하고 프로그램을 종료하는 코드를 작성하세요.
     단, 입력 받은 정수가 2보다 작은 경우 “잘못 입력하셨습니다. 다시 입력하세요.” 출력 후 다시 정수를 입력 받도록 하세요.
?
    ** 소수란? : 어떠한 정수를 1부터 자기 자신까지로 나누었을 때, 나누어 떨어지는 수가 1과 자기 자신 뿐인 수를 소수라고 한다.

		 */
		
		Scanner sc = new Scanner(System.in);
		
		//시작점: 값 입력받기
		System.out.println("2보다 큰 정수를 입력하세요. >");
		int input = sc.nextInt();
		
		//2보다 큰지 판단하기. 2보다 클 경우, 2~input까지의 i값으로 소수를 판단하기
		if(input >2) {
			int i = 2; //반복 시작 수. input값을 나눌 수
			int cnt = 0; //소수를 판단하기 위해 input을 i로 몇번 나누는지 카운트
			
			while(i <= input) {
				if(input % i == 0) {
					cnt++;
				}
				i++;
			}
			
			//소수일 경우
			if(cnt == 1) {
				System.out.println("소수다.");
			}
			
			//소수가 아닐 경우, 아닌 메세지 출력하기.
			else {
				System.out.println("소수가 아니다.");
			}					
			
		}
		
		//2보다 작을 경우, 메세지 출력 + 다시 입력받기 (시작점으로 돌아가기)
		else {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요."); 
		}

	}

}
