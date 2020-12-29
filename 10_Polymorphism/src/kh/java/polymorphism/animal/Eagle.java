package kh.java.polymorphism.animal;

public class Eagle extends Animal implements Flyable {
	
	@Override
	public void attack() {
		System.out.println("독수리가 공격합니다.");
	}
	
	@Override
	public void fly() {
		System.out.println("독수리가 비행합니다.");
	}

}
