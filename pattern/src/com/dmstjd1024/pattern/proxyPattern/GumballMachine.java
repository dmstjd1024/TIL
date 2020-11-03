package com.dmstjd1024.pattern.proxyPattern;

public class GumballMachine {

	String location;
	int count;
	State state;
	
	public GumballMachine(String location, int count) {
		// TODO Auto-generated constructor stub
		this.location = location;
		this.count = count;
	}
	
	public String getLocation() {
		return location;
	}
	
	public int getCount() {
		return count;
	}
	
	public State getState() {
		return state; 
	}
	
	
}
