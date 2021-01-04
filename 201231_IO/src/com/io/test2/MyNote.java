package com.io.test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyNote {

	Scanner sc = new Scanner(System.in);

	public void fileSave() {

		String data = new String();
		StringBuilder dataSB = new StringBuilder(data);

//		3. "exit" 입력되면 반복 종료함
		while (!(data.equals("exit"))) {

//		1. "파일에 저장할 내용을 입력하시오"  출력
			System.out.println("파일에 저장할 내용을 입력하시오");
			data = sc.nextLine();
//		2. StringBuilder 를 사용하여 문자열을 반복해서 입력받아 추가함
			dataSB.append(data);
		}
//		System.out.println("data = " + data);
//		System.out.println("dataSB = " + dataSB);

//		4. "저장하시겠습니까? (y/n) : " 출력
		System.out.println("저장하시겠습니까? (y/n) : ");
		String yn = sc.nextLine();

//		5. 입력값이 대소문자 상관없이 'Y' 이면, "저장할 파일명 : " 출력
		if (yn.equals("y") || yn.equals("Y"))
			System.out.println("저장할 파일명 : ");
//		6. 파일명 입력받아, 해당 파일에 출력 기록함.
		String fileName = sc.nextLine();
		StringBuilder fileNameSB = new StringBuilder(fileName);
		fileNameSB.append(".txt");
//		System.out.println("dest/fileNameSB = " + fileNameSB);

		File dest = new File(fileNameSB.toString()); // 파일이 저장될 위치
		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter(dest));

			bw.write(dataSB.toString() + "\n");
//			
//		7. "oooo.txt 파일에 성공적으로 저장하였습니다." 출력
			System.out.println(fileNameSB + "파일에 성공적으로 저장하였습니다.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

////		8. 스트림 반납하고 리턴함
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void fileOpen() {
//		1. "열기할 파일명 : " 출력하고, 파일명 입력받음
		System.out.println("열기할 파일명 : ");
		String fileName = sc.nextLine();
		StringBuilder fileNameSB = new StringBuilder(fileName);
		fileNameSB.append(".txt");

//		2. 파일 입력 스트림 생성
		File f = new File(fileNameSB.toString());
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));

//		3. 파일의 내용을 한 줄씩 읽어서 화면에 출력함
			String data = null;
			System.out.println(fileNameSB + " 내용 : ");
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void fileAppend() {
//		1. "수정할 파일명 : " 출력하고, 파일명 입력받음
		System.out.println("수정할 파일명 : ");
		String fileName = sc.nextLine();
		StringBuilder fileNameSB = new StringBuilder(fileName);
		fileNameSB.append(".txt");
//		System.out.println("fileNameSB = " + fileNameSB);

//		2. 파일 입력 스트림 생성
//		File f = new File("note1.txt");// 읽을 파일
		File f = new File(fileNameSB.toString());// 읽을 파일
		BufferedReader br = null;

//		3. 파일 출력 스트림 생성 : 단, 기존 내용 둔 상태로 생성할 것
		File dest = new File("edit/" + fileNameSB.toString());
		BufferedWriter bw = null;

//		4. 파일의 내용을 읽어서 화면출력.
		try {
			br = new BufferedReader(new FileReader(f));
			bw = new BufferedWriter(new FileWriter(dest));
			String data = null;
			StringBuilder addDataSB = new StringBuilder();

			while ((data = br.readLine()) != null) {
				System.out.println(data + "\n");
				addDataSB.append(data);
			}

//		5. "파일에 추가할 내용을 입력하시오." 출력하고, 추가할 내용을 StringBuilder에 저장하기.
//		7. "exit" 입력하면 반복 종료함
			String addData = new String();
			
			//eeeee!!!!!!!!!!!!!!!*******
//			StringBuilder addDataSB = new StringBuilder(data);
			while (!(addData.equals("exit"))) {
				System.out.println("파일에 추가할 내용을 입력하시오.");
				addData = sc.nextLine();
				addDataSB.append(addData);

			}

//		8. "저장하시겠습니까? (y/n) : " 출력
//		9. 입력값이 대소문자 상관없이 'Y' 이면, 해당 파일에 출력 기록함.
			System.out.println("저장하시겠습니까? (y/n) : ");
			String yn = sc.nextLine();
			if (yn.equals("y") || yn.equals("y")) {
				bw.write(addDataSB.toString());
//				bw.write(addDataSB.toString());
			}
//		10. "ooo.txt 파일의 내용이 변경되었습니다." 출력
			System.out.println(fileNameSB + " 파일의 내용이 변경되었습니다.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

//		11. 스트림 반납하고 리턴함
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
