package ncs.test9;

public class PlaneTest {

	public static void main(String[] args) {
		// Airplane 과 Cargoplane 객체 생성
		Airplane a = new Airplane("L747", 1000);
		Cargoplane c = new Cargoplane("C40", 1000);
		// 생성된 객체의 정보 출력
		System.out.println("Plane\t\tfuelSize\n"
				+ "----------------------------");
		System.out.println(a.getPlaneName() + "\t\t" + a.getFuelSize());
		System.out.println(c.getPlaneName() + "\t\t" + c.getFuelSize());
		
		// Airplane 과 Cargoplane 객체에 100 씩 운항 
		// 100 운항 후 객체 정보 출력
		System.out.println("100 운항");
		a.flight(100);
		c.flight(100);
		
		System.out.println("Plane\t\tfuelSize\n"
				+ "----------------------------");
		System.out.println(a.getPlaneName() + "\t\t" + a.getFuelSize());
		System.out.println(c.getPlaneName() + "\t\t" + c.getFuelSize());
		
		//Airplane 과 Cargoplane 객체에 200 씩 주유 
		// 200 주유 후 객체 정보 출력
		System.out.println("200 주유");
		a.refuel(200);
		c.refuel(200);
		
		System.out.println("Plane\t\tfuelSize\n"
				+ "----------------------------");
		System.out.println(a.getPlaneName() + "\t\t" + a.getFuelSize());
		System.out.println(c.getPlaneName() + "\t\t" + c.getFuelSize());

	}

}
