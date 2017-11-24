package designPattern.create.AbstractFactoryPattern;

/*
 * 抽象工厂模式（创建型模式）
 */
public class Test {

	public static void main(String[] args) {
		// 获取形状工厂
		AbstractFactory shapeFactory = (AbstractFactory) FactoryProducer.getFactory(ShapeFactory.class);
		// 获取形状为长方形的对象
		Shape shape = shapeFactory.getShape(Rectangle.class);
		// 调用Rectangle的draw方法
		shape.draw();

		// 获取颜色工厂
		AbstractFactory colorFactory = (AbstractFactory) FactoryProducer.getFactory(ColorFactory.class);
		// 获取颜色为蓝色的对象
		Color color = colorFactory.getColor(Blue.class);
		// 调用Blue的fill方法
		color.fill();
	}

}
