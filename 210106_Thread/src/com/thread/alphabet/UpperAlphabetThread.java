package com.thread.alphabet;

public class UpperAlphabetThread implements Runnable {
	
	String alphabet;

	public UpperAlphabetThread(String alphabet) {
		super();
		this.alphabet = alphabet;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " = " + alphabet.toUpperCase());
		
		
		
	}

}
