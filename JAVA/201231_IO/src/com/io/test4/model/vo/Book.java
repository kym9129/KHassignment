package com.io.test4.model.vo;

import java.io.Serializable;
import java.util.Calendar;

public class Book implements Serializable {
	private String title; //도서명
	private String author; //저자
	private int price; //가격
	private Calendar dates; //출판날짜
	private double discountRate; //할인율
	
	public Book() {
		
	}
	
	public Book(String title, String author, int price, Calendar dates, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDates() {
		return dates;
	}

	public void setDates(Calendar dates) {
		this.dates = dates;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	@Override
	public String toString() {
		int yyyy = this.dates.get(dates.YEAR);
		int mm = this.dates.get(dates.MONTH)+1;
		int dd = this.dates.get(dates.DATE);
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", dates=" +
				yyyy + "년 " + mm + "월 " + dd + "일 출간"
				+ ", discountRate=" + discountRate + "]";
	}

}
