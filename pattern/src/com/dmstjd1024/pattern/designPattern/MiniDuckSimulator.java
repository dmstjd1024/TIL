package com.dmstjd1024.pattern.designPattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior( new FlyRocketPowered() );
		model.performFly();
	}
	

}
