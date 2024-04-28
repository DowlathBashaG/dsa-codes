package io.dowlath.design_pattern.facade;

public class ShapeMaker {
   Circle circle;
   Rectangle rectangle;
   Square square;
   
   ShapeMaker(){
	    circle = new Circle();
	    rectangle = new Rectangle();
	    square = new Square();
   }
   
   public void circleDraw(){
	   circle.display();	  
   }
   public void rectangleDraw(){
	   rectangle.display();
   }
   public void squareDraw(){
	   square.display();
   }
}
