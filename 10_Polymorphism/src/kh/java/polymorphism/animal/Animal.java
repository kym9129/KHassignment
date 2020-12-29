package kh.java.polymorphism.animal;

public abstract class Animal {

	public void say() {
		System.out.println("안녕하세요, 저는 동물입니다.");
	}
	
	//자식클래스의 구체적인 attack메소드를 묶어주는 용도 : 추상화 처리
	//메소드의 구현 강제화 : 추상클래스 & 추상 메소드
	//자식클래스에 대한 규격을 제공! 부모클래스 타입으로도 Override할 메소드를 모두 사용가능.
	public abstract void attack();
	
}
