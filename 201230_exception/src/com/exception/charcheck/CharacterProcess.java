package com.exception.charcheck;

public class CharacterProcess {

	//전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
		//단, 공백문자가 있으면, CharCheckException 발생
	public int countAlpha(String s) throws CharCheckException{
		
		//char[]로 변경
		char[] chArr = s.toCharArray();
		
		//영문자가 몇개인지 카운트
		int cnt = 0;
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] >= 'a' && chArr[i] <= 'z' || chArr[i] >= 'A' && chArr[i] <= 'Z') 
				cnt++;
			
			else if(chArr[i] == ' ')
				throw new CharCheckException();
			}
		//카운트값 리턴
		return cnt;
		
		
	}
}
