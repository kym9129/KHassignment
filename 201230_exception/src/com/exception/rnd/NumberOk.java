package com.exception.rnd;

import java.io.IOException;
import java.util.Scanner;

public class NumberOk {

	// 임의의 난수(1~100사이의 정수)를 발생시켜 키보드로 입력된 값과 비교하여, 임의의 정수를 알아 맞히는 프로그램

	public static void main(String[] args) {
		NumberOk num = new NumberOk();
		num.gameStart();

		// 일단 main에 다 넣고 그 담에 각각의 메소드에 배치해보자.
//		int result = 0;
//		int input = 0;
//		char yn = ' ';

//		do {
//			boolean isTrue = true;
//			int rnd = (int) (Math.random() * 100) + 1;
//			// 랜덤값을 맞힐 때 까지 반복실행
////			System.out.println("do while실행");
//			while (isTrue == true) {
////				System.out.println("while실행");
//				// public int getNumber()
//				Scanner sc = new Scanner(System.in);
//				System.out.println("1~100사이의 정수를 입력하세요. > ");
//				input = sc.nextInt();
//
//				// 확인용 출력
//				System.out.println("input = " + input);
//				System.out.println("rnd = " + rnd);
//
//				// 판정. public int checkNumber()
//				if (input == rnd) {
//					System.out.println("맞았습니다.");
//					isTrue = false;
//					System.out.println("계속 하시겠습니까?(y/n) : ");
//					yn = sc.next().charAt(0);
//				}
//
//				else if (input < rnd) {
//					System.out.println("입력한 숫자보다 큽니다.");
////					isTrue = true;
//				}
//
//				else {
//					System.out.println("입력한 숫자보다 작습니다.");
////					isTrue = true;
//					}
//
//			}
//		} while (yn == 'y');
//		System.out.println("프로그램을 종료합니다.");

	}

	public void gameStart() {

		char yn = ' ';
		do {
			//랜덤수 생성
			int rnd = (int) (Math.random() * 100) + 1;
//			System.out.println("rnd = " + rnd);
			
			boolean isTrue = true;
			int check = 0;
			
			while(isTrue == true) {
				//입력값 받고 판정
				try {
				check = checkNumber(getNumber(), rnd);
				} catch (IOException e) {
					System.out.println("입력값이 잘못됐습니다. 다시 입력해주세요."); continue;

				}
				
				if(check == 0) {
					System.out.println("맞았습니다.");
					isTrue = false;
					System.out.println("계속 하시겠습니까?(y/n) : ");
					Scanner sc = new Scanner(System.in);
					yn = sc.next().charAt(0);
					}
				else if(check == 1)
					System.out.println("입력한 숫자보다 작습니다.");
				else
					System.out.println("입력한 숫자보다 큽니다.");
					
			}
		}while(yn == 'y');
		System.out.println("프로그램을 종료합니다.");
	}

	// 키보드 입력값을 리턴하는 메소드
	public int getNumber() throws IOException{
		int input = 0;

			Scanner sc = new Scanner(System.in);
			System.out.println("1~100사이의 정수를 입력하세요. > ");
			input = sc.nextInt();

			// 입력값이 1~100을 벗어난 경우 예외처리
			if (input < 1 || input > 100)
				throw new IOException();
			
		return input;

	}

	// getNumber()에서 받은 값을 난수와 비교 후 결과값을 -1, 0, 1로 리턴.
	public int checkNumber(int input, int rnd) { 
		//인자를 1개만 받고 어떻게 비교를 하지?
		//난수를 여기에 넣으면 판정을 반복할 때마다 난수가 바뀌지 않나?
		
		int result = 0;
		// input과 난수 비교
		if (input == rnd)
			result = 0;

		else if (input < rnd)
			result = -1;
		else
			result = 1;
		return result;

	}

}
