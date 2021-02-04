package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

/**
 * * 실행용 클래스 : com.oop.emp.run.EmpTest 메뉴작성 : 메소드 작성 =>메뉴 화면의 예 public void
 * mainMenu(){} 사원 정보 관리 프로그램 ************ 1. 새 사원 정보 입력 => empInput() 메소드 실행 2.
 * 사원 정보 삭제 => 참조변수에 null대입할 것. 3. 사원정보 출력 => empOutput() 메소드 실행 9. 끝내기
 *****************************************
 * @author jin
 *
 */

public class EmpTest {

	public static void main(String[] args) {
		EmpTest empt1 = new EmpTest();
		empt1.mainMenu();

	}

	public void mainMenu() {

		Scanner sc = new Scanner(System.in);
		Employee e = null;

		while (true) {

			System.out.println("******* 사원 정보 관리 프로그램 ************\n" 
					+ "    1. 새 사원 정보 입력\n" 
					+ "    2. 사원 정보 삭제\n"
					+ "    3. 사원 정보 출력\n" 
					+ "    9. 끝내기\n" 
					+ "================================\n" 
					+ "번호 입력 : ");
			int user = sc.nextInt();

			// Employee e = new Employee();를 2단계로 나눴음.

			switch (user) {
			case 1:
				e = new Employee();
				e.empInput();
				break;
			case 2:
				e = null;
//				e.setEmpNo(0);
//				e.setEmpName(null);
//				e.setDept(null);
//				e.setJob(null);
//				e.setAge(0);
//				e.setGender(' ');
//				e.setSalary(0);
//				e.setBonusPoint(0);
//				e.setPhone(null);
//				e.setAddress(null);
				System.out.println("사원 정보를 삭제했습니다.");
				break;
			case 3:
				// 사원정보 미입력시 출력하지 않도록 함.
				if (e == null) {
					System.out.println(">>먼저 사원정보를 입력하세요.");
				}
				else {
					e.empOutput();
				}
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;

			}

		}

	}

}
