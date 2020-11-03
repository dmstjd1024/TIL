package com.dmstjd1024.pattern.decoratorPattern;

public class Whip extends CondimentDecorator{

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", 휘핑 크림";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.1 + beverage.cost();
	}
	
}
