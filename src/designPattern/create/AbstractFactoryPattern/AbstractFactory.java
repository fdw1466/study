package designPattern.create.AbstractFactoryPattern;

public abstract class AbstractFactory {
	abstract Color getColor(Class<?> color);

	abstract Shape getShape(Class<?> shape);
}
