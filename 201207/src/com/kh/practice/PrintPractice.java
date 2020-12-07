package com.kh.practice;

public class PrintPractice {

	public static void main(String[] args) {
		PrintPractice p = new PrintPractice();
		p.prac();

	}
	
	/***
	 * %b : 불리언 정수
	 * %d : 10진수(decimal) 정수
	 * %o : 8진(octal) 정수
	 * %x, %X: 16진(hexa-decimal) 정수 
	 * %f : 부동 소수점(floating-point) 실수
	 * %e, %E : 지수(exponent)표현식 (실수)
	 * %c : 문자(char)
	 * %s : 문자열(string)
	 *
	 * 큰따옴표 안에 입력하는 것 같음
	 * 큰따옴표 마지막에 개행문자 \n(%n)를 넣어야 줄바꿈_%n는 모든 OS에서 적용  
	 */
	
	public void prac() {
		System.out.println(10.0/3);
		System.out.printf("%.2f%n", 10.0/3); //3.33 소숫점 몇자리까지 출력할 것인가 
		System.out.printf("%.3f%n", 10.0/3);
		System.out.printf("age:%d year:%d%n", 14, 2017);
		
		System.out.printf("%d%n", 15); //10진수 
		System.out.printf("%o%n", 15); //8진수 
		System.out.printf("%x%n", 15); //16진수 
		System.out.printf("%s%n", Integer.toBinaryString(15)); //2진수  
		
		//8진수와 16진수에 접두사 붙이기 
		System.out.printf("%#o%n", 15);
		System.out.printf("%#x%n", 15);
		System.out.printf("%#X%n", 15);
		
		//실수 출력을 위한 지시자 %f
		float f = 123.456789f;
		System.out.printf("%f%n", f); //float 소수점아래6자리까지 
		System.out.printf("%e%n", f); //지수형식 (이게뭐지) 
		System.out.printf("%g%n", 123.456789); //간략한 형식  
		System.out.printf("%g%n", 0.00000001); //간략한 형식 
		System.out.printf("%e%n", 0.00000001); //이건 위에보다 왜 0이 1개 더 붙지 
	
		
		
		
	}

}
