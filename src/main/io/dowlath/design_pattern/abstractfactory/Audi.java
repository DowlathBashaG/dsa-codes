package io.dowlath.design_pattern.abstractfactory;

public class Audi implements Car{

	@Override
	public Parts getWheels() {
		// TODO Auto-generated method stub
		return new Parts("Audi Wheels");
	}

	@Override
	public Parts getMirrors() {
		// TODO Auto-generated method stub
		return new Parts("Audi Mirrors");
	}

	@Override
	public Parts getEngine() {
		// TODO Auto-generated method stub
		return new Parts("Audi Engine");
	}

	@Override
	public Parts getBody() {
		// TODO Auto-generated method stub
		return new Parts("Audi Body");
	}

}
