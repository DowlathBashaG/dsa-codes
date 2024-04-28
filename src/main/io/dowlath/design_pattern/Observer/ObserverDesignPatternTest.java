package io.dowlath.design_pattern.Observer;

public class ObserverDesignPatternTest {
public static void main(String args[]){
	Customer customer1 = new Customer();
	Customer customer2 = new Customer();
	
	customer1.setCustomerName("Dowlath");
	customer2.setCustomerName("Basha");
	
	Product iPhone = new Product();
	iPhone.setProductName("iPhone7");
	iPhone.setAvailable(false);
	
	iPhone.registerObservers(customer1);
	iPhone.registerObservers(customer2);
	
	iPhone.setAvailable(true);
	iPhone.removeRegister(customer2);
	iPhone.setAvailable(true);
}
}
