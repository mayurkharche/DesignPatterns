package com.decorator;

public abstract class ToppingDecorator implements Pizza {

	Pizza tempPizza;
	
	public ToppingDecorator(Pizza pizza) {
		this.tempPizza = pizza;
	}
}
