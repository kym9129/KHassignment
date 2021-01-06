package com.collection.map.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesMain {
	//@실습문제1
//	/resources/config.properties 파일의 정보를 Properties객체를 이용해서 읽어와 화면에 출력하세요.


	public static void main(String[] args) {
		PropertiesMain pm = new PropertiesMain();
		pm.test();

	}

	private void test() {
		
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("resources/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop);
		
	}

}
