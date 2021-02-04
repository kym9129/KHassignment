package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcDday {

	public static void main(String[] args) {
		CalcDday cd = new CalcDday();
//		cd.test1();
		cd.test2();

	}
	
	public void test2() {
//		Calendar클래스를 이용해서 D-DAY계산기를 만드세요.
//		출력은 다음과 같습니다.
//		 ->  193일 남았습니다. (D-DAY 전)
//		 ->  D-DAY입니다.(D-DAY)  
//		 ->  20일 지났습니다.(D-DAY가 지난 경우)
		
		System.out.println("===== D-DAY계산기 ======");
		
		//사용자 날짜 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 날짜를 입력하세요. (ex. 20201225) > ");
		String userDate = sc.next();
		
		//yyyy mm dd분리
		int year = Integer.parseInt(userDate.substring(0, 4));
		int month = Integer.parseInt(userDate.substring(4, 6));
		int date = Integer.parseInt(userDate.substring(6, 8));
		Calendar userCal = new GregorianCalendar(year, month, date);
		
		//D-day계산
		//현재날짜 month + 1
		Calendar now = Calendar.getInstance();
		now.set(now.get(Calendar.YEAR), (now.get(Calendar.MONTH)+1), now.get(Calendar.DATE));

		long nowSec = now.getTimeInMillis();
		long userCalSec = userCal.getTimeInMillis();
		long diff = (userCalSec - nowSec) / 1000 / 60 / 60 / 24;
		
		//출력
		if(diff == 0)
			System.out.println("D-Day입니다.");
		else if(diff > 0)
			System.out.println(diff + "일 남았습니다.");
		else
			System.out.println((diff*-1) + "일 지났습니다.");
		
	}
	
	public void test1() {
//		수료일까지 남은 일수를 계산해서 다음과 같이 출력하세요.
//		->  D-193일입니다.
//		->  D-Day입니다.
		
		//수료일 : 2021.07.08
		Calendar endDay = new GregorianCalendar(2021, 6, 8);
		
		//D-day 계산
		Calendar now = Calendar.getInstance();
		long nowSec = now.getTimeInMillis();
		long endDaySec = endDay.getTimeInMillis();
		long diff = (endDaySec - nowSec) / 1000 / 60 / 60 / 24;
		
		//출력
		if(diff == 0)
			System.out.println("D-Day입니다.");
		else
			System.out.println("D-" + (diff) + "일입니다.");
			
		
	}

}
