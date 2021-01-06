package com.thread.alphabet;

public class LowerAlphabetThread implements Runnable {
	
	String alphabet;

	public LowerAlphabetThread(String alphabet) {
		super();
		this.alphabet = alphabet;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " = " + alphabet.toLowerCase());
		
	}

}
