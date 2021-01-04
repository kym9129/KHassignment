package com.collection.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.collection.list.music.model.vo.Music;

public class MusicManager {
	private List<Music> mList = new ArrayList<>();
	
	{
		mList.add(new Music("Dynamite", "BTS"));
		mList.add(new Music("VVS", "미란이"));
		mList.add(new Music("밤하늘의 별을", "경서"));
		mList.add(new Music("잠이 오질 않네요", "장범준"));
		mList.add(new Music("LoveSick", "BLACKPINK"));
	}
	
	Scanner sc = new Scanner(System.in);
	
//	~sc:Scanner
//	-mList:ArrayList<Music> => 초기화블럭을 사용하여 5곡을 미리 만들어두기
//
//	구현할 메소드는 다음과 같다.
//	--------------------------------------------------------------------
//	1. 음악리스트 리턴
//	+ selectList():List<Music>
	public List<Music> selectList(){
		
		return this.mList;
	}
//
//	2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드. 
//	+ addList(Music) : void
	public void addList(Music music) {
		
		mList.add(music);
		
	}
//
//	3. 맨처음에 음악추가 : 리스트 최상위(0번지)에 음악을 추가하는 메소드
//	+ addAtZero(Music) : void
	public void addAtZero(Music music) {
		
		mList.add(0, music);
		
	}
//
//	4. 특정곡을 삭제하는 메소드(제목을 전달받아 검색후, 최초로 검색된 음악을 삭제)
//		삭제여부를 리턴
//	+ removeMusic(String) : boolean
	public boolean removeMusic(String title, String singer) {
		return mList.remove(new Music(title, singer));
	}
//
//	5. 특정곡을 바꾸는 메소드(이전 음악객체, 새 음악객체를 전달해서 교체)
//		교체 성공여부를 리턴
//	+ boolean replaceMusic(Music oldMusic, Music newMusic) : boolean
	public boolean replaceMusic(Music oldMusic, Music newMusic) {
		int idx = mList.indexOf(oldMusic);
		boolean isReplaceable = false;
		if(idx >=0) {
			mList.set(idx, newMusic);
			isReplaceable = true;
		}
		return isReplaceable;
	}
//
//	6. 특정곡이 있는지 검사하는 메소드 : 복수개의 결과가 나올수 있음. 
//	(곡명일부로 검색해서 해당곡이 있다면, 곡정보(제목/가수)를 출력하고, 없다면, "검색결과가 없습니다"출력)
//	+ searchMusicByTitle(String title) : List<Music>
	public List<Music> searchMusicByTitle(String title){
		List<Music> resultList = new ArrayList<>();
		
		//mList 안에 있는 Music을 모두 검사하고 그중에 해당 되는 뮤직m을 추가
		for(Music m : mList) {
			if(m.getTitle().contains(title)) {
				resultList.add(m);
			}
		}
		return resultList;
	}
//
	//6번이랑 똑같이 했는데 얘는 왜 안되지????
//	7. 가수명으로 검색 메소드 : 복수개의 결과가 나올수 있음.
//	+ searchMusicBySinger(String singer) : List<Music>
	public List<Music> searchMusicBySinger(String singer){
		List<Music> resultList = new ArrayList<>();
		
		for(Music m : mList) {
			if(m.getSinger().contains(singer)) {
				resultList.add(m);
			}
		}
		return resultList;
	}
//
//	8. 서브메뉴 - 각 정렬 메소드 : Comparable/Comparator 인터페이스를 적절히 활용할 것
//	+ orderBy(Comparator<Music> c) : List<Musice>
	//가수명 오름차순
	public List<Music> orderByTitle(Comparator<Music> c){
		Comparator<Music> comp = new MusicTitleAscending();
		Collections.sort(mList,comp);
		
		return mList;
	}
	
	//가수명 내림차순
	public List<Music> orderByTitleReversed(Comparator<Music> c){
		Comparator<Music> comp = new MusicTitleAscending().reversed();
		Collections.sort(mList,comp);
		
		return mList;
	}
	
	public List<Music> orderBySinger(Comparator<Music> c){
		Comparator<Music> comp = new MusicSingerAscending();
		Collections.sort(mList,comp);
		
		return mList;
	}
	
	public List<Music> orderBySingerReversed(Comparator<Music> c){
		Comparator<Music> comp = new MusicSingerAscending().reversed();
		Collections.sort(mList,comp);
		
		return mList;
	}

}
