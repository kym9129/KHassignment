package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
//		t1.test1();
		t1.test2();
	}
	
	public void test1() {
		//정수 한 개를 입력 받아, 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 한 개를 입력하세요. > ");
		int inputNum = sc.nextInt();
		
		int i = 0;
		int mul = 1;
			
		while (i < inputNum) {
			i++;
			if(i % 2 == 0) {
				continue;
			}
			else {
//				System.out.println(mul + "*" + i +"=" + (mul*i));
				mul *= i;
			}
		}
		System.out.println(mul);
		
		
	}
	
	public void test2() {
		//사용자로부터 정수를 두개 입력 받아서, 작은 정수에서 큰 정수까지 홀수의 합을 구하세요.
//        Tip. 큰수/작은수에 해당하는 변수를 사용할 것.
//     
//        결과:
//        정수를 하나 입력하세요. => 100
//        다른 정수를 하나 입력하세요. => 1
//        ====================
//        1부터 100까지의 홀수의 합은 2500입니다.
		
		//1. 정수 2개 입력받기.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("다른 정수를 하나 입력하세요. >");
		int num2 = sc.nextInt();
		
		//2. 입력값의 크기 비교
		
			int sum = 0;
			
			//3. if (num1 < num2), num1~ num2까지 숫자를 생성.
			if(num1 < num2) {
				sum = loop(num1, num2);
				System.out.println("===================\n"
						+ num1 + "부터 " + num2 + "까지의 홀수의 합은 " + sum + "입니다.");
			}
			//4. else (num1 >= num2), num2~ num1까지 숫자 생성
			else {
				sum = loop(num2, num1);
				System.out.println("===================\n"
						+ num2 + "부터 " + num1 + "까지의 홀수의 합은 " + sum + "입니다.");
			}
			//5. 출력
	}
	
	public int loop(int args1, int args2) {
		int sum = 0;
		int i = args1;
		while(i <= args2) {
			if(i % 2 ==0) {
				continue;
			}
			//3-2. 홀수의 경우, 합을 구한다.
			else {
				sum += i;
			}
		}
		return sum;
	}
	
	

}
