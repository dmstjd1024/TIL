package com.dmstjd1024.pattern.statePattern2;

public class NoQuarterState implements State{

	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣었습니다.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
	}
	
	
}
