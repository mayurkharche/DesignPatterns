package com.strategy;

public class AnimalPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal doggy = new Dog();
		Animal birdy = new Bird();
		
		System.out.println("DOG : "+ doggy.tryToFly());
		System.out.println("Bird : "+ birdy.tryToFly());
	}

}
