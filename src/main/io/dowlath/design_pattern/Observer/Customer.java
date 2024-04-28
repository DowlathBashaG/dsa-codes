package io.dowlath.design_pattern.Observer;

public class Customer implements Observer{
	private String customerName;
	private Subject subject;
	

	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	@Override
	public void update(String productName) {
		// TODO Auto-generated method stub
		System.out.println("Hi ..."+ customerName+ " the following "+ productName+"  is available on amazon now");
	}

}
