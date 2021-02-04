package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test3 {
	/**
	 * 클래스명: com.kh.test.nested.loop.Test3.java
메소드명: public void test()
    정수하나 입력받아, 그 수가 양수일때만 입력된 
    수를 줄 수로 적용하여 다음과 같이 출력되게 하는 
    프로그램을 만들어보자.
        출력예)
      정수 입력 : 5
    
         *
         **
         ***
         ****
         *****
          ****
           ***
            **
             *
    

	 * @param args
	 */

	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		t3.test();

	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 > ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input+(input-1); i++) {	
			for(int j=0; j<input;j++) {
				if(i<input && j<=i) {
					System.out.print("*");
				}
				else if(i>=input && j<=i-input) {
					System.out.print(" ");
				}else if(i>=input)
					System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
