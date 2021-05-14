package com.command;

public class TurnVolumeUp implements Command{

	private ElectronicDevice electronicDevice;
	
	public TurnVolumeUp(ElectronicDevice electronicDevice){
		
		this.electronicDevice = electronicDevice;
	}
	
	@Override
	public void execute() {
		
		electronicDevice.volumeUp();
	}

}
