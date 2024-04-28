package io.dowlath.design_pattern.abstractfactory;

public class Benz implements Car{

	@Override
	public Parts getWheels() {
		// TODO Auto-generated method stub
		return new Parts("Benz Wheels");
	}

	@Override
	public Parts getMirrors() {
		// TODO Auto-generated method stub
		return new Parts("Benz Mirrors");
	}

	@Override
	public Parts getEngine() {
		// TODO Auto-generated method stub
		return new Parts("Benz Engine");
	}

	@Override
	public Parts getBody() {
		// TODO Auto-generated method stub
		return new Parts("Benz Body");
	}

}
