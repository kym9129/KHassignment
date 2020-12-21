package com.oop.movie.model.entity;

import java.util.Calendar;

public class Run {

	public static void main(String[] args) {

		//영화4편 정보 입력
		Calendar cal = Calendar.getInstance();
		
		
		Movie m1 = new Movie("원더우먼1984");
		Movie m2 = new Movie("화양연화", "왕가위");
		
		String[] actors3 = {"이재훈", "조우진", "신혜선", "임원희", "송영창"};
		Movie m3 = new Movie("도굴", "박정배", actors3);
		
		String[] actors4 = {"한지민", "남주혁", "허진", "박예진", "조복래"}; 
		Movie m4 = new Movie("조제", "김종관", actors4, cal); 
		
		
		System.out.println("============= 영화정보 =================");
		System.out.println(m1.information());
		System.out.println(m2.information());
		System.out.println(m3.information());
		System.out.println(m4.information());
	}
	

}
