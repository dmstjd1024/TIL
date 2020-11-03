package com.dmstjd1024.pattern.gumballProxyPattern;

import java.rmi.*;
import java.rmi.server.*;


public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{

	String location;
	int count;
	State state;
	
	public GumballMachine(String location, int numberGumballs) throws RemoteException {
		// TODO Auto-generated constructor stub
		this.location = location;
		this.count = numberGumballs;
	}
	
	public int getCount() {
		return count;
	}
	public State getState() {
		return state;
	}
	
	public String getLocation() {
		return location;
	}
}
