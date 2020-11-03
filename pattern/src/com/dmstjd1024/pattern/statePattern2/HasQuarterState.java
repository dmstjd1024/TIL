package com.dmstjd1024.pattern.statePattern2;

import java.util.Random;

public class HasQuarterState implements State{

	Random randomWinner = new Random(System.currentTimeMillis() ); 
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전은 한 개만 넣어주세요");
	}
	
	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전이 반환됩니다.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("손잡이를 돌리셨습니다.");
		int winner = randomWinner.nextInt(10);
	//	System.out.println(winner + " 오우 " + gumballMachine.getCount());
		if( (winner == 0) && (gumballMachine.getCount() > 1) ) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else {
			gumballMachine.setState(gumballMachine.getSoldState() );
		}
	}
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("알맹이가 나갈 수 없습니다.");
	}
}
