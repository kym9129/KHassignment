package com.oop.method.nonstatic;

public class NonStaticSample {

	public static void main(String[] args) {
		NonStaticSample n = new NonStaticSample();
//		n.printLottoNumbers();
//		n.outputChar(3, 'C')
//		System.out.println(n.alphabet());
		System.out.println(n.mySubstring("01234", 2, 4));
	}

	// 1. 반환값 없고 매개변수 없는 메소드
	// 실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
	// 메소드명 : printLottoNumbers
	public void printLottoNumbers() {
		int[] lottoArr = new int[6];

		System.out.print("로또 번호 랜덤 생성 :");

		for (int i = 0; i < lottoArr.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			lottoArr[i] = num;
			
			//중복검사
			for(int j = 0; j < i; j++) {
				if(num == lottoArr[j]) {
					i--;
				}
			}
			
			System.out.print(" " + lottoArr[i]);
		}

	}

	// 2. 반환값 없고 매개변수 있는 메소드
	// 실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
	// 메소드명 : outputChar
	public void outputChar(int n, char ch) {
		for (int i = 0; i < n; i++) {
			System.out.println(ch);
		}

	}

	// 3. 반환값 있고 매개변수 없는 메소드
	// 실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
	// 메소드명 : alphabet
	public char alphabet() {
		// 65~90, 97~122
		int num = 0;
		while(!(num >= 65 && num <= 90 || num >=97 && num <=122)) {
			num = (int)(Math.random()*122);
		}

		return (char)num;
		
	}

	// 4. 반환값 있고 매개변수 있는 메소드
	// 실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
	// 추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
	// 메소드명 : mySubstring
	public String mySubstring(String str, int startIdx, int endIdx) {
		//ex. str = "abcdefghkj";
		//ex. startIdx = 2;
		//ex. endIdx = 4;
		String strResult = new String();
		
		//startIdx ~ endIdx 범위의 문자열 추출
		char[] chArr = str.toCharArray(); // 0 1 2 3 4
		for(int i = startIdx; i <= endIdx; i++) {
				strResult += String.valueOf(chArr[i]);
//				if(str == null) {
//					strResult = null;
//				}
				//단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리->이게 어떻게 되지?
				//매개변수 str을 null로 넣으면 nullPointException에러나는뎅...
		}
		
		return strResult;
	}
	

}
