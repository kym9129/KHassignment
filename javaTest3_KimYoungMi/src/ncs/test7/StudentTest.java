package ncs.test7;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
	
//	[문제 7] Human 이라는 부모 클래스를 상속받은 Student 클래스를 이용하여 프로그램을 작성한다. 
//	3개의 Student 객체를 생성하여 배열에 셋팅한 후 각 객체의 모든 정보를 출력한다.

	public static void main(String[] args) {
		Student[] students = new Student[3];
		// Student 객체를 3개 생성하여 배열에 넣는다.
		//배열에 있는 객체 정보를 모두toString()으로 출력 한다.–for문을 이용 할 것
		
		List<Student> sList = new ArrayList<>();
		sList.add(new Student("홍길순", 25, 171, 81, "201401", "영어영문학"));
		sList.add(new Student("한사랑", 23, 183, 72, "201402", "건축학"));
		sList.add(new Student("임꺽정", 26, 175, 65, "201403", "체육학"));

		for(int i = 0; i < sList.size(); i++) {
			System.out.printf("%s %d %d %d %s %s%n", sList.get(i).getName(), sList.get(i).getAge(), sList.get(i).getHeight(), sList.get(i).getWeight(), sList.get(i).getNumber(), sList.get(i).getMajor());
//			System.out.printf("%s !! \n", sList.get(i).getNumber());
		}
		
		
	}

}
