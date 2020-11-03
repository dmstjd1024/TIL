package com.dmstjd1024.pattern.statePattern2;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gumballMachine = new GumballMachine(4);
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
	}

}
