package com.BikkadIT.ControllerToUI.model;

public class Book {
	
	private String BookName;
	private int BookID;
	private double BookPrice;
	
	
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getBookID() {
		return BookID;
	}
	public void setBookID(int bookID) {
		BookID = bookID;
	}
	public double getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(double bookPrice) {
		BookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [BookName=" + BookName + ", BookID=" + BookID + ", BookPrice=" + BookPrice + "]";
	}

	
	
}
