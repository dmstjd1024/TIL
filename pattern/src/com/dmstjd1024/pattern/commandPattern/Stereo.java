package com.dmstjd1024.pattern.commandPattern;

public class Stereo{

	String device;
	int volumeNumber;
	
	public Stereo(String device) {
		// TODO Auto-generated constructor stub
		this.device = device;
	}
	
	public void setVolume(int num){
		volumeNumber = num;
		System.out.println(device + " stereo set to " + volumeNumber);
	}
	
	public void setCD() {
		System.out.println(device + " stereo is set for CD input");
		
	}
	
	public void on() {
		System.out.println(device + " stereo is on");
	}
	
	public void off() {
		System.out.println(device + " stereo is off");
	}
	
}
