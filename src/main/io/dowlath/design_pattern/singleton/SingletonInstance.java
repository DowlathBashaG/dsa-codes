package io.dowlath.design_pattern.singleton;


public class SingletonInstance {

	public static SingletonInstance instance = null;
	
	private SingletonInstance() {
	}
	
	public static SingletonInstance getInstance() {
		instance = new SingletonInstance();
		return instance;
	}
	public static void main(String[] args) {
		SingletonInstance sg = SingletonInstance.getInstance();
		SingletonInstance sg1 = SingletonInstance.getInstance();
		if(sg.hashCode() == sg1.hashCode()) {
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
