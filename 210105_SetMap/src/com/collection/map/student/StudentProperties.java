package com.collection.map.student;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

public class StudentProperties {

	public static void main(String[] args) {
		StudentProperties sp = new StudentProperties();
		sp.printConsole(sp.readFile());
		sp.saveXMLFile(sp.readFile());

	}
	
	public List<Student> readFile(){
//		List<Student>타입 리턴
		
//		1. Properties 객체 생성하고, score.txt 파일의 내용을 읽어
		Properties prop = new Properties();
		
//		2. 리스트 만듦
		List<Student> stdList = new ArrayList<>();
		
		try {
			prop.load(new FileReader("score.txt"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String key = null;
		String value = null;
		
		Enumeration<?> en = prop.propertyNames();
		while(en.hasMoreElements()) {
			key = (String) en.nextElement();
			value = prop.getProperty(key);
//			System.out.println(key + " = [" + value + "]");
			
			//		3. 키를 사용하여, 객체정보를 List<Student>에 저장하여 리턴함
			//		  => ", " 으로 문자열 분리처리
			StringTokenizer st = new StringTokenizer(value, ",");
			while(st.hasMoreTokens()) {
				
//				  => 분리된 문자열을 각 자료형 필드의 값으로 형변환 대입 저장함
				stdList.add(new Student(Integer.parseInt(st.nextToken()),
						st.nextToken(), 
						Integer.parseInt(st.nextToken()),
						Integer.parseInt(st.nextToken()), 
						Integer.parseInt(st.nextToken())
						));
			}
		}
//		for(Student s : stdList)
//			System.out.println(s);
		
		return stdList;
	}
	
	
	public void printConsole(List<Student> stdList) {
//		1. 전달받은 값 출력
		for(Student s : stdList)
			System.out.println(s);
	
		
//		2. 각 객체의 국어합계, 영어합계, 수학합계를 구하고
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		for(Student s : stdList) {
			korSum += s.getKor();
			engSum += s.getEng();
			mathSum += s.getMath();
		}
		System.out.println("engSum = " + engSum);
		
//		3. 과목별 평균점수를 출력함
		
		double korAvg = 0;
		double engAvg = 0;
		double mathAvg = 0;
		
		for(Student s : stdList) {
			korAvg = (double)(korSum/(stdList.size()));
			engAvg = (double)(engSum/(stdList.size()));
			mathAvg = (double)(mathSum/(stdList.size()));
		}
		System.out.println("국어 평균 = " + korAvg);
		System.out.println("영어 평균 = " + engAvg);
		System.out.println("수학 평균 = " + mathAvg);

		
	}
	
	public void saveXMLFile(List<Student> stdList) {
//		1. "student.xml" 파일에 번호필드를 key로 객체가 가진 값 기록 저장함.
		
		Properties prop = new Properties();
		
//		prop.setProperty(key, value)
		Iterator<Student> iter = stdList.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			String key = Integer.toString(s.getSno());
			prop.setProperty(key, s.toString());
			
		}
		
		try {
			prop.storeToXML(new FileOutputStream("student.xml"), "student.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
