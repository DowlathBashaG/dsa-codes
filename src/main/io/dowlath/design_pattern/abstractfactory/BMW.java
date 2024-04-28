package io.dowlath.design_pattern.abstractfactory;

public class BMW implements Car {

	@Override
	public Parts getWheels() {
		// TODO Auto-generated method stub
		return new Parts("BMW Wheels");
	}

	@Override
	public Parts getMirrors() {
		// TODO Auto-generated method stub
		return new Parts("BMW Mirrors");
	}

	@Override
	public Parts getEngine() {
		// TODO Auto-generated method stub
		return new Parts("BMW Engine");
	}

	@Override
	public Parts getBody() {
		// TODO Auto-generated method stub
		return new Parts("BMW Body");
	}

}
