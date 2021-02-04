package com.kh.edu;
import java.text.SimpleDateFormat;
import java.util.Date;

//3. 
//자바 기본 API활용
//* package : com.kh.edu
//* class : TestJavaApi
//* 메소드 : public static void main(String[] args){ }
//자바에서 지원하는 API 중 java.util.Date 클래스를 이용해서 오늘 날짜를 출력하세요
//    출력형식 : 2020/8/14

public class TestJavaApi {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/M/dd");
		System.out.println(format.format(today));
		
		

	}

}
