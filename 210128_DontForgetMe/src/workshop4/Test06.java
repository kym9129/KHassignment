package workshop4;

public class Test06 {

	public static void main(String[] args) {
		//args로 1~5의 정수 2개 받기.
		
		if(args.length != 2) {
			System.out.println("다시 입력 하세요");
		}
		
		int[] argsInt = new int[args.length];
		
		for(int i = 0; i < args.length; i++) {
			argsInt[i] = Integer.parseInt(args[i]); //인자를 int로 변경

			if(argsInt[i] <1 || argsInt[i] > 5) { //인자가 1~5사이값인지 확인
				System.out.println("숫지를 확인 하세요");
			}
		}
		
		//인자값만큼 2차원배열 생성
		int[][] arr = new int[argsInt[0]][argsInt[1]];
		
		//2차원배열에 값 넣기
		double sum = 0;
		double cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*5)+1;
				sum += arr[i][j];
				cnt++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.printf("sum=%.1f%navg=%.1f", sum, (sum/cnt));

	}

}
