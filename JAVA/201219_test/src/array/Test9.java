package array;

public class Test9 {
	//2차원 배열에 들어있는 데이터 중 가장 큰 값과 가장 작은 값을 구한다.
	
	//못풀었자너 ㅜㅜ

	public static void main(String[] args) {
		int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		
		int biggest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
	
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {

				if(array[i][j] > biggest) {
					biggest = array[i][j];
				}
				//작은값 찾기
				if(array[i][j] < smallest) {
					smallest = array[i][j];
				}
			}
		}
		
		
		System.out.println("가장 큰 값 : " + biggest);
		System.out.println("가장 작은 값 : " + smallest);
		
	}


}
