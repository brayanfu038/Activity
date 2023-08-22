package model;

import java.util.Vector;

public class ShoppingCart {
	Vector<Item>items;
	
	public ShoppingCart() {
		items = new Vector<Item>(10,1);
	}
	
	public void addItem(String name,double price) {
		items.add(new Item(name,price));
	}
	
	public String showItems() {
		String print = "-------Items------\n";
		for (int i = 0; i < items.size(); i++) {
			print += items.get(i).getName()+" : "+items.get(i).getPrice()+"\n";
		}
		return print;
	}
	public double calculatePrice() {
		double totalPrice=0;
		for (int i = 0; i < items.size(); i++) {
			totalPrice += items.get(i).getPrice();
		}
		return totalPrice;
	}
}
