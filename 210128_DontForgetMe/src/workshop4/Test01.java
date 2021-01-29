package workshop4;

public class Test01 {

	public static void main(String[] args) {
		int[][] arr2 = {
				{5, 5}, //10
				{10, 10, 10, 10, 10}, //50
				{20, 20, 20}, //60 
				{30, 30, 30, 30} //120
		};
		
		int sum = 0;
		int cnt = 0;
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				sum += arr2[i][j];
				cnt++;
			}
		}
		System.out.printf("total=%d%naverage=%.1f", sum, ((double)sum/(double)cnt));

	}

}
