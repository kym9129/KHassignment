package product.model.vo;

//기능제공 클래스
//* 패키지 : product.model.vo
//* 클래스명 : Product
//* 메소드 :  public void printProduct() {} 
//* 내용 : 제품소개글 출력(예: TV, 42인치, 100만원)


public class Product {
	
	public void printProduct() {
		System.out.println("------------------------------------------\n"
				+ "\t********OLED TV*******\n"
				+ "\t놀라운 크기 42인치!!!!\n"
				+ "\t오늘만 특가! 100만원!!!\n"
				+ "\t연말은 집에서 TV와 함께!!!\n"
				+ "------------------------------------------");
	}

}
