package com.dmstjd1024.pattern.decoratorPattern;

public abstract class Beverage {

	String description = "제목없음";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
	
	
}
