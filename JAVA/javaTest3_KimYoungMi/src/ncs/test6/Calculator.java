package ncs.test6;

//[문제 6] 2부터 5까지의 정수형 데이터만을 키보드로 입력 받아 
//1부터 입력 받은 수까지의 합을 출력 한다. 
//단, 입력 받은 수가 2부터 5까지의 범위를 벋어나면 
//“입력 값에 오류가 있습니다.”라고 출력 하고 프로그램을 종료한다.

public class Calculator {
	
	public double getSum(int data) throws InvalidException {
//		1부터 data까지의 합을 계산 
//		data가 2부터 5까지의 범위를 벗어나면 InvalidException 발생 시킨 다.
		double sum = 0;
		for(int i = 1; i <= data; i++) {
			if(data < 2 || data > 5) {
				throw new InvalidException("입력 값에 오류가 있습니다.");
			}
			sum += i;
		}
		
		return sum;
	}

}
