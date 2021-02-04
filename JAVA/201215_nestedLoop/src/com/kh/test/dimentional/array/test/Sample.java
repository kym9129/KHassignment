package com.kh.test.dimentional.array.test;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.exercise1();

	}

	public void exercise1() {

		// 2. 각 행별 열갯수는 키보드로 입력받아 생성함
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 > ");
		int num = sc.nextInt();

		// 1. 3행짜리 2차원배열 선언 및 생성
		int[][] arr = new int[3][num];

		// 3. 1~100사이의 임의의 정수를 모든 방에 기록함

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int rndm = (int) (Math.random() * 100) + 1;
				arr[i][j] = rndm;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		// 4. 각 행별 열의 합계가 5의 배수인 행열값만 출력함

	}

}
