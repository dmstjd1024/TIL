package com.dmstjd1024.pattern.decoratorPattern;

public class Soy extends CondimentDecorator{

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", 두유";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .15  + beverage.cost();
	}
}
