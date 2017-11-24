package designPattern.create.AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(Class<?> color) {
		Color c = null;
		try {
			c = (Color) Class.forName(color.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("没有发现该类");
			e.printStackTrace();
		}
		return c;
	}

	@Override
	Shape getShape(Class<?> shape) {
		return null;
	}

}
