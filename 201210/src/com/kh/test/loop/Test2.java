package com.kh.test.loop;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args){	
		
		Test2 t2 = new Test2();
		t2.test();
	}
	
	public void test() {
//		정수를 입력 받아 1부터 입력 받은 정수까지 수를 
//	    홀수와 짝수를 나눠서 홀수면 “수”, 짝수면 “박”을 
//	    출력 하세요.
//	  
//	    예) 4입력 : 수박수박 / 5입력 : 수박수박수 출력
		
		//미완!!!!!!!********************
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요. > ");
		int user = sc.nextInt();
		
		char ch = '수';
		
		for(int i = 1; i <= user; i++) {
			ch = i % 2 == 0 ? '박' : '수';
			System.out.print(ch);
			}
		
		
	}

}
