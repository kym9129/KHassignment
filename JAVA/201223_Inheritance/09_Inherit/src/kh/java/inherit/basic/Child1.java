package kh.java.inherit.basic;

public class Child1 extends Parent {

	public Child1() {
		super(); //부모생성자 호출!
		System.out.println("Child1 생성자 호출!");
	}
	
	public void say() {
		System.out.println("제가 첫째입니다.");
	}
	
	public void game() {
		System.out.println("첫째가 게임을 합니다.");
	}

}