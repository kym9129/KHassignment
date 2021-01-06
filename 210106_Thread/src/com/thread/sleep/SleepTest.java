package com.thread.sleep;

public class SleepTest {
	
	public static void main(String[] args) {
		SleepTest s = new SleepTest();
		s.sendAphorism();
	}
	
	
	public void sendAphorism() {
//		- 좋아하는 속담, 경구 10개를 문자열배열에 담고, 3초마다 랜덤하게 출력하세요.
//		 - 10번 출력후 종료하세요.
		
		String[] arr = {"소 잃고 외양간 고친다.",
						"가는 날이 장날이다.",
						"등잔 밑이 어둡다.",
						"마른 하늘에 날벼락",
						"자라 보고 놀란 가슴 솥뚜껑 보고 놀란다.",
						"새발의 피",
						"소문난 잔치에 먹을 것 없다.",
						"세 살 버릇 여든까지 간다.", 
						"바늘 도둑이 소 도둑 된다.",
						"밑 빠진 독에 물 붓기"};	
		
		Runnable runnable = new CustomThread(arr);
		Thread th = new Thread(runnable);
		
		th.start();
		
		
		
	}

}
