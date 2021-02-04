package com.exception.charcheck;

import java.util.Scanner;


public class Run {
//	실행할 메소드 작성 : public void test1(){}
//	키보드로 문자열을 입력받아 사용
//	countAlpha 메소드로 문자열 전달하고, 실행결과 받아 출력함.
//	- 반드시 try ~ catch 문 사용.
//	에러메시지 : "체크할 문자열 안에 공백 포함할 수 없습니다."

public static void main(String[] args) {
	Run r = new Run();
	r.test1();

}

public void test1() {
	//키보드로 문자열을 입력받아 사용
	Scanner sc = new Scanner(System.in);
	System.out.println("문자열을 입력하세요. : ");
	CharacterProcess c = new CharacterProcess();

	try {
		System.out.println("알파벳의 수 = " + c.countAlpha(sc.nextLine()));
		} catch (CharCheckException e) { //메소드가 회피로 던지는 예외와 일치해야하는구먼
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}

}
