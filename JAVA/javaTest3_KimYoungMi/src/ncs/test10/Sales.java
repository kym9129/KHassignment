package ncs.test10;

public class Sales extends Employee implements Bonus {

	public Sales() {
		super();
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		//salary에 13% 적용
		return (double)super.getSalary() * 0.13;
	}


	@Override
	public void incentive(int pay) {
		//pay의 120%가 기존 salary에 더해진다.
		super.setSalary((int)(pay * 1.2) + super.getSalary());
		
	}
	
	

}
