package com.api.calendar;

import java.util.Calendar;

public class CalendarTest {
	/*
	 * Calendar 클래스 사용
		오늘 날짜에 대한 객체 생성
		년, 월, 일, 시, 분, 초 값을 각각 변수에 분리 저장한 후
		"2011년 3월 21일 월요일 3시 20분 5초" 로 출력해 보시오.
	 */

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		now.set(2011, 2, 21, 3, 20, 5);
		
		int year = now.get(Calendar.YEAR);
		int month = (now.get(Calendar.MONTH))+1;
		int date = now.get(Calendar.DATE);
		int dayName = now.get(Calendar.DAY_OF_WEEK); //1 2 3 4 5 6 7
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		String[] stAr = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		System.out.println(year + "년 " + month + "월 " + date + "일 "
				+ stAr[dayName-1] + " " + hour + "시 " + minute + "분 "
				+ second + "초");

	}

}
