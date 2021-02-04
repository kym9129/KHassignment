package kh.java.inherit.product.model.vo;

public class TV extends Product {
	int size;
	int channel;
	
	public TV(){

	}
	

	
	public TV(String brand, String productName, int price, int size, int channel) {
		super(brand, productName, price);
		this.size = size;
		this.channel = channel;
	}



	public String getTVInfo() {
		return getBrand() + ", " + getProductName() + ", " + getPrice() + 
				", " + size + ", " + channel;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
}
