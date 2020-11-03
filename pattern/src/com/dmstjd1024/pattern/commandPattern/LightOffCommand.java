package com.dmstjd1024.pattern.commandPattern;

public class LightOffCommand implements Command{
	
	Light light;
	
	public LightOffCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		light.off();
	}
	
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.on();
	}

}
