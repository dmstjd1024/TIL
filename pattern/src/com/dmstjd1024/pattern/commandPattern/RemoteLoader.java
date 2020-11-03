package com.dmstjd1024.pattern.commandPattern;

public class RemoteLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		Stereo stereo = new Stereo("Living Room");
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		
		remoteControl.setCommand(0, ceilingFanHigh, ceilingFanOff);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		
		
		/*
		 * CeilingFan ceilingFan = new CeilingFan("Living Room"); GarageDoor garageDoor
		 * = new GarageDoor(""); Stereo stereo = new Stereo("Living Room");
		 */
		/*
			 * LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
			 * LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
			 * LightOnCommand kitchenCommandOn = new LightOnCommand(kitchenLight);
			 * LightOffCommand kitchenCommandOff = new LightOffCommand(kitchenLight);
			 * StereoOnWithCDCommand stereoOnWithCDCommand = new
			 * StereoOnWithCDCommand(stereo); StereoOffCommand stereoOffCommand = new
			 * StereoOffCommand(stereo);
			 * 
			 * remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
			 * remoteControl.setCommand(1, kitchenCommandOn, kitchenCommandOff);
			 * remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);
			 */
		
		/*
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		 */
		/*
		 * remoteControl.onButtonWasPushed(0); remoteControl.offButtonWasPushed(0);
		 * System.out.println(remoteControl); remoteControl.undoButtonWasPushed();
		 * 
		 * remoteControl.offButtonWasPushed(0); remoteControl.onButtonWasPushed(0);
		 * System.out.println(remoteControl); remoteControl.undoButtonWasPushed();
		 */
		
		
	}

}
