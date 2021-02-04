package com.collection.list.music.controller;

import java.util.Comparator;

import com.collection.list.music.model.vo.Music;

public class MusicSingerAscending implements Comparator<Music> {
	
	//가수 오름차순
	public int compare(Music m1, Music m2) {
		// TODO Auto-generated method stub
		return  m1.getSinger().compareTo(m2.getSinger());
	}

}
