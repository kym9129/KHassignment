package company;

public class Company {
	
	double salary;
	double annualIncome;
	double bonus;
	double afterTaxBonus;
	
	public Company() {
		super();
	}
	public Company(double salary) {
		super();
		this.salary = salary;
	}
	
	public double getIncome() {
		return salary * 12;
	}
	
	public double getAfterTaxIncome() {
		return getIncome() - (getIncome() * 0.1);
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public double getBonus() {
		return (salary * 0.2) * 4;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getAfterTaxBonus() {
		return getBonus() - (getBonus() * 0.055);
	}
	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
	

}
