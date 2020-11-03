package com.dmstjd1024.pattern.iteratorPattern;

public class MenuTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitress.printMenu();
	}

}
