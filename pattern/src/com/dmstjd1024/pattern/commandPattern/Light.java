package com.dmstjd1024.pattern.commandPattern;

public class Light {
	
	String device;
	
	public Light(String device) {
		this.device = device;
	}
	
	public void on() {
		System.out.println(device + " light is on");
	}

	public void off() {
		System.out.println(device + " light is off");
	}
}
