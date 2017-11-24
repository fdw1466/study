package designPattern.create.AbstractFactoryPattern;

public class FactoryProducer {

	public static Object getFactory(Class<? extends AbstractFactory> clazz) {
		Object o = null;
		try {
			o = Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return o;
	}

}
