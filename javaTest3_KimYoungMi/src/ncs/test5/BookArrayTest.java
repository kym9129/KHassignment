package ncs.test5;

import java.util.ArrayList;
import java.util.List;

public class BookArrayTest {
	
	//[문제 5] 3개의 Book 객체를 배열로 생성하여 각각의 정보와 할인된 가격을 출력한다.

	public static void main(String[] args) {
		Book bArray [] = new Book[3];
		// Book 객체를 3개 생성하여 배열에 넣는다.
		bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		bArray[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
		bArray[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);
		
		List<Book> bList = new ArrayList<>();
		bList.add(bArray[0]);
		bList.add(bArray[1]);
		bList.add(bArray[2]);
		
		
		//배열에 있는 객체 정보를 모두getter로 출력 한다.–for문을 이용 할 것
		//실행 결과와 같이 계산 출력
		for(int i = 0; i < bArray.length; i++) {
			int disPrice0 = (int)((bList.get(i).getPrice())-(bList.get(i).getPrice() * bList.get(i).getDiscountRate()));
			System.out.println(bList.get(i).getTitle() + ", " + bList.get(i).getAuthor() + ", " + bList.get(i).getPublisher() + ", "+bList.get(i).getPrice() + "원, " +  (int)((bList.get(i).getDiscountRate())*100) + "% 할인");
			System.out.println("할인된 가격 : " + disPrice0 + "원");
			
		}

	}

}
