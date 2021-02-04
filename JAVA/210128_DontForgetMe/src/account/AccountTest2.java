package account;

public class AccountTest2 {

	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		
		for(int i = 0; i < accounts.length; i++) {
			String str = "221-0101-211";
			StringBuilder sb = new StringBuilder();
			sb.append(str);
			sb.append(i+1);
			accounts[i] = new Account(sb.toString(), 100000, 4.5);
			accounts[i].accountInfo(); //개행 없음
			System.out.println(); //개행용으로 추가
		}
		System.out.println();
		//for문을 이용하여 모든 Account 객체의 이자율을 3.7% 변경 하고 
		//이자를 화면에 출력 한다.
		for(int i = 0; i < accounts.length; i++) {
			accounts[i].setInterestRate(3.7);
			accounts[i].accountInfo();
			System.out.println(" 이자: " + (int)accounts[i].calculateInterest() + "원");
		}

	}

}
