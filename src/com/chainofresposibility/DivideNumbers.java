package com.chainofresposibility;

public class DivideNumbers implements Chain{
	
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		
		this.nextInChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		
		if(request.getCalculationWanted().equals("div")){
			
			System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + 
					(request.getNumber1() / request.getNumber2()));
		}else{
			
			System.out.println("Error : Only work for add, sub , mult & div");
		}
	}

}
