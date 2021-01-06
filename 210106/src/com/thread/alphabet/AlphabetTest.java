package com.thread.alphabet;

public class AlphabetTest {
//	- 실행용 클래스 : com.thread.alphabet.AlphabetTest.java
//	- 쓰레드 클래스 : com.thread.alphabet.UpperAlphbetThread.java
//	               com.thread.alphabet.LowerAlphbetThread.java  
//	두개의 멀티쓰레드를 만들고, 각각 알파벳대문자, 알파벳 소문자를 출력하세요.
	
	public static void main(String[] args) {
		String alphabet = "abcDeFGHKjkLMnopQRstuVWXyz";
		
		Runnable run1 = new UpperAlphabetThread(alphabet);
		Runnable run2 = new LowerAlphabetThread(alphabet);
		
		Thread th1 = new Thread(run1);
		Thread th2 = new Thread(run2);
		
		th1.setName("UpperAlphabet");
		th2.setName("LowerAlphabet");
		
		th1.start();
		th2.start();
	}

}
