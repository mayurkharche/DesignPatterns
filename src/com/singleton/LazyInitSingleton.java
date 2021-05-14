package com.singleton;

public class LazyInitSingleton {
	
	private static LazyInitSingleton instance = null;

	private LazyInitSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static LazyInitSingleton getInstance(){
		
		if(null == instance){
			instance = new LazyInitSingleton();
		}
		
		return instance;
	}

}
