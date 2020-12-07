package com.kh.test;

public class Test1 {
	
	public static void main (String[] args) {
		
//		1. 각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.
//	    - 정수형 100, 9999억, 
//	    - 실수 486.520(float), 567.890123
//	    - 문자 A
//	    - 문자열 Hello world, 
//	    - 논리 true
//	     
//	     단, 변수를 이용하여 출력하시오 .
//	    com.kh.test.Test1 에 작성
		
		int a = 100;
		long b = 999900000000L;
		float c = 486.520f;
		double d = 567.890123;
		char e = 'a';
		String f = "Hello world";
		boolean g = true;
		
		System.out.println("int a = " + a);
		System.out.println("long b = " + b);
		System.out.println("float c = " + c);
		System.out.println("double d = " + d);
		System.out.println("char e = " + e);
		System.out.println("String f = " + f);
		System.out.println("boolean g = " + g);
		
		Test1 t = new Test1();
		t.test2();


	}
	
	
//	2. 다음 코드의 형변환 과정과 결과값을 예상해 주석으로 작성한뒤 콘솔 결과와 비교하세요.
    public void test2(){
        System.out.println("A = "+ ('A'+0)); //65
        
        System.out.println("0 =" + ('0' + 0) ); //48
        
        System.out.println("(char)65 = " + (char)65); //A
        
        byte bt1 = 125;
        char ch1 = 'C'; //67
        int it1 = bt1 - ch1;
        System.out.println("it1 = "+it1); // 125-67 = 58
        
        
        boolean bool = false;
        
        bool = (2.0 == 5/2);
        System.out.println("bool = " + bool); // true
        
        bool = ('C' == 67);
        System.out.println("bool = " + bool); // true
        
        bool = ('A' == 'B'-1);
        System.out.println("bool = " + bool); //true
        
        bool = ('a' != 97 );//부정연산자
        System.out.println("bool = " + bool); //97 false
    }

	

}
