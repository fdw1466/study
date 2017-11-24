package designPattern.create.FactoryPattern;

/**
 * 工厂模式（创建型模式）
 * @author Administrator
 *
 */
public class Test {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Rectangle rectangle = (Rectangle) shapeFactory.getClass(Rectangle.class);
		rectangle.draw();
		Square square = (Square) shapeFactory.getClass(Square.class);
		square.draw();
	}

}
