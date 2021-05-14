package com.strategy;

public class Bird extends Animal{
	
	public Bird(){
		
		super();
		
		this.flyingType = new ItFly();
	}

}
