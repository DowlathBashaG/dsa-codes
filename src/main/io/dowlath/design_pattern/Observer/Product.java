package io.dowlath.design_pattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{
	
	private String productName;
	private List<Observer> observers = new ArrayList<>();
	private boolean isAvailable;

    
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
		if(isAvailable == true){
			notifyObservers();
		}
	}

	@Override
	public void registerObservers(Observer observer) {
		// TODO Auto-generated method stub
	     observers.add(observer);
		
	}

	@Override
	public void removeRegister(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		System.out.println("Notifying the observers are registerd, observer will update once product is available");
		for(Observer observer : observers){
			observer.update(productName);
		}
	}
	

}
