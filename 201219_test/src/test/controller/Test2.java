package test.controller;

public class Test2 {
	//2단에서 5단까지의 구구단 결과 중 홀수인 것만 출력한다. 단, for문을 이용한다.

	public static void main(String[] args) {
		for(int i = 2; i <=5; i++) {
			for(int j = 1; j <= 9; j++) {
				if((i*j)%2 != 0)
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}

	}

}
