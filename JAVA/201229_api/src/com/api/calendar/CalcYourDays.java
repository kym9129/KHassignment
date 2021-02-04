package com.api.calendar;

import java.util.Calendar;
import java.util.Scanner;

//사용자로부터 생일(년, 월, 일)을 입력받고, 오늘이 태어난지 몇일 되었는지 출력하세요.
public class CalcYourDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생년월일을 입력하세요. (ex. 20201225)");
		String birth = sc.next();
		
		//yyyy mm dd분리
		int year = Integer.parseInt(birth.substring(0, 4));
		int month = Integer.parseInt(birth.substring(4, 6));
		int date = Integer.parseInt(birth.substring(6, 8));
		
		//생일을 Calendar에 넣기
		Calendar birthCal = Calendar.getInstance();
		birthCal.set(year, month-1, date);
		
		//D+day 계산
		Calendar now = Calendar.getInstance();
		long nowSec = now.getTimeInMillis();
		long birthSec = birthCal.getTimeInMillis();
		long diff = (nowSec - birthSec) / 1000 / 60 / 60 / 24;
		
		//출력
		//태어난날부터 1일이니까 +1
		System.out.println("오늘로 태어난지 " + (diff+1) + "일 되었습니다.");
		

	}

}
