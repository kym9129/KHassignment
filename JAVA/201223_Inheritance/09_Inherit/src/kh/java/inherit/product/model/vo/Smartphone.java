package kh.java.inherit.product.model.vo;

public class Smartphone extends Product {

	private String os;
	private String carrier;
	
	public Smartphone() {
		
	}
	
	public Smartphone(String brand, String productName, int price, 
						String os, String carrier) {
//		setBrand(brand);
//		setProductName(productName);
//		setPrice(price);
		
		//부모생성자를 호출한다.
		super(brand, productName, price);
		this.os = os;
		this.carrier = carrier;
		
	}
	
	public String getSmartphoneInfo() {
		return getProductInfo() + ", " + os + ", " + carrier;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	
}
