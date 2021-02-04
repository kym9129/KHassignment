package workshop4;

public class Test04 {

	public static void main(String[] args) {
		Calc c = new Calc();
		
		int data = Integer.parseInt(args[0]);
		System.out.println("\n결과 : " + c.calculate(data));
		
	}

}
