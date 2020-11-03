package com.dmstjd1024.pattern.commandPattern;

public class CeilingFanHighCommand implements Command{

	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		// TODO Auto-generated constructor stub
		this.ceilingFan = ceilingFan;
	}
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if(prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		}else if(prevSpeed == CeilingFan.MEDIUM){
			ceilingFan.medium();
		}else if(prevSpeed == CeilingFan.LOW){
			ceilingFan.low();
		}else if(prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
	
	
}
