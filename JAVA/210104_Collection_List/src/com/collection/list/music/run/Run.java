package com.collection.list.music.run;

import java.util.Scanner;

import com.collection.list.music.view.MusicMenu;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new MusicMenu().mainMenu();
		System.out.println("프로그램을 종료합니다.");
	}

}
