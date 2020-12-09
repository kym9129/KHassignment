package com.kh.test.condition;

import java.util.Scanner;

public class RSPGame {
	
	/**
	 * 
	 * ===가위 바위 보 게임===
	 * 숫자를 선택하새요(1.가위 / 2.바위 / 3.보) : 1
	 * ========결과========
	 * 당신은 가위를 냈습니다.
	 * 컴퓨터는 보를 냈습니다.
	 * ===================
	 * 당신이 이겼습니다.ㅠ.ㅠ
	 */

	public static void main(String[] args) {
		RSPGame game = new RSPGame();
		game.play();

	}
	
	public void play() {

		
		//유저 값 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 선택하새요 (1.가위 / 2.바위 / 3.보) :");
		int user= sc.nextInt();

		//컴퓨터 랜덤 수
		int com = (int)(Math.random() * 3) + 1;
		
		//가위바위보 변환		
		String uResult = user == 1? "가위" : (user == 2? "바위" : "보");
		String cResult = com == 1? "가위" : (com == 2? "바위" : "보");
	
	
		System.out.print("========결과========\n"
				+ "당신은 " + uResult + "를 냈습니다. \n"
				+ "컴퓨터는 " + cResult + "를 냈습니다. \n"
				+ "===================\n");

		//판정
		String comWin = "컴퓨터가 이겼습니다. ^^";
		String userWin = "당신이 이겼습니다. ㅠ.ㅠ";
		String tie = "비겼습니다.";
		
		//컴퓨터 가위
		if(com == 1) {
			if(user == 1) {
				System.out.println(tie);
			}
			else if(user == 2) {
				System.out.println(comWin);
			}
			else if(user == 3) {	
				System.out.println(userWin);
			}
		}
		
		//컴퓨터 바위
		if(com == 2) {
			if(user == 1) {
				System.out.println(comWin);
			}
			else if(user == 2) {
				System.out.println(tie);
			}
			else if(user == 3) {	
				System.out.println(userWin);
			}
		}
		
		//컴퓨터 보
		if(com == 3) {
			if(user == 1) {
				System.out.println(userWin);
			}
			else if(user == 2) {
				System.out.println(comWin);
			}
			else if(user == 3) {	
				System.out.println(tie);
			}
		}
	}
}
