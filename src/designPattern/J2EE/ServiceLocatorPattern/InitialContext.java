package designPattern.J2EE.ServiceLocatorPattern;

public class InitialContext {

	public Object lookup(Class<?> c) {
		Object o = null;
		System.out.println("Looking up and creating a new " + c.getSimpleName() + " object");
		try {
			o = Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return o;
	}
}
