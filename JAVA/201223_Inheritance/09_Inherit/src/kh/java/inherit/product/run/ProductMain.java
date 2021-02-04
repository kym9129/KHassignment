package kh.java.inherit.product.run;

import kh.java.inherit.product.model.vo.Desktop;
import kh.java.inherit.product.model.vo.Smartphone;
import kh.java.inherit.product.model.vo.TV;

public class ProductMain {

	public static void main(String[] args) {
		Desktop d = new Desktop("삼성", "삼성대땅", 1_000_000, 
								"Windows10", "UHD커브드", "기계식키보드");

//		System.out.println(d.getDesktopInfo());
		System.out.println(d);
		
		Smartphone s = new Smartphone("애플", "iPhone12", 500_000, "iOS14", "KT");
		
		System.out.println(s.getSmartphoneInfo());
		
		TV tv = new TV("LG", "LG 롤러블 TV", 1_000_000_000, 50, 30);
		System.out.println(tv.getTVInfo());
	}

}
