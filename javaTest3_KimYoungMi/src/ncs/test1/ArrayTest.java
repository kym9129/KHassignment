package ncs.test1;

public class ArrayTest {
	//[문제 1] 2차원 배열에 들어 있는 데이터들의 합계와 평균을 구한다.

	public static void main(String[] args) {
		
		
		int[][] array = {{12, 41, 36, 56, 21}, 
						{82, 10, 12, 61, 45}, 
						{14, 16, 18, 78, 65}, 
						{45, 26, 72, 23, 34}};
				
		double sum = 0.0;
		double avrg = 0.0;
		int arrLen = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += (double)array[i][j];
				arrLen++;
			}
		}
		
		avrg = sum / arrLen;
		System.out.printf("합계 : %.2f%n평균 : %.2f", sum, avrg);
		
	}

}
