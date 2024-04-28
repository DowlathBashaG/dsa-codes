package io.dowlath.design_pattern.flyweight;

/*
 *  Flyweight Design Pattern :
 *                              Reduces the no of objects,decreases the memory foot print and increases the performance.  					
 * 
 */

public class FlyweightDesignPatternTest {
	private static String colors[] = { "Red", "Green", "White", "Black", "Yellow" };

	public static void main(String args[]) {
		for (int i = 0; i < 20; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();

		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}

}
