package com.singleton;

public class BillPughSingleton {
	
	private BillPughSingleton(){}
	
	private static class BillPugh{
		
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance(){
		
		return BillPugh.INSTANCE;
	}

}
