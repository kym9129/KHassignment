package exception;

public class AccountTest {

	public static void main(String[] args) {
		
		Account a = new Account("441-0290-1203", 500000, 7.3);
		System.out.println(a);
		try {
			a.deposit(-10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("입금 금액이 0보다 적습니다.");
		}
		try {
			a.withdraw(600000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}
		System.out.println("이자: " + a.calculateInterest());

	}

}
