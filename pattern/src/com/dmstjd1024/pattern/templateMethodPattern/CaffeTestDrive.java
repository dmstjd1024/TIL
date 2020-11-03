package com.dmstjd1024.pattern.templateMethodPattern;

public class CaffeTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TeaWithHook myTeaHook = new TeaWithHook();
		CoffeeWithHook myCoffeeHook = new CoffeeWithHook();
		
		myTeaHook.prepareRecipe();
		myCoffeeHook.prepareRecipe();
		
		
		
	}

}
