package com.oop.emp.model;

import java.util.Scanner;

public class Employee {
	
	/**
	 *     - 사원정보 관리용 클래스
    - Field 작성 : 캡슐화 반드시 적용함
    사번 : - empNo:int
    이름 : - empName:String
    소속부서 : - dept:String
    직급 : - job:String
    나이 : - age:int
    성별 : - gender:char
    급여 : - salary:int
    보너스포인트 : - bonusPoint:double
    핸드폰 : - phone:String
    주소 : - address:String
    
    Employee 클래스의 메소드 작성
1. 키보드입력용 메소드 : empInput()
2. emp객체 모든 필드 출력용 메소드 : empOutput()
3. getter/setter메소드

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

	 */

	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public void empInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사번 입력 (ex. 1234) : ");
		empNo = sc.nextInt();
		
		System.out.println("이름 입력 (ex. 홍길동) : ");
		empName = sc.next();
		
		System.out.println("소속부서 입력 (ex. 개발팀) : ");
		dept = sc.next();
		
		System.out.println("직급 입력 (ex. 사원) : ");
		job = sc.next();
		
		System.out.println("나이 입력 (ex. 29) : ");
		age = sc.nextInt();
		
		System.out.println("성별 입력 (ex. 남) : ");
		gender = sc.next().charAt(0);
		
		System.out.println("급여 입력 (ex. 2000000) : ");
		salary = sc.nextInt();
		
		System.out.println("보너스포인트 입력 (ex. 30.5) : ");
		bonusPoint = sc.nextDouble();
		
		System.out.println("핸드폰번호 입력 (ex. 010-1234-5678) : ");
		phone = sc.next();
		
		sc.nextLine(); // 개행문자 날리기
		
		System.out.println("주소 입력 (ex. 서울시 강남구) : ");
		address = sc.nextLine();
		
	}
	
	public void empOutput() {
		System.out.println("사번 = " + empNo);
		System.out.println("이름 = " + empName);
		System.out.println("소속부서 = " + dept);
		System.out.println("직급 = " + job);
		System.out.println("나이 = " + age);
		System.out.println("성별 = " + gender);
		System.out.println("급여 = " + salary);
		System.out.println("보너스포인트 = " + bonusPoint);
		System.out.println("핸드폰번호 = " + phone);
		System.out.println("주소 = " + address);
	}
	
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String dept() {
		return dept;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	public double getBonusPoint() {
		return bonusPoint;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}

	
}
