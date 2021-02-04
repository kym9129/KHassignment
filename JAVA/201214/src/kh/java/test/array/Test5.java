package kh.java.test.array;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 t5 = new Test5();
		t5.test();

	}
	
	public void test() {
	/**
	 * 주민등록번호 성별자리 이후부터 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 
    변경하세요
     
    힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - clone() 매소드 이용	
	 */
		
		//주민등록번호 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 13자리 입력 > ");
		String num = sc.nextLine();
		
		//번호를 char[]에 넣기
		char[] numArray = new char[num.length()];
		numArray = num.toCharArray();
		
		//배열 deep copy
		char[] numArray2 = numArray.clone();
		
		//출력
		for(int i = 0; i < numArray2.length; i++) {
			if(i > 6) {
				numArray2[i] = '*';
				}
				System.out.print(numArray2[i]);
			}
				
		
	}

}
