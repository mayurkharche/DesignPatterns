package com.chainofresposibility;

public class TestChainCalculation {
	
	public static void main(String[] args) {
		
		Chain calc1 = new AddNumbers();
		Chain calc2 = new SubstractNumbers();
		Chain calc3 = new MultiplyNumbers();
		Chain calc4 = new DivideNumbers();
		
		calc1.setNextChain(calc2);
		calc2.setNextChain(calc3);
		calc3.setNextChain(calc4);
		
		Numbers numbers = new Numbers(3,4,"pow");
		
		calc1.calculate(numbers);
	}

}
