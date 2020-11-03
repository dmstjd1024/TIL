package com.dmstjd1024.pattern.adapterPattern;

public class DuckTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\n The Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter say...");
		testDuck(turkeyAdapter);
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
