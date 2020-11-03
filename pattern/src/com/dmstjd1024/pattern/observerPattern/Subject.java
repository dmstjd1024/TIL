package com.dmstjd1024.pattern.observerPattern;

public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	
}


