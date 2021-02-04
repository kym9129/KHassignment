package com.kh.test.condition;

import java.util.Scanner;


public class Test8 {
	
	public static void main(String[] args) {
		Test8 t8 = new Test8();
		t8.test();
	}
	
	public void test() {
	String menu = " **********메  뉴*********\n" + 
			"       1. 떡볶이 ----------------1000\n" + 
			"       2. 김밥 ------------------ 2000\n" + 
			"       3. 오뎅 ------------------ 1000\n" + 
			"       4. 순대 ------------------ 2000\n" + 
			"       5. 튀김 ------------------ 3000\n" + 
			"       6. 떡튀순 ---------------- 8000\n" + 
			"    *************************\n" + 
			"     메뉴번호 입력 : ‘번호입력’";
	int price = 0;
	System.out.println(menu);
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	
	switch(choice) {
		case 1 : 
			menu = "떡볶이";
			price = 1000;
			System.out.println(menu + "은는 " + price + "원입니다."); break;
		case 2 : 
			menu = "김밥";
			price = 2000;
			System.out.println(menu + "은/는 " + price + "원입니다."); break;
		case 3 : 
			menu = "오뎅";
			price = 1000;
			System.out.println(menu + "은/는 " + price + "원입니다."); break;
		case 4 : 
			menu = "순대";
			price = 2000;
			System.out.println(menu + "은/는 " + price + "원입니다."); break;
		case 5 : 
			menu = "튀김";
			price = 3000;
			System.out.println(menu + "은/는 " + price + "원입니다."); break;
		case 6 : 
			menu = "떡튀순";
			price = 8000;
			System.out.println(menu + "은/는 " + price + "원입니다."); break;
			
	
		default : System.out.println("번호가 잘못 입력되었습니다. 영업을 종료합니다.");
		}
	}
}
