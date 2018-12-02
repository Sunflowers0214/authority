package com.flysnow.demo.model;

/**
 * 用户
 */
public class Book {

	private String bookId;// 图书ID
	private String name;// 图书名称
	private int number;// 馆藏数量

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Book{" +
				"bookId='" + bookId + '\'' +
				", name='" + name + '\'' +
				", number=" + number +
				'}';
	}
}
