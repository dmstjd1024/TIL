package com.dmstjd1024.pattern.commandPattern;

public class LightOnCommand implements Command{
	
	Light light;
	
	public LightOnCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	
	public void excute() {
		light.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.off();
	}
}
