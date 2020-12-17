package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

/**
 * * 실행용 클래스 : com.oop.emp.run.EmpTest
메뉴작성 : 메소드 작성
=>메뉴 화면의 예
public void mainMenu(){}
******* 사원 정보 관리 프로그램 ************
    1. 새 사원 정보 입력  => empInput() 메소드 실행
    2. 사원 정보 삭제 => 참조변수에 null대입할  것.
    3. 사원정보 출력 =>  empOutput() 메소드 실행
    9. 끝내기
*****************************************
 * @author jin
 *
 */

public class EmpTest {
	
	Employee emp = new Employee();
	
	public static void main(String[] args) {
		EmpTest empt1 = new EmpTest();
		empt1.mainMenu();
		
	}
	
	public void mainMenu() {
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("******* 사원 정보 관리 프로그램 ************\n"
					+ "    1. 새 사원 정보 입력\n"
					+ "    2. 사원 정보 삭제\n"
					+ "    3. 사원 정보 출력\n"
					+ "    9. 끝내기\n"
					+ "================================\n"
					+ "번호 입력 : ");
			int user = sc.nextInt();
			
			
			switch(user) {
			case 1 : emp.empInput(); break;
			case 2 : 
				emp.setEmpNo(0);
				emp.setEmpName(null);
				emp.setDept(null);
				emp.setJob(null);
				emp.setAge(0);
				emp.setGender(' ');
				emp.setSalary(0);
				emp.setBonusPoint(0);
				emp.setPhone(null);
				emp.setAddress(null);
				System.out.println("사원 정보를 삭제했습니다.");
				break;
			case 3 : emp.empOutput();break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				return;
				
			}
			
		}
		
		

		
		
	}

}
