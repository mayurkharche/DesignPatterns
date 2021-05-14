package com.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance = null;
	
	private ThreadSafeSingleton(){
		
	}
	
	synchronized public static ThreadSafeSingleton getInstance(){
		
		if(null == instance){
			
			instance = new ThreadSafeSingleton();
		}
		
		return instance;
	}

}
