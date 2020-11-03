package com.dmstjd1024.pattern.decoratorPattern;

public class SteamMilk extends CondimentDecorator{

	Beverage beverage;
	
	public SteamMilk(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.description +", 스팀 밀크";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10 + beverage.cost();
	}
	
	
	
}
