package com.collection.list.music.view;

import java.util.Scanner;

import com.collection.list.music.controller.MusicManager;
import com.collection.list.music.controller.MusicSingerAscending;
import com.collection.list.music.controller.MusicTitleAscending;
import com.collection.list.music.model.vo.Music;

public class MusicMenu {
	
	private MusicManager manager = new MusicManager();
	Scanner sc = new Scanner(System.in);
	

	public void mainMenu() {
		String menu = "================ Music Playlist Menu ================\r\n" + 
					"1.목록보기\r\n" + 
					"2.마지막에 음악추가\r\n" + 
					"3.맨처음에 음악추가\r\n" + 
					"4.곡삭제\r\n" + 
					"5.곡변경\r\n" + 
					"6.곡명검색\r\n" + 
					"7.가수검색\r\n" + 
					"8.목록정렬(곡명오름차순)\r\n" + 
					"0.종료\r\n" + 
					"================================================================\r\n" + 
					">> 메뉴선택 : "; 
		while(true) {
			System.out.println(menu);
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println(manager.selectList());
				break;
				
			case 2:
				System.out.println("곡명을 입력하세요. : ");
				String title2 = sc.nextLine();
				System.out.println("가수를 입력하세요. : ");
				String singer2 = sc.nextLine();
				
				manager.addList(new Music(title2, singer2));
				System.out.println(manager.selectList());
				break;
				
			case 3:
				System.out.println("곡명을 입력하세요. : ");
				String title3 = sc.nextLine();
				System.out.println("가수를 입력하세요. : ");
				String singer3 = sc.nextLine();
				
				manager.addAtZero(new Music(title3, singer3));
				System.out.println(manager.selectList());
				break;
				
			case 4:
				System.out.println("삭제할 제목을 입력하세요. : ");
				String title4 = sc.nextLine();
				System.out.println("삭제할 가수를 입력하세요. : ");
				String singer4 = sc.nextLine();
				
				if(manager.removeMusic(title4, singer4))
					System.out.println("삭제했습니다.");
				
				System.out.println(manager.selectList());
				break;
				
			case 5:
				System.out.println("교체할 제목을 입력하세요. : ");
				String oldMusicTitle = sc.nextLine();
				System.out.println("교체할 가수를 입력하세요. : ");
				String oldMusicSinger = sc.nextLine();
				Music oldMusic = new Music(oldMusicTitle, oldMusicSinger);
				
				System.out.println("새로운 제목을 입력하세요. : ");
				String newMusicTitle = sc.nextLine();
				System.out.println("새로운 가수를 입력하세요. : ");
				String newMusicSinger = sc.nextLine();
				Music newMusic = new Music(newMusicTitle, newMusicSinger);
				
				if(manager.replaceMusic(oldMusic, newMusic)) {
					System.out.println(manager.selectList());
				}
				break;
				
			case 6:
				System.out.println("검색할 제목 키워드를 입력하세요. : ");
				String searchTitle = sc.nextLine();
				
				if(manager.searchMusicByTitle(searchTitle).size() != 0)
					System.out.println(manager.searchMusicByTitle(searchTitle));
				
				else
					System.out.println("검색결과가 없습니다.");
					
				break;
				
			case 7: //왜 얘만 안되지?
				System.out.println("검색할 가수 키워드를 입력하세요. : ");
				String searchSinger = sc.nextLine();
				
				if(manager.searchMusicBySinger(searchSinger).size() != 0)	
					System.out.println(manager.searchMusicBySinger(searchSinger));
				
				else
					System.out.println("검색결과가 없습니다.");
				
				break;
				
			case 8:
				sortMenu();
				break;
			case 0:
				return;
			default :
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			
		}
		
				
	}
	
	public void sortMenu() {
		String menu = "================== 정렬 메뉴 ===================\r\n" + 
					"1. 가수명 오름차순\r\n" + 
					"2. 가수명 내림차순\r\n" + 
					"3. 곡명 오름차순\r\n" + 
					"4. 곡명 내림차순\r\n" + 
					"5. 메인메뉴 돌아가기\r\n" + 
					"================================================\r\n" + 
					">> 메뉴선택 : ";
		System.out.println(menu);
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
			case 1 :
				manager.orderByTitle(new MusicTitleAscending());
				System.out.println(manager.selectList());
				return;
				
			case 2 :
				manager.orderByTitleReversed(new MusicTitleAscending());
				return;
				
			case 3 :
				manager.orderBySinger(new MusicSingerAscending());
				return;
				
			case 4 :
				manager.orderBySingerReversed(new MusicSingerAscending());
				return;
				
			case 5 :
				return;
		
		}
	}
	
}
