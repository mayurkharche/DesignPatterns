package com.command;

public class TurnTvOff implements Command{

	private ElectronicDevice electronicDevice;
	
	public TurnTvOff(ElectronicDevice electronicDevice){
		
		this.electronicDevice = electronicDevice;
	}
	
	@Override
	public void execute() {
		
		electronicDevice.off();
	}

}