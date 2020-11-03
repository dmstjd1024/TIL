package com.dmstjd1024.pattern.singletonPattern;

public class Singleton {

	private static Singleton uniqueInstance;
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
