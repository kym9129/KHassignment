package com.oop.method.static_;

public class Run {

	public static void main(String[] args) {
//		StaticMethod s = new StaticMethod();
		System.out.println(StaticMethod.toUpper("hello world"));
		StaticMethod.setChar("hello", 2, 'L');
		System.out.println("알파벳 갯수 = " + StaticMethod.getAlphabetLength("hell23o!"));
		System.out.println(StaticMethod.concat("Hi! ", "Nice to meet you!"));

	}

}
