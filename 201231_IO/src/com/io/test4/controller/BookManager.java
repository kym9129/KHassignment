package com.io.test4.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.io.test4.model.vo.Book;

public class BookManager {
	Scanner sc = new Scanner(System.in);
	
	public void fileSave() {
//		1. Book 객체 배열 선언, 5개 초기화함 //샘플데이터 임의 작성
		Calendar cal0 = new GregorianCalendar(2020, 11, 1);
		Calendar cal1 = new GregorianCalendar(2020, 9, 13);
		Calendar cal2 = new GregorianCalendar(2020, 10, 23);
		Calendar cal3 = new GregorianCalendar(2020, 10, 20);
		Calendar cal4 = new GregorianCalendar(2020, 6, 8);
		Book[] bookArr = new Book[5];
		bookArr[0] = new Book("공정하다는 착각", "마이클 센델", 16200, cal0, 10);
		bookArr[1] = new Book("트렌드 코리아 2021", "김난도 외 8명", 14800, cal1, 5.8);
		bookArr[2] = new Book("광고의 8원칙", "오두환", 13500, cal2, 2.7);
		bookArr[3] = new Book("돈의 미래", "짐 로저스", 17500, cal3, 10.5);
		bookArr[4] = new Book("달러구트 꿈 백화점", "이미예", 13800, cal4, 24.7);
		
//		2. "books.dat" 파일에 객체 기록 저장함
		File f = new File("books.dat");
		
//		3. try with resource 문 사용할 것 -> finally 안써도 됨
		try(ObjectOutputStream oos = new ObjectOutputStream(
									new BufferedOutputStream(
									new FileOutputStream(f)));
			){
			
			for(int i = 0; i < bookArr.length; i++) {
				oos.writeObject(bookArr[i]);
				
			}
			
//		4. "books.dat 에 저장 완료!" 출력
			System.out.println("books.dat에 저장 완료!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void fileRead() {
//		1. Book 객체 배열 선언 : 10개
		Book[] bookArr = new Book[10];
		
//		2. "books.dat" 파일에서 데이터 읽어서 배열에 저장함
		File f = new File("books.dat");
		
//		4. try with resource 문 사용할 것
		try(ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(f)));
		) {
//		3. 객체 정보를 화면에 출력함
			while(true) {
			System.out.println(ois.readObject());
			}
			
//		5. "books.dat 읽기 완료!" 출력
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("books.dat 읽기 완료!");
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
