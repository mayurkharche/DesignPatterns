package com.decorator;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription() + ", Tomato Sauce";
	}

	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost() + 0.35;
	}

}
