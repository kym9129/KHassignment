package com.api.token;

import java.util.StringTokenizer;

public class TokenTest {
//	"J a v a P r o g r a m " 문자열 값을
//	공백 단위로 Token 처리하여 char [] 에 저장하여 출력하시오.
//	- 토큰 처리전 글자 출력
//	- 전 글자갯수 출력
//	- 토큰 처리 후 글자갯수 출력 확인
//	- char [] 값 출력
//	- char [] 을 다시 String 으로 바꾼 후 
//	- 모두 대문자로 변환하여 출력

	public static void main(String[] args) {
		String data = "J a v a P r o g r a m ";
		
		//- 토큰 처리전 글자 출력
		System.out.println("토큰 처리전 글자 출력 : " + data);
		
		//전 글자갯수 출력
		System.out.println("전 글자갯수 출력 : " + data.length());
		
		//토큰 처리 후 글자갯수 출력 확인
		StringTokenizer st = new StringTokenizer(data, " ");
		System.out.println("토큰 처리 후 글자갯수 출력 확인 : "
						+ st.countTokens());
		
		char[] chArr = new char[st.countTokens()];
		
		//공백 단위로 Token 처리하여 char [] 에 저장
		int i = 0;
		while(st.hasMoreTokens()) {
			chArr[i] += st.nextToken().charAt(0);
			i++;
		}
		//char [] 값 출력
		System.out.print("char [] 값 출력 : ");
		for(int j = 0; j < chArr.length; j++) {
//			System.out.println(j);
			System.out.print(chArr[j] + " ");
		}
		System.out.println(" ");
		//char [] 을 다시 String 으로 바꾼 후 
		String str = new String();
		for(int k = 0; k < chArr.length; k++) {
			str += chArr[k];
		}
		
		//모두 대문자로 변환하여 출력
		System.out.println("모두 대문자로 변환하여 출력 : " + str.toUpperCase());
		
		
	}

}
