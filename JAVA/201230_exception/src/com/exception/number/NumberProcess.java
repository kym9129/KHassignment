package com.exception.number;

public class NumberProcess {
	
//	메소드
//	// 임의의 정수 두개를 전달받아, 첫번째 수가 두번째수의 배수인지 확인하고
//	배수가 맞으면 true 를 리턴하고, 아니면 false를 리턴함
//	에러메시지 : "1부터 100사이의 값이 아닙니다."
	public boolean checkDouble(int a, int b) throws NumberRangeException{
		
		//첫번째 수가 2번째수의 배수인지 확인
		if((a % b) == 0) {
			return true;
		}
//	//단, 전달된 첫번째와 두번째 수가 1~100사이의 값이 아니면
//	NumberRangeException 발생시킴
		else if(a < 1 || a > 100 && b < 1 || b > 100) {
			throw new NumberRangeException();
		}
		
		else {
			return false;
			}
		


	}
}
