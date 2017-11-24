package designPattern.create.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(Class<?> color) {
		return null;
	}

	@Override
	Shape getShape(Class<?> shape) {
		Shape s = null;
		try {
			s = (Shape) Class.forName(shape.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("没有发现该类");
			e.printStackTrace();
		}
		return s;
	}

}
