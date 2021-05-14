package com.decorator;

public class PizzaMaker {

	public static void main(String[] args) {
		
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		
		System.out.println("Ingrideints : " + basicPizza.getDescription());
		System.out.println("Price : "+ basicPizza.getCost());
	}
}
