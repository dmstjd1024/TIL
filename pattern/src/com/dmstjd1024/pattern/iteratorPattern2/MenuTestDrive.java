package com.dmstjd1024.pattern.iteratorPattern2;

public class MenuTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitress.printMenu();
	}

}
