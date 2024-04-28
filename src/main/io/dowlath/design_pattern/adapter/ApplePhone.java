package io.dowlath.design_pattern.adapter;

public class ApplePhone implements Charger{
    private String mobileName;
	@Override
	public void setMobileName(String mobileName) {
		// TODO Auto-generated method stub
		this.mobileName = mobileName;
		System.out.println("Mobile Name is ... :"+mobileName);
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("Charging ... :"+this.mobileName);
	}

}
