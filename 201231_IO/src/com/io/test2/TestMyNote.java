package com.io.test2;

import java.util.Scanner;

public class TestMyNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMyNote.menu();
		System.out.println("main()종료!");
	}
	
	public static void menu() {
//		* 구현 내용
//		MyNote 클래스 객체 생성함
//		키보드 입력용 객체 생성함
//		아래 내용이 콘솔에 출력되게 함
//
//		******   MyNote  *******
//
//		1. 노트 새로 만들기		//MyNote의 fileSave()
//		2. 노트 열기			//MyNote의 fileOpen()
//		3. 노트 열어서 수정하기		//MyNote의 fileAppend()
//		4. 끝내기				//main() 으로 리턴
//
//		메뉴 선택 : 번호입력
//
//		입력된 번호에 따라, MyNote 의 메소드 실행시킴
//		메뉴 반복 실행
		
		MyNote n = new MyNote();
		
		while(true) {
			System.out.println("******   MyNote  *******\n"
							+"1. 노트 새로 만들기\n"
							+ "2. 노트 열기\n"
							+ "3. 노트 열어서 수정하기\n"
							+ "4. 끝내기\n"
							+ "\n메뉴 선택 : 번호입력");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: n.fileSave(); break;
			case 2: n.fileOpen(); break;
			case 3: n.fileAppend(); break;
			case 4: return;
			default : System.out.println("잘못 입력하셨습니다. 메뉴를 다시 선택해주세요."); continue;
			
		}
		}
	}

}
