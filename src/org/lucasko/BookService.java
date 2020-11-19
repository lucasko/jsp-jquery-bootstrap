package org.lucasko;

import java.util.ArrayList;

import com.google.gson.Gson;

public class BookService {

	public String getBook() {

		Gson gson = new Gson();
		Book b1 = new Book("A1", 123);
		Book b2 = new Book("A2", 222);
		Book b3 = new Book("A3", 333);
		Book b4 = new Book("A4", 444);
		
		ArrayList<Book> bookList = new ArrayList<Book> ();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		
		
		// 2. Java object to JSON string
		String jsonInString = gson.toJson(bookList);

		return jsonInString;

	}

}
