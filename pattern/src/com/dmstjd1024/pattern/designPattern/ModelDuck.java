package com.dmstjd1024.pattern.designPattern;

public class ModelDuck extends Duck{

	public ModelDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("저는 모형 오리입니다");
	}
}
