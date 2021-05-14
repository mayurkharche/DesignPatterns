package com.singleton;

public class EagerInitSingleton {
	
	private static EagerInitSingleton instance = new EagerInitSingleton();

	private EagerInitSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static EagerInitSingleton getInstance(){
		return instance;
	}
}
