package com.kh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {
	
	/**
	 * 수도세를 구하는 프로그램을 작성하세요. 
사용자에게 사용용도와 물사용량을 입력받고, 이에따른 수도세를 계산해 출력하세요.(switch문 사용할 것.)
* 사용요금: 용도별 가격(1liter)  * 사용량
* 수도세: 사용요금의 5%
* 총사용요금: 사용요금 + 수도세
* 사용용도메뉴에서 1,2,3번이외를 선택시에는 "메뉴번호는 1,2,3만 가능합니다."를 출력하고, 프로그램을 종료할 수 합니다.
사용자입력예시)
        ----------menu----------
        1. 가정용 (50원/liter)
        2. 상업용 (45원/liter)
        3. 공업용 (30원/liter)
        -------------------------
        메뉴번호를 선택하세요. ==> 2
        물 사용량을 입력하세요. ==> 250
출력예시)
        ----------<<수도세>>-----------
        선택메뉴번호 :  2. 상업용(업소에서 사용하실 경우)를 선택하셨습니다. 
        사용요금 : 11250
        수도세 : 562
        총수도요금 : 11812원

	 * @param args
	 */
	
	public static void main(String[] args) {
		
		SwitchTest1 st1 = new SwitchTest1();
		st1.test1();
	}
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		String menu = "----------menu----------\n" + 
				"1. 가정용 (50원/liter)\n" + 
				"2. 상업용 (45원/liter)\n" + 
				"3. 공업용 (30원/liter)\n" + 
				"-------------------------";
		System.out.println(menu);
		System.out.print("메뉴번호를 선택하세요. ==> ");
		int menuNum = sc.nextInt();
		System.out.println(" ");
		
		System.out.print("물 사용량을 입력하세요. ==> ");
		int water = sc.nextInt();
		System.out.println(" ");
		
		String menuStr = "용도"; //선택한 번호의 이름
		int choiceCal = 0; //선택한 번호의 계산값
		
		
		switch(menuNum) {
		case 1 :
			menuStr = "가정용";
			choiceCal = 50;	
			
			int useFee = choiceCal * water; //사용요금 계산
			double waterFee = useFee * 0.05; //수도세 계산
			int total = useFee + (int)waterFee; //총계

			System.out.println("----------<<수도세>>-----------\n" + 
					"선택메뉴번호 :  " + menuNum + "." + menuStr + "을(를) 선택하셨습니다. \n" + 
					"사용요금 : " + useFee +"\n" + 
					"수도세 : " + (int)waterFee + "\n" + 
					"총수도요금 : " + total + "원");
			break;
			
		case 2 :
			menuStr = "상업용";
			choiceCal = 45;
			
			useFee = choiceCal * water;
			waterFee = useFee * (5/100);
			total = useFee + (int)waterFee;
			
			System.out.println("----------<<수도세>>-----------\n" + 
					"        선택메뉴번호 :  " + menuNum + "." + menuStr + "을(를) 선택하셨습니다. \n" + 
					"        사용요금 : " + useFee +"\n" + 
					"        수도세 : " + (int)waterFee + "\n" + 
					"        총수도요금 : " + total + "원");
			break;
			
		case 3 :
			menuStr = "공업용";
			choiceCal = 30;	
			
			useFee = choiceCal * water;
			waterFee = useFee * (5/100);
			total = useFee + (int)waterFee;
			System.out.println("----------<<수도세>>-----------\n" + 
					"        선택메뉴번호 :  " + menuNum + "." + menuStr + "을(를) 선택하셨습니다. \n" + 
					"        사용요금 : " + useFee +"\n" + 
					"        수도세 : " + (int)waterFee + "\n" + 
					"        총수도요금 : " + total + "원");
			break;
			
		}
		

	}

}
