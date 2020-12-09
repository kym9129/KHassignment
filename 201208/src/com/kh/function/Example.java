package com.kh.function;

import java.util.Scanner;

public class Example {
	
	Scanner sc = new Scanner(System.in);
	
	public void opSample1() {
		
		
		//입력요청
		System.out.println("[ 점수를 입력하세요 ]\n");
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double average = total/3.0;
		
		//output
		System.out.println("\n국어 = " + kor + "점");
		System.out.println("영어 = " + eng + "점");
		System.out.println("수학 = " + math + "점\n");
		System.out.println("총점 = " + total);
		System.out.println("평균 = " + average);
		System.out.println("--------------------------");
		
		//합격조건
		System.out.println(kor>40 && eng>40 && math>40 && average>60? "\t합격" : "\t불합격");
		System.out.println("--------------------------\n");
		
	}

	public void opSample2() {
		
		sc.nextLine(); //개행문자 날리기
		System.out.print("이름 입력 (ex.홍길동) : ");
		String name = sc.nextLine();
		System.out.print("학년 입력 (ex.3) : ");
		int level = sc.nextInt();
		System.out.print("반 입력 (ex.7) : ");
		int classNum = sc.nextInt();
		System.out.print("번호 입력 (ex. 20)");
		int num = sc.nextInt();
		System.out.print("성별을 입력하세요. (ex. 남자 = M / 여자 = F) : ");
		char gender = sc.next().charAt(0);
		String genderReturn = gender == 'M'? "남학생" : "여학생";
		System.out.print("성적 입력 (ex. 96.45) : ");
		double grade = sc.nextDouble();
		
		System.out.println("\n >> " + level +"학년 " + classNum + "반 " + num + "번 " + genderReturn + " " + name +"은(는) 성적이 " + grade + "이다.");
		
		sc.close();
		
	}
}
