package test.controller;

public class Test3 {
	//1부터 100까지의 모든 정수들의 합과 평균을 구하는 프로그램을 작성한다.
	//단, while문이나 do while문을 이용하여 작성한다.
	
	//while문을 안써서 틀렸지 뭐야

	public static void main(String[] args) {
		double sum = 0.0;
		double avrg = 0.0;
		
//		for(int i = 1; i <=100; i++) {
//			sum += i;
//		}
		int i = 1;
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		avrg = sum/100;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avrg);

	}

}
