package io.dowlath.design_pattern.strategy;

/*
 *    Strategy Design Pattern : 
 *    
 *     				A class behaviour or its algorithm can be changed at runtime.
 */

public class StrategyDesignPatternTest {
	public static void main(String args[]) {
		Context contextADD = new Context(new AddOperation());
		System.out.println("ADDITION ....:"+contextADD.executeStrategy(5, 5));
		Context contextSUB = new Context(new SubOperation());
		System.out.println("SUBTRACTION ...."+contextSUB.executeStrategy(5, 5));
		Context contextMUL = new Context(new MulOperation());
		System.out.println("MULTIPLICATION ..."+contextMUL.executeStrategy(5, 5));
		Context contextDIV = new Context(new DivOperation());
		System.out.println("DIVISION ....:"+contextDIV.executeStrategy(5, 5));
	}
}
