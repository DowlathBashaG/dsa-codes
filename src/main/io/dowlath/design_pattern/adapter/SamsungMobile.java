package io.dowlath.design_pattern.adapter;

public class SamsungMobile implements Chargeable{
	private String mobileName;

	@Override
	public void setMobileName(String mobileName) {
		// TODO Auto-generated method stub
		this.mobileName = mobileName;
		
	}

	@Override
	public void doSupply() {
		// TODO Auto-generated method stub
		System.out.println("Charging ... :"+ this.mobileName);
		
	}

}
