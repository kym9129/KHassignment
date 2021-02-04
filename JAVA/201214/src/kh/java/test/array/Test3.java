package kh.java.test.array;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();

	}
	
	public void test() {
		/**
		 * 문자열을 하나 입력 받아 문자배열에 넣고 검색할 문자를 하나 입력 받아 검색 문자가 문자열에 몇 개인지 개수를 출력하는 프로그램을 작성하세요.
    
    예) 입력값 : helloworld
    검색값 :ㅣ
    출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.

		 */
		
		Scanner sc = new Scanner(System.in);
		
		//문자열 입력받기
		System.out.println("문자열을 입력하세요. > ");
		String inputStr = sc.nextLine();
		
		//char[]로 변환하기
		char[] toChar = inputStr.toCharArray();
		
		//char 입력받기
		System.out.println("검색할 문자를 하나 입력하세요. > ");
		char searchChar = sc.next().charAt(0);
		
		//문자열에서 문자 검색하기
		int cnt = 0;
		
		for (int i = 0; i < toChar.length; i++) {
			if(toChar[i] == searchChar) {
				cnt++;
			}
		}
		
		//출력
		System.out.println("입력하신 문자열 " + inputStr + "에서 찾으시는 문자 " + searchChar + "은(는) " + cnt + "개 입니다.");
		
		
	}

}
