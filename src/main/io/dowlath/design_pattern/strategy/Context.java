package io.dowlath.design_pattern.strategy;

public class Context {
private Strategy strategy;
public Context(Strategy strategy){
  this.strategy = strategy;	
}
public int  executeStrategy(int x, int y){
	return strategy.doOperation(x, y);
}
}
