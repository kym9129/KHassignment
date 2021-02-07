package mobile;

public class MobileTest {

	public static void main(String[] args) {
		Ltab l = new Ltab("Ltab", 500, "AP-01");
		Otab o = new Otab("Otab", 1000, "AND-20");

		System.out.printf("%s	%s	%s%n","Mobile", "Battery", "OS");
		System.out.println("-----------------------------");
		System.out.printf("%s	%d	%s%n", l.getMobileName(), l.getBatterySize(), l.getOsType());
		System.out.printf("%s	%d	%s%n", o.getMobileName(), o.getBatterySize(), o.getOsType());

		System.out.println("\n10분 충전\n");
		l.charge(10);
		o.charge(10);
	
		System.out.printf("%s	%s	%s%n","Mobile", "Battery", "OS");
		System.out.println("-----------------------------");
		System.out.printf("%s	%d	%s%n", l.getMobileName(), l.getBatterySize(), l.getOsType());
		System.out.printf("%s	%d	%s%n", o.getMobileName(), o.getBatterySize(), o.getOsType());

		System.out.println("\n5분 통화\n");
		l.operate(5);
		o.operate(5);
		
		System.out.printf("%s	%s	%s%n","Mobile", "Battery", "OS");
		System.out.println("-----------------------------");
		System.out.printf("%s	%d	%s%n", l.getMobileName(), l.getBatterySize(), l.getOsType());
		System.out.printf("%s	%d	%s%n", o.getMobileName(), o.getBatterySize(), o.getOsType());

	}
}
