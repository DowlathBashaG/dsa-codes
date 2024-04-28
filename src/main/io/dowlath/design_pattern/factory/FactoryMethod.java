package io.dowlath.design_pattern.factory;

public class FactoryMethod {
  Pet pet = null;
  public Pet getPetType(String petType){
	  if(petType.equals("Meow")){
		  pet = new Cat();
	  }
	  else if(petType.equals("Lol")){
		  pet = new Dog();
	  }
	  return pet;
  }
}
