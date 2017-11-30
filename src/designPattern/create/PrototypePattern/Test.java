package designPattern.create.PrototypePattern;

/**
 * 原型模式（创建型模式）
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape shape1 = ShapeCache.getShape("1");
		System.out.println("shape:" + shape1.getType());
		shape1.draw();

		Shape shape2 = ShapeCache.getShape("2");
		System.out.println("shape:" + shape2.getType());
		shape2.draw();
	}

}
