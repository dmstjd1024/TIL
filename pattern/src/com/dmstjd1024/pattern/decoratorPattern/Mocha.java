package com.dmstjd1024.pattern.decoratorPattern;

public class Mocha extends CondimentDecorator{

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", 모카";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .20 + beverage.cost();
	}
}
