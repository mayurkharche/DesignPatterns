package com.prototype;

public class Sheep implements Animal{

	Sheep(){
		
		System.out.println("Sheep is made");
	}
	
	@Override
	public Animal makeCopy() {
		
		System.out.println("Sheep is being made");
		
		Sheep sheep = null;
		
		try {
			sheep = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return sheep;
	}
	
	@Override
	public String toString(){
		
		return "Dolly is my hero, baaaaa";
	}
}
