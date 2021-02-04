package ncs.test2;

import java.util.StringTokenizer;

public class StringTest {
	
//	[문제 2] 주어진 String 데이터를 “,”로 나누어 5개의 실수 데이터들을 꺼내어 합과 평균을 구한다. 
//	단, String 문자열의 모든 실수 데이터를 배열로 만들어 계산한다.

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34"; 
		double data[]= new double[5];
		double sum = 0.0;
		int cnt = 0;
		double avrg = 0.0;
		
		// str에서 데이터를 분리한다. 
		String[] arr = str.split(",");
		
//		for(){ //for~each 문 사용한다. 
		for(String s : arr) {
//			// 배열에 실수 데이터를 넣는다.
			data[cnt] = Double.parseDouble(s);
//			//배열 데이터의 합을 구한다.
			sum += data[cnt];
			cnt++;
		}
		avrg = sum / cnt;
		// 결과 값을 출력 한다.
		System.out.printf("합계 : %.3f%n평균 : %.3f", sum, avrg);

		
		
		
//		}
		 

	}

}
