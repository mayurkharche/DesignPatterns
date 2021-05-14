package com.command;

import java.util.Map;

public class TVRemote {
	
	DeviceButton turnOn;
	DeviceButton turnOff;
	DeviceButton volumeUp;
	DeviceButton volumeDown;
	
	ElectronicDevice electronicDevice;
	
	public TVRemote(){
		
		electronicDevice = new Television();
		
		turnOn = new DeviceButton(new TurnTvOn(electronicDevice));
		turnOff = new DeviceButton(new TurnTvOff(electronicDevice));
		volumeUp = new DeviceButton(new TurnVolumeUp(electronicDevice));
		volumeDown = new DeviceButton(new TurnVolumeDown(electronicDevice));
	}
	
	public DeviceButton getTurnOnButton(){
		return turnOn;
	}
	
	public DeviceButton getTurnOffButton(){
		return turnOff;
	}
	
	public DeviceButton getVolumeUpButton(){
		return volumeUp;
	}
	
	public DeviceButton getVolumeDownButton(){
		return volumeDown;
	}
}
