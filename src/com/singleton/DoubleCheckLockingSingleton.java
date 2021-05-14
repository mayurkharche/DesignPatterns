package com.singleton;

public class DoubleCheckLockingSingleton {
	
	private static DoubleCheckLockingSingleton instance = null;
	
	private DoubleCheckLockingSingleton(){}
	
	public static DoubleCheckLockingSingleton getInstance(){
		
		if(null == instance){
			
			synchronized (DoubleCheckLockingSingleton.class) {
				
				if(null == instance){
					instance = new DoubleCheckLockingSingleton();
				}
			}
			
		}
		
		return instance;
		
	}

}
