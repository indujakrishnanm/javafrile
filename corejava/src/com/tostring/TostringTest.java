package com.tostring;

public class TostringTest {
	int book;
	int pages;
public TostringTest(int book, int pages) {
		//super();
		this.book = book;
		this.pages = pages;
	}
public String toString() {
	return "book name"+book+", book pages "+pages;
		
	}

}
