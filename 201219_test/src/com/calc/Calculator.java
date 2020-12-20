package com.calc;

public class Calculator {
	//main의 argument로 1자리 정수형(1부터 9까지만)값을 2개 입력받아 4칙연산 결과를 출력한다.
	//입력값은 모두 int형으로 처리한다.
	
	/**
	 *실행 결과 예
	 *4와 2를 입력하였으 경우
	 *합 : 6
	 *차 : 2
	 *곱 : 8
	 *나누기 : 2
	 * @param args
	 */
	
	//Integer.parseInt를 몰라서 틀렸지 뭐야

	public static void main(String[] args) {
		
		int right = Integer.parseInt(args[0]);
		int left = Integer.parseInt(args[1]);
		System.out.println("합 : " + (right + left));
		System.out.println("차 : " + (right - left));
		System.out.println("곱 : " + (right * left));
		System.out.println("나누기 : " + (right / left));

	}

}
