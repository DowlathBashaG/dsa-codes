package io.dowlath.design_pattern.abstractfactory;

/*
 *    Abstract Factory Design Pattern :
 *    									Client is decoupled from concrete classes.
 * 
 */
public class AbstractFactroyDesignPatternTest {
  public Car car;
  public static void main(String args[]){
	  AbstractFactroyDesignPatternTest afdp = new AbstractFactroyDesignPatternTest();
	  Car car = afdp.getCarType("Audi");
	  System.out.println(car.getWheels().getSpecification());
	  System.out.println(car.getMirrors().getSpecification());
	  System.out.println(car.getEngine().getSpecification());
	  System.out.println(car.getBody().getSpecification());
  }
  
  public Car getCarType(String carType){
	  if(carType.equals("Audi")){
		  car = new Audi();
	  }
	  else if(carType.equals("BMW")){
		  car = new BMW();
	  }
	  else if (carType.equals("Benz")){
		  car = new Benz();
	  }
	  return car;
  }
}
