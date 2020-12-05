package com.kh.edu;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testJavaApi {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/M/dd");
		System.out.println(format.format(today));
	}
}
