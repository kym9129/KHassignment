package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

/**
 *  1. Coffee 클래스에 대한 객체 배열(세계3대커피정보) 선언함. 배열크기 3.
    2. 사용자에게 키보드로 세계3대 커피정보를 입력받아, 각 객체에 기록함
    3. 출력 확인함
    <세계3대커피>
    ---------------------------
    원산지           지역
    ---------------------------
    예멘          모카마타리
    자메이카       블루마운틴
    하와이           코나
 *
 */
public class CoffeeManager {
	
	private Coffee[] coffeeArray = new Coffee[3];
	private Scanner sc = new Scanner(System.in);


	//정보입력 메소드
	public void inputCoffee() {
		
		for(int i = 0; i < 3; i++) {
			System.out.println("----" + (i+1) + "----");
			System.out.println("원산지 입력 : ");
			String origin = sc.nextLine();
			System.out.println("지역 입력 : ");
			String location = sc.nextLine();
			Coffee c = new Coffee(origin, location);
			coffeeArray[i] = c;
		}
		
	}
	
	public void outputCoffee() {
		for(Coffee c : coffeeArray) {
			c.printInfo();
		}
	}

}
