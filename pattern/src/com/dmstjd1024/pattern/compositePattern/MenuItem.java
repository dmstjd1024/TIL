package com.dmstjd1024.pattern.compositePattern;

import java.util.Iterator;

public class MenuItem extends MenuComponent{

	String name;
	String description;
	boolean vegetarian;
	double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public boolean isVegetarian() {
		// TODO Auto-generated method stub
		return vegetarian;
	}
	
	public void print() {
		System.out.print( " " + getName() );
		if(isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("    -- " + getDescription());
	}
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new NullIterator();
	}
}
