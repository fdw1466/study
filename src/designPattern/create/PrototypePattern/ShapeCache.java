package designPattern.create.PrototypePattern;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

	public static Shape getShape(String shapeId) {
		Shape cacheShape = shapeMap.get(shapeId);
		return (Shape) cacheShape.clone();
	}

	public static void loadCache() {
		Rectangle rectangle = new Rectangle();
		rectangle.setId("1");
		shapeMap.put(rectangle.getId(), rectangle);

		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
	}

}
