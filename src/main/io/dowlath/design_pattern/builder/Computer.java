package io.dowlath.design_pattern.builder;

public class Computer {
	public String HDD;
	public String RAM;
	public boolean isBluetoothEnabled;
	public boolean isWifiEnabled;
	
	public Computer(ComputerBuilder computerBuilder){
		this.HDD = HDD;
		this.RAM = RAM;
		this.isBluetoothEnabled = isBluetoothEnabled;
		this.isWifiEnabled = isWifiEnabled;
	}
	public static class ComputerBuilder{
		private String HDD;
		private String RAM;
		private boolean isBluetoothEnabled;
		private boolean isWifiEnabled;

		ComputerBuilder(String HDD,String RAM){
			this.HDD = HDD;
			this.RAM = RAM;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public ComputerBuilder setWifiEnabled(boolean isWifiEnabled) {
			this.isWifiEnabled = isWifiEnabled;
			return this;
		}
		public Computer build(){
			return new Computer(this);
		}
		
	}

}
