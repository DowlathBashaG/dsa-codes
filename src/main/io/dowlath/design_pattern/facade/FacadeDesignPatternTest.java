package io.dowlath.design_pattern.facade;

/*
 *   Facade Design Pattern :
 *   						  Hide the complexities and single interface provides the entire subsystem.
 * 
 */
public class FacadeDesignPatternTest {
	public static  void main(String args[]){
		ShapeMaker sm = new ShapeMaker();
		sm.circleDraw();
		sm.rectangleDraw();
		sm.squareDraw();
	}

}
