package com.oop.method.static_;

public class StaticMethod {
	
//static method
//1. 전달한 문자열을 모두 대문자로 바꾸는 static 메소드
//메소드명 : toUpper(String) : String
	public static String toUpper(String str) {
		String strResult = new String();
		//ex. str = "hello";
	
		//str -> char[]
		char[] chArr = str.toCharArray();
		
//		for(int i = 0; i < chArr.length; i++) {
//			if(chArr[i] >= 97 && chArr[i] < 123) {
//				chArr[i] =(char) (chArr[i] - 32);
//				
//			}
//		}
//		return String.copyValueOf(chArr);
//	
		//ex. chArr = {'h', 'e', 'l', 'l', 'o'};
		// 104, 101, 108, 108, 111
		//t0 72, 69, 76, 76, 79
		
		//만약 소문자가 있다면 대문자로 변경
		//a -> A
		//97 -> 65
		//98 -> 66
		//....
		//122 -> 90
		int small = 0; // 97 ~ 122
		int big = 0; // 65 ~ 90
		
		
		for(int i = 0; i < chArr.length; i++) {
			switch(chArr[i]) {
			//코드리뷰1
//			for(small = 97; small <=122; small++) {
//				for(big = 65; big <= 90; big++) {
//					chArr[i] = (char)big;
//					strResult += chArr[i];
//					
//				}
//			}
			
			//나의 삽질
			case 97 : chArr[i] = 65; strResult += chArr[i]; break;
			case 98 : chArr[i] = 66; strResult += chArr[i]; break;
			case 99 : chArr[i] = 67; strResult += chArr[i]; break;
			case 100 : chArr[i] = 68; strResult += chArr[i]; break;
			case 101 : chArr[i] = 69; strResult += chArr[i]; break;
			case 102 : chArr[i] = 70; strResult += chArr[i]; break;
			case 103 : chArr[i] = 71; strResult += chArr[i]; break;
			case 104 : chArr[i] = 72; strResult += chArr[i]; break;
			case 105 : chArr[i] = 73; strResult += chArr[i]; break;
			case 106 : chArr[i] = 74; strResult += chArr[i]; break;
			case 107 : chArr[i] = 75; strResult += chArr[i]; break;
			case 108 : chArr[i] = 76; strResult += chArr[i]; break;
			case 109 : chArr[i] = 77; strResult += chArr[i]; break;
			case 110 : chArr[i] = 78; strResult += chArr[i]; break;
			case 111 : chArr[i] = 79; strResult += chArr[i]; break;
			case 112 : chArr[i] = 80; strResult += chArr[i]; break;
			case 113 : chArr[i] = 81; strResult += chArr[i]; break;
			case 114 : chArr[i] = 82; strResult += chArr[i]; break;
			case 115 : chArr[i] = 83; strResult += chArr[i]; break;
			case 116 : chArr[i] = 84; strResult += chArr[i]; break;
			case 117 : chArr[i] = 85; strResult += chArr[i]; break;
			case 118 : chArr[i] = 86; strResult += chArr[i]; break;
			case 119 : chArr[i] = 87; strResult += chArr[i]; break;
			case 120 : chArr[i] = 88; strResult += chArr[i]; break;
			case 121 : chArr[i] = 89; strResult += chArr[i]; break;
			case 122 : chArr[i] = 90; strResult += chArr[i]; break;
			}
		}
	
		//나의 삽질2
//		int i = 0;
//		int j = 0;
//		for(i = 0; i < chArr.length; i++) {
//			//if(chArr[i] 소문자 97 ~ 122)
//			if(chArr[i] >= 97 && chArr[i] <= 122) {
////				for(j = 65; j <=90; j++) {
////					strResult += chArr[i]= (char)j;
////				}
//			}
//		}
		
		return strResult;
		
		//코드리뷰2 : 이런 세상 쉬운 방법이 있었음...
//		return str.toUpperCase();
	}
	
	
//2. 첫번째 문자열의 전달받은 인덱스의 문자를 전달받은 문자로 변경하는 static 메소드
//메소드명 : setChar(String, int, char)
	public static void setChar(String str, int idx, char ch) {
		//ex. "hello", 2, 'L' -> 결과: "heLlo"
		String strResult = new String();
		
		//string -> char[]
		char[] chArr = str.toCharArray();
		//ex. chArr = {'h', 'e', 'l', 'l', 'o'};
		
		for(int i = 0; i < chArr.length; i++) {
			if(i == idx) {
				chArr[idx] = ch;
			}
			//chArr[] -> String
			strResult += chArr[i];
		}
		
		
		//출력
		System.out.println("문자 교체 결과 = " + strResult);
	}
	
//3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
//메소드명 : getAlphabetLength(String) : int
	public static int getAlphabetLength(String str) {
		//ex. str = "hello!!"
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				cnt++;
			}
		}
		return cnt; 
	}
	
	
//4. 전달한 문자열값을 하나로 합쳐서 리턴 
//메소드명 : concat(String, String) : String
	public static String concat(String str1, String str2) {
		
		
		return str1 + str2;
	}
	
	
	
	
}



















