package ncs.test10;

public class Secretary extends Employee implements Bonus {
	
	

	public Secretary() {
		super();
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		//salary의 10%
		return (double)super.getSalary() * 0.1;
	}

	@Override
	public void incentive(int pay) {
		//pay의 80%가 기존 salary에 더해진다.
		super.setSalary((int)(super.getSalary() + (pay*0.8)));
		
	}

}
