package com.decorator;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Plain Pizza";
	}

	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return 4.00;
	}

}
