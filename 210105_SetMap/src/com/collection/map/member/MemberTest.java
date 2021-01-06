package com.collection.map.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MemberTest {
	//1. 다음 회원 정보를 Map<String, Member>에 저장후, 출력하세요.

	private Map<String, Member> map = new HashMap<>();
	public MemberTest() {
		map.put("honggd", new Member("honggd", "1234", "홍길동", 35, "01012341234"));
		map.put("sinsa", new Member("sinsa", "1234", "신사임당", 50, "01012341234"));
		map.put("leess", new Member("leess", "1234", "이순신", 43, "01012341234"));
		map.put("yooon", new Member("yooon", "1234", "윤봉길", 37, "01012341234"));
		map.put("jangbg", new Member("jangbg", "1234", "장보고", 29, "01012341234"));
	}
	
	public static void main(String[] args) {
		MemberTest m = new MemberTest();
//		m.test1();
//		m.test2();
//		m.test3();
		m.test4();
		
	}
	
	
	public void test1() {
		Member member;// = new Member();
		
		//map의 모든 member객체 정보 출력
		System.out.println("==================================================\n" + 
				"아이디\t비밀번호\t이름\t나이\t전화번호\n" + 
				"--------------------------------------------------");
		Iterator<Member> iter = map.values().iterator();
	
		while(iter.hasNext()) {
			member = iter.next();
		System.out.printf("%s \t %s \t %s %d %s\n", member.getUserId(), member.getUserPwd(), member.getUserName(), member.getAge(), member.getPhoneNumber());
		}
//		Collection<Member> members = map.values();
//		int i = 0;
//		while(i < map.size()) {
			
//			System.out.p;99-------------=9rintf("%s%t%s%t%s%d%s", member.getUserId(), member.getUserPwd(), member.getUserName(), member.getAge(), member.getPhoneNumber());
			
//		}
		System.out.println("--------------------------------------------------");
	}
	
	//2. Map에 저장된 회원중 인자로 전달한 아이디가 존재하는 여부를 검사하는 메소드를 생성하세요.
	public boolean isUserExist(String userId) {
		
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			if(key.equals(userId))
				return true;
		}
		
		return false;
	}
	
	
	public void test2() {
//		다음 두 아이디를 테스트하세요.
//		- jangbg : true 리턴
//		- sejong : false 리턴
		
	System.out.println(isUserExist("jangbg"));
	System.out.println(isUserExist("sejong"));
		
	}
	
	public void test3() {
//		3. yooon 아이디 조회후 해당객체를 다음과 같이 수정하세요.
//		@com.collection.map.member.MemberTest.test3
//
//		- 비밀번호 : 5678
//		- 이름 : 윤동주
//		- 나이 : 27
//		- 전화번호 : 01034563456
		
		Iterator<String> iter = map.keySet().iterator();
		Member m = null;
		while(iter.hasNext()) {
			String key = iter.next();
			if(key.equals("yooon")) {
				m = map.get(key);
				m.setUserPwd("5678");
				m.setUserName("윤동주");
				m.setAge(27);
				m.setPhoneNumber("01034563456");
			}

		}
		System.out.println("==================================================\n" + 
				"아이디\t비밀번호\t이름\t나이\t전화번호\n" + 
				"--------------------------------------------------");
		System.out.printf("%s \t %s \t %s %d %s\n", m.getUserId(), m.getUserPwd(), m.getUserName(), m.getAge(), m.getPhoneNumber());
		System.out.println("--------------------------------------------------");
	}
	
	public void test4() {
//		4. sinsa 아이디 회원을 삭제하세요.
//		@com.collection.map.member.MemberTest.test4
		
		map.remove("sinsa");
		
		System.out.println("==================================================\n" + 
				"아이디\t비밀번호\t이름\t나이\t전화번호\n" + 
				"--------------------------------------------------");
		for(String key : map.keySet()) {
			Member value = map.get(key);
			System.out.printf("%s \t %s \t %s %d %s\n", value.getUserId(), value.getUserPwd(), value.getUserName(), value.getAge(), value.getPhoneNumber());
		}
		System.out.println("--------------------------------------------------");
			
		
		
		
	}

}
