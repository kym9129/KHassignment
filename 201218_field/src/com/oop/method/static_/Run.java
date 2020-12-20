package com.oop.method.static_;

public class Run {

	public static void main(String[] args) {
		StaticMethod s = new StaticMethod();
		System.out.println(s.toUpper("hello world"));
		s.setChar("hello", 2, 'L');
		System.out.println("알파벳 갯수 = " + s.getAlphabetLength("hell23o!"));
		System.out.println(s.concat("Hi! ", "Nice to meet you!"));

	}

}
