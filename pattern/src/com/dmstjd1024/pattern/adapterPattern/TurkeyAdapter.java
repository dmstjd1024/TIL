package com.dmstjd1024.pattern.adapterPattern;

public class TurkeyAdapter implements Duck{

	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		// TODO Auto-generated constructor stub
		this.turkey = turkey;
	}
	
	public void quack() {
		turkey.gobble();
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
