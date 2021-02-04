package com.kh.test.loop;

import java.util.Scanner;

public class Test4 {
	
		public static void main(String[] args) {
	
		Test4 t4 = new Test4();
		t4.test();

	}
	
	public void test() {
//		(문자열의 길이를 리턴하는 String의 메소드를 api에서 찾아 사용할 것)
//	    문자열과 문자열에서 검색될 문자를 입력 받아 
//		문자열에 그 문자가 몇 개이었는지 개수를 확인하는 
//	    프로그램을 작성하세요. 
//	    또, 검색할 문자가 영문자가 아니면 "영문자가 아닙니다." 출력후
//	    프로그램을 종료하세요. 
//	    
//	    출력 예)
//	    문자열 입력 : application
//	    검색할 문자 입력 : p
//	    'p'가 포함된 갯수 : 2 개
//	    
//	    
//	    문자열 입력 : apple_test123
//	    문자 입력 : ㄱ
//	    영문자가 아닙니다.
		
		int idx = 0;
		int cnt = 0;
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. >");
		String str = sc.nextLine();
		System.out.println("검색할 문자를 입력하세요. >");
		char inputCh = sc.next().charAt(0);
		
		//1. 영문자 검사
		if( (inputCh >= 'a' && inputCh <= 'z') || (inputCh >= 'A' && inputCh <= 'Z')) {
			//2. 문자열 char 인덱싱
			
			for (int i = 0; i<str.length(); i++) {
				char ch2 = str.charAt(idx);
				idx++;
				//3. 검색
				if(inputCh == ch2) {
					cnt++;
				}
			}
			
	
			//출력
			System.out.println("입력하신 문자열 : " + str);
			System.out.println("검색을 요청하신 문자 : " + inputCh);
			System.out.println("\'"+inputCh+"\'가 포함된 갯수 : " + cnt);
		}

		
		else {
			System.out.println("영문자가 아닙니다. 프로그램을 종료합니다.");
		}

		 		
		
		
		
	}

}
