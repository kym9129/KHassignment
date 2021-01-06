package com.thread.sleep;

public class CustomThread implements Runnable {
	
	private String[] arr;
	
	
	public CustomThread(String[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public void run() {
//		- 좋아하는 속담, 경구 10개를 문자열배열에 담고, 3초마다 랜덤하게 출력하세요.
//		 - 10번 출력후 종료하세요.
		String name = Thread.currentThread().getName();
		int cnt = 0;
		while(cnt < 10) {
			int i = (int)(Math.random()*10);
			System.out.println(arr[i]);
			
			try {
				Thread.sleep(300);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cnt++;
		}
		//쓰레드 이름 가져오기
		System.out.println(name + "끝!");

	}

}
