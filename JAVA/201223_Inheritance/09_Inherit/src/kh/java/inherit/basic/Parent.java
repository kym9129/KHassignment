package kh.java.inherit.basic;

/**
 * # 상속(Inheritance)

- 부모클래스가 가지고 있는 member 변수/메소드를 자식 클래스에서 선언하지 않고 사용할 수 있게 하는 것.

### 상속의 이점

- 중복을 제거해서 효율적으로 코드를 관리할 수 있다.
- 공통적인 코드를 부모클래스에서 관리할 수 있다.
 * @author jin
 *
 */

public class Parent {

	String name;
	int age;
	
	public Parent() {
		System.out.println("Parent 부모클래스 생성자 호출!");
	}
	
	public void say() {
		System.out.println("제가 애빕니다.");
	}
	
	public void printInfo() {
		System.out.println(name + ", " + age);
	}
}
