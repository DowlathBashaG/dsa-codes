package io.dowlath.design_pattern.adapter;

/*
 *    Adapter Design Pattern :
 *    							Bridge between two incompatible interfaces.
 */
public class AdapterDesignPatternTest {
	public static void main(String args[]){
		AdapterDesignPatternTest adpt = new AdapterDesignPatternTest();
		Charger appleCharger = new ApplePhone();
		appleCharger.setMobileName("iPhone7");
		appleCharger.charge();
		
		
		Chargeable samsungCharger = new SamsungMobile();
		samsungCharger.setMobileName("Galaxy 7");
		
		Adapter4AppleNSamsung adapter = new Adapter4AppleNSamsung();
        adapter.setSamsungCharger(samsungCharger);
        adapter.charge();
        
	}
	

}
