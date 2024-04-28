package io.dowlath.design_pattern.adapter;

public class Adapter4AppleNSamsung implements Charger{
    private Chargeable samsungCharger;
    
	
	public void setSamsungCharger(Chargeable samsungCharger) {
		this.samsungCharger = samsungCharger;
	}

	@Override
	public void setMobileName(String mobileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
	    samsungCharger.doSupply();	
	}

}
