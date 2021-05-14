package com.strategy;

public class Animal {

	private String name;
	private double weight;
	
	protected Flys flyingType;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		
		if(weight > 0){
			this.weight = weight;
		}else {
			System.out.println("Weight cannot be 0");
		}
	}
	
	public String tryToFly(){
		
		return this.flyingType.fly();
	}
}
