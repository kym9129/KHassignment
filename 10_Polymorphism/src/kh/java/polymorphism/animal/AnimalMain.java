package kh.java.polymorphism.animal;

public class AnimalMain {

	public static void main(String[] args) {
		AnimalMain am = new AnimalMain();
//		am.test1();
//		am.test2();
//		am.test3();
//		am.test4();
//		am.test5();
//		am.test6();
//		am.test7();
		am.test8();
		

	}
	
	//인터페이스
	public void test8() {
//		Runnable r = new Runnable(); // Cannot instantiate
		Runnable r1 = new Dog();
		Runnable r2 = new Cat();
		
		r1.run();
		r2.run();
		
//		r1.say(); //Animal 재작성메소드
//		r1.attack(); //Animal 재작성메소드
//		r1.kick(); //Dog의 kick
		
		System.out.println("Runnable.LEGS = " + Runnable.LEGS);
		
		//다운캐스팅으로 사용가능
		((Dog)r1).say();
		((Dog)r1).attack();
		((Dog)r1).attack();
		
		Bitable b1 = new Dog();
		Bitable b2 = new Cat();
		
		b1.bite("멍멍!");
		b2.bite("왜애애애앵!!!1");
		System.out.println("---------");
		
		System.out.print("독수리 : ");
		Flyable f = new Eagle();
		f.fly();
		
	}
	
	//추상클래스 Animal
	public void test7() {
//		Animal a = new Animal(); //Cannot instantiate the type Animal
		Animal a = new Cat(); //변수 타입으로서는 사용될 수 있음.
		Animal b = new Dog();
		Animal c = new Snake();
		
		//추상클래스 Animal을 상속한 자식클래스는
		//무조건 추상메소드 attack구현을 보장받는다.
		
		a.attack();
		b.attack();
		c.attack();
	}
	
	//동적바인딩
	public void test6() {
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		a1.say();
		a2.say();
		
		//다형성을 이용한 attack
		Animal[] arr = new Animal[100];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				arr[i] = makeDog();
			}
			else
				arr[i] = makeCat();
		}
		
		//실행
		for(Animal anm : arr)
			anm.attack(); //동적바인딩 자식클래스의 메소드가 호출됨
	}
	
	//다영성의 활용
	//1. 매개변수 선언부
	//2. 리턴값 처리
	
	//리턴값을 다형성 이용해서 처리하기
	public void test5() {
//		Cat cat = makeCat();
		Animal cat = makeCat();
		Animal dog = makeDog();
		
		Animal[] arr = new Animal[100];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				arr[i] = makeDog();
			}
			else
				arr[i] = makeCat();
		}
		for(Animal anm : arr)
			attack(anm);
	}
	
	public Cat makeCat() {
		return new Cat();
	}
	
	public Dog makeDog() {
		return new Dog();
	}
	
	//매개변수 선언부에서 다형성 활용하기
	public void test4() {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		attack(cat);
		attack(dog);		
		
	}
	
	public void attack(Animal animal) {
		if(animal instanceof Cat)
			((Cat) animal).punch();
		else if(animal instanceof Dog)
			((Dog) animal).kick();
	}
	
//	public void attack(Cat cat) {
//		cat.punch();
//	}
//	
//	public void attack(Dog dog) {
//		dog.kick();
//	}
	
	
	
	
	//Animal a = new Dog();
	//부모타입의 배열에도 자식객체를 담을 수 있다.
	public void test3() {
		
		Animal[] arr = new Animal[3];
		arr[0] = new Cat();
		arr[1] = new Dog();
//		arr[2] = new Animal();
		
		//Animal anml = new Dog();
		for(Animal anml : arr) {
			anml.say();
//			((Cat)anml).punch();
//			((Dog)anml).kick();
			
			//instanceof : 해당타입의 객체인 경우 true를 리턴
			//true가 리턴된 경우, 해당 타입으로의 안전한 형변이 보장됨.
			//Cat 객체인 경우
			if(anml instanceof Cat) {
				((Cat)anml).punch();
			}
			
			//Dog 갯체인 경우
			else if(anml instanceof Dog) {
				((Dog)anml).kick();				
			}
		}
		
	}
	
	public void test2() {
		Animal animal = new Dog(); //upcasting
		Dog dog = (Dog)animal; //downcasting
		
		dog.kick();
	}

	public void test1() {
		
		Cat cat = new Cat();
		cat.say();
		cat.punch();
		
		Animal animal1 = cat;
		Object obj1 = cat;
		
		System.out.println(animal1 == cat); //참조변수 주소값비교 true
		animal1.say();
//		animal1.punch(); 
		//부모타입 변수에 담기면 자식클래스에서 선언한 자원(필드/메소드)을 사용할 수 없다.
		
		System.out.println("------------");
		//다시 자식타입의 변수에 담으면 자식타입의 자원 사용 가능
//		Animal animal2 = (Animal)obj1;
//		animal2.say();
		((Animal)obj1).say();
		
//		Cat cat2 = (Cat)animal2;
//		cat2.punch();
		((Cat)obj1).punch();
		
	}
}
