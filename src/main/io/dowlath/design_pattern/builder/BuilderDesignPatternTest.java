package io.dowlath.design_pattern.builder;

/*
 *  Builder Design Pattern :
 *  						   Builds the complex objects from simple one , step by step.
 *  			
 */
public class BuilderDesignPatternTest {
	public static void main(String args[]){
		Computer computer = new Computer.ComputerBuilder("8GB","4GB").setBluetoothEnabled(true).setWifiEnabled(false).build();
	}

}
