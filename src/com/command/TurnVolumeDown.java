package com.command;

public class TurnVolumeDown implements Command{

	private ElectronicDevice electronicDevice;
	
	public TurnVolumeDown(ElectronicDevice electronicDevice){
		
		this.electronicDevice = electronicDevice;
	}
	
	@Override
	public void execute() {
		
		electronicDevice.volumeDown();
	}
}
