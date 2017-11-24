package designPattern.framework.FlyWeightPattern;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap<String, Shape> map = new HashMap<>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) map.get(color);

		if (circle == null) {
			circle = new Circle();
			circle.setColor(color);
			map.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		
		return circle;
	}

}
