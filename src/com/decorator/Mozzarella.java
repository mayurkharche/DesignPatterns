package com.decorator;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription() + ", Mozzarella";
	}

	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost() + 0.50;
	}

	
}
