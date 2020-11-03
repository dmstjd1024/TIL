package com.dmstjd1024.pattern.statePattern2;

public class GumballMachine {
	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;

	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		soldState = new SoldState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldOutState = new SoldOutState(this);
		winnerState = new WinnerState(this);
		this.count = numberGumballs;
		if(numberGumballs > 0) {
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	void releaseBall() {
//		System.out.println("A gumball comse rolling out the slot...");
		System.out.println("알맹이가 나가고 있습니다.");
		if(count != 0) {
			count = count -1;
		}
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getState() {
		return state;
	}
	public int getCount() {
		return count;
	}
	
	public State getWinnerState() {
		return winnerState;
	}
	
	@Override
	public String toString() {
		
		String state = "\n주식회사 왕뽑기\n" + "자바로 돌아가는 2004년 뽑기 기계\n" + "남은 개수: " + this.count + "개\n" + "동전 투입 대기 중\n";   
		return state;
	}


}
