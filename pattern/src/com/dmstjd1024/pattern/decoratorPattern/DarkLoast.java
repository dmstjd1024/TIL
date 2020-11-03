package com.dmstjd1024.pattern.decoratorPattern;

public class DarkLoast extends Beverage{

	public DarkLoast() {
		// TODO Auto-generated constructor stub
		description = "다크 로스트";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .99;
	}
}
