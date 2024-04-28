package io.dowlath.design_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
  public static Map<String,Shape> circleMap = new HashMap<String,Shape>();
  
  public static Shape getShape(String color){
	  Circle circle = (Circle)circleMap.get(color);
	  if(circle==null){
		  circle = new Circle(color);
		  circleMap.put(color,circle);
		  System.out.println("Drawing Color ... :"+ color);
	  }
	  return circle;
  }
}
