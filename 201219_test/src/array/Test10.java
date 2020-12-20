package array;

public class Test10 {
	//2차원 배열에 들어있는 데이터들 중 3의 배수만 골라내서 새로운 1차원 배열에 기록하고 출력한다.
	//단 중복값은 하나만 기록되게 한다.
	
	//못풀었자너 ㅜㅜ

	public static void main(String[] args) {
		int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int i = 0;
		int j = 0;
		int k = 0;
		int[] copyAr = new int[(array.length*array[i].length)];
		
		for(i = 0; i < array.length; i++) {
			for(j = 0; j < array[i].length; j++) {
				//3의배수만 골라내기
				if(array[i][j] %3 == 0) {
					//중복값 체크
					boolean isContain = false;
					for(int n = 0; n < k; n++) {
						if(copyAr[n] == array[i][j]) {
							isContain = true;
							break;
						}
					}
					//새로운 1차원배열에 기록
					if(!isContain) {
					copyAr[k] = array[i][j];
					k++;
					}
				}

			}
		}
		System.out.print("copyAr :");
		
		
		for(int t = 0; t < k; t++) {
				System.out.print(" " + copyAr[t]);

		}
		
	}

}
