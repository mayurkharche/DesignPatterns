package com.command;

public class DeviceButton {
	
	Command command;
	
	public DeviceButton(Command newCommand){
		
		this.command = newCommand;
	}
	
	public void press(){
		
		command.execute();
	}

}
