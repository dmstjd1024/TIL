package com.dmstjd1024.pattern.statePattern2;

public class SoldOutState implements State{

	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("매진되었습니다. 다음 기회에 이용해주세요");
	}
	
	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		 System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
		 
	}
	
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("매진입니다.");
	}
	
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("매진");
	}
	
	
}
