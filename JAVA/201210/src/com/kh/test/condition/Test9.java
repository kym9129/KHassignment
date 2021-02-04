package com.kh.test.condition;

import java.util.Scanner;

public class Test9 {
	
	public static void main(String[] args) {
		Test9 t9 = new Test9();
		t9.test();
	}

	public void test() {
		String mainMenu = "*********주메뉴*********\n" + 
				"       a. 불고기버거 ------------5000\n" + 
				"       b. 새우버거 --------------4000\n" + 
				"       c. 치킨버거 --------------4500\n" + 
				"       d. 한우버거 -------------10000\n" + 
				"       e. 디버거 ----------------7000\n" + 
				"       ***********************\n";
		
		String sideMenu = "*******사이드메뉴********\n" + 
				"        1. 콜라 -------------------1500\n" + 
				"        2. 사이다 -----------------1500\n" + 
				"        3. 밀크쉐이크-------------2500\n" + 
				"        4. 레드불------------------3000\n" + 
				"        ***********************\n";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(mainMenu);
		System.out.println("주문하시려는 주메뉴의 알파벳을 입력하세요: > ");
		char mainChoice = sc.next().charAt(0);
		
		System.out.println(sideMenu);
		System.out.println("주문하시려는 사이드메뉴의 변호를 입력하세요: > ");
		int sideChoice = sc.nextInt();
		
		int mainPrice = 0;
		int sidePrice = 0;

		if (mainChoice == 'a') {
			mainMenu = "불고기버거";
			mainPrice = 5000;
			switch(sideChoice) {
				case 1: 
					sideMenu = "콜라";
					sidePrice = 1500;
					int total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 2: 
					sideMenu = "사이다";
					sidePrice = 1500;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 3: 
					sideMenu = "밀크쉐이크";
					sidePrice = 2500;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 4: 
					sideMenu = "레드불";
					sidePrice = 3000;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				default : System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
				
			}
		}
		else if (mainChoice == 'b') {
			mainMenu = "새우버거";
			mainPrice = 4000;
			switch(sideChoice) {
				case 1: 
					sideMenu = "콜라";
					sidePrice = 1500;
					int total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 2: 
					sideMenu = "사이다";
					sidePrice = 1500;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 3: 
					sideMenu = "밀크쉐이크";
					sidePrice = 2500;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 4: 
					sideMenu = "레드불";
					sidePrice = 3000;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				default : System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
			}
		}
		else if (mainChoice == 'c') {
			mainMenu = "치킨버거";
			mainPrice = 4500;
			switch(sideChoice) {
				case 1: 
					sideMenu = "콜라";
					sidePrice = 1500;
					int total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 2: 
					sideMenu = "사이다";
					sidePrice = 1500;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 3: 
					sideMenu = "밀크쉐이크";
					sidePrice = 2500;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 4: 
					sideMenu = "레드불";
					sidePrice = 3000;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				default : System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
			}
		}
		else if (mainChoice == 'd') {
			mainMenu = "한우버거";
			mainPrice = 10000;
			switch(sideChoice) {
				case 1: 
					sideMenu = "콜라";
					sidePrice = 1500;
					int total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 2: 
					sideMenu = "사이다";
					sidePrice = 1500;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 3: 
					sideMenu = "밀크쉐이크";
					sidePrice = 2500;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 4: 
					sideMenu = "레드불";
					sidePrice = 3000;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				default : System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
			}
		}
		else if (mainChoice == 'e') {
			mainMenu = "디버거";
			mainPrice = 7000;
			switch(sideChoice) {
				case 1: 
					sideMenu = "콜라";
					sidePrice = 1500;
					int total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 2: 
					sideMenu = "사이다";
					sidePrice = 1500;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 3: 
					sideMenu = "밀크쉐이크";
					sidePrice = 2500;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				case 4: 
					sideMenu = "레드불";
					sidePrice = 3000;
					total = mainPrice + sidePrice;
					System.out.println(mainMenu + ", " + sideMenu + "은(는) 총" + total + "원 입니다."); 
					break;
				default : System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
			}
		}
		
		else {
			System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
		}
		
		
	}
	
	
}
