package exception;

public class Account {
	
	String account;
	double balance;
	double interestRate;
	
	public Account(){
		super();
	}

	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		return balance * (interestRate/100);
	}
	
	public void deposit(double money) throws Exception {
		if(money < 0) {
			throw new Exception();
		}else {
			balance = balance + money;
			
		}
		
	}
	
	public void withdraw(double money) throws Exception {
		if(money < 0) {
			throw new Exception();
		}else if(money > balance) {
			throw new Exception();
		}else {
			balance = balance - money;
		}
		
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "계좌정보: " + account + " " + balance + " " + interestRate;
	}
	


}
