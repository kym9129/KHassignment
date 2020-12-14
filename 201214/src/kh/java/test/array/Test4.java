package kh.java.test.array;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 t4 = new Test4();
//		t4.test();
		t4.test2();

	}
	
	public void test() {
		/**
		 *     사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
     
        힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - clone() 매소드 이용
       */
		
		//전화번호 읿력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 11자리를 입력하세요. ");
		String num = sc.nextLine();
		
		//11자리 문자형 배열에 저장하기
		char[] numArr = new char[11];
		numArr = num.toCharArray();
		
		
		//배열 deep copy
		char[] numArr2 = numArr.clone();
		
		//가운데 4자리를 *로 가리기
		for(int i = 0; i < numArr2.length; i++) {
			if(i >= 3 && i <= 6) {
				numArr2[i] = '*';
			}
			System.out.print(numArr2[i]);
		}
		
		
	}

	public void test2() {
		/*
- 메소드명 : public void test2()
    위문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
		 * java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼것!
		 * 문자열은 직접 수정이 불가하므로, 특정자리의 문자열을 가져와 처리해야한다.

		 */
		
		//전화번호 읿력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 11자리를 입력하세요. ");
		String num = sc.nextLine();
		
		//11자리 문자형 배열에 저장하기
		char[] numArr = new char[11];
		numArr = num.toCharArray();
		
		//가운데 번호 substring으로 추출
		String numSubstring = num.substring(3, 7);
		char[] numMidArr = numSubstring.toCharArray();
		
		//가운데 번호 *넣기
		for(int i = 0; i<numMidArr.length; i++) {
			numMidArr[i] = '*';
		}
		
		//출력
		for(int i = 0; i < numArr.length; i++) {
			if(i >= 3 && i <= 6) {
				numArr[i] = numMidArr[i-3];
			}
			System.out.print(numArr[i]);
		}
				

		
	}
	
}
