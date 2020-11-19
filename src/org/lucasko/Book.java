package org.lucasko;

public class Book {
	
	Book(String name, int price){ this.name = name ; this.price = price ;}

	String name ; public void setName(String name) {this.name = name ;} public String getName() {return this.name;}

	int price ; public void setPrice(int price) {this.price = price ;} public int getPrice() {return this.price;}
	
}
