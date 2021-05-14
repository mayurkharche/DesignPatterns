package com.command;

public class TurnTvOn implements Command{

	private ElectronicDevice electronicDevice;
	
	public TurnTvOn(ElectronicDevice electronicDevice){
		
		this.electronicDevice = electronicDevice;
	}
	
	@Override
	public void execute() {
		
		electronicDevice.on();
	}

}
