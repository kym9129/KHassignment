package kh.java.test.array;

public class Test1 {
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();
	}

	
	public void test() {
		/**
		 * 길이가 100인 배열을 선언하고 1부터 100까지의 값을 순서대로 배열 인덱스에 넣어 그 값을 출력하는 코드를 작성하시오.
   for문을 이용하는 방법을 한번씩 사용하여 작성하세요.

		 */
		
		//배열 초기화
		int[] arr = new int[100];
		
		
		//1~100값 넣고 출력.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
	}
	
}
