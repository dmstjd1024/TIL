package com.dmstjd1024.pattern.designPattern;

public abstract class Duck{

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
		
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swin() {
		System.out.println("모든 오리는 물에 뜹니다 가짜 오리도 뜨죠");
	}

	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
	
}
