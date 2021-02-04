package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 t5 = new Test5();
		t5.test();

	}
	
	public void test() {
//		키(cm)와 몸무게(kg)을 입력 받고, 
//		   BMI(체질량지수)를 계산하여 계산된 값에 따라 
//		   저체중(18.5미만), 정상체중(18.5이상 23미만), 과체중(23이상 25미만), 비만(25이상 30미만), 고도비만(30이상)을 출력하세요. 
//		   BMI 계산식 = 체중(kg) / (신장(m) * 신장(m) ) 
//		   예) BMI = 67 / (1.7 * 1.7)

		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(cm)를 입력하세요. (ex. 175) : ");
		int height = sc.nextInt();
		System.out.println("몸무게(kg)를 입력하세요. (ex. 65) : ");
		double weight = sc.nextInt();
		
		double bmi = weight / (((double)height / 100.0) * ((double)height / 100.0));
		System.out.println("BMI = " + bmi);
		
		if(bmi <18.5) {
			System.out.println("저체중");
		}
		else if(bmi >=18.5 && bmi <23.0) {
			System.out.println("정상체중");
			
		}
		else if(bmi >= 23.0 && bmi <25.0) {
			System.out.println("과체중");
			
		}
		else if(bmi >= 25 && bmi < 30) {
			System.out.println("비만");
			
		}
		
		else if(bmi >= 30.0) {
			System.out.println("고도비만");
			
		}
		
		sc.close();
	}

}
