package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.test1();
		t1.test2();
		t1.test3();
	}
	
	
	public void test1() {
		//- 국어, 영어, 수학 점수를 입력 받아 합계를 계산하고 합계가 250점 이상이면 “우수생입니다.”를 출력하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력: ");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수 입력: ");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수 입력: ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		
		if(total >= 250) {
		System.out.println("우수생입니다.");
		}
		System.out.println("test1 종료.");
		
		sc.close();
	}
	
	public void test2() {
		//- A, B, C연봉을 입력하고 각 연봉을 입력하고 연 봉이 5000이상이면 “0은 고액연봉자입니다” 라고 출력하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름(A /B /C) 입력 : ");
		char who = sc.next().charAt(0);
		System.out.println("연봉을 1000단위로 입력 (ex. 3000) : ");
		int money = sc.nextInt();
		
		if(money >= 5000) {
			System.out.println(who + "은 고액연봉자입니다.");
			
		}
		
		System.out.println("test 종료.");
		sc.close();
		
	}

	public void test3() {
		// - 정수 한 개를 입력 받아 짝수면 “짝수다” 홀수면 “홀수다라고 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 한 개를 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("짝수다.");
			
		}
		else {
			System.out.println("홀수다.");
		}
		sc.close();
	}
}
