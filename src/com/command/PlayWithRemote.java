package com.command;

public class PlayWithRemote {

	public static void main(String[] args) {
		
		TVRemote tvRemote = new TVRemote();
		
		tvRemote.getTurnOnButton().press();
		tvRemote.getVolumeUpButton().press();
		tvRemote.getVolumeDownButton().press();
		tvRemote.getTurnOffButton().press();

	}

}
