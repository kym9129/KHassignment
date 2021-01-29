package workshop4;

public class Calc {
	
	public int calculate(int data) {
		
		int sum = 0;
		System.out.print("짝수 : ");
		
		for(int i = 1; i <=data; i++) {
			
			//짝수일 경우
			if(i % 2 == 0) {
				sum += i; //합계 구하기
				System.out.print(i + " "); //짝수만 출력
			}
		}
		
		return sum; //짝수 합계 리턴
	}

}
