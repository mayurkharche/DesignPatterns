package com.strategy;

public class Dog extends Animal {

	public Dog() {
		super();
		
		this.flyingType = new CantFly();
	}
}
