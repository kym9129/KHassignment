package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {
//	[문제 3] GregorianCalendar 클래스를 사용하여, 
//	현재 년도와 비교한 나이를 계산하고 생일의 요일을 출력 한다. 
//	출력시 SimpleDateFormat 을 사용하여 출력한다.

	public static void main(String[] args) {
		
		Calendar now = new GregorianCalendar();
		Calendar birth = new GregorianCalendar(1991, 1, 9);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일 E요일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 M월 dd일");
		
		int temp = 0; //생일이 안지났을 경우 -1
		if((now.get(Calendar.MONTH)) < (birth.get(Calendar.MONTH)))
			temp = -1;
			
		int age = (now.get(Calendar.YEAR) - birth.get(Calendar.YEAR)) + temp;
		
		
		System.out.println("생일 : " + sdf.format(birth.getTime()));
		System.out.println("현재 : " + sdf2.format(now.getTime()));
		System.out.println("나이 : " + age);
		

	}

}
