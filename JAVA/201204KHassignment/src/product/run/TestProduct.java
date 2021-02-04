package product.run;
import product.model.vo.Product;

//실행용 클래스
//* 패키지 : product.run
//* 클래스명 : TestProduct
//* 추가메소드 : public static void main(String[] args)
//* 내용 : Product의 printProduct실행

public class TestProduct {

	public static void main(String[] args) {
		Product pd = new Product();
		pd.printProduct();

	}

}
