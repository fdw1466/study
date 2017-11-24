package designPattern.J2EE.FrontControllerPattern;

public class Dispatcher {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void dispatch(Class<?> clazz) {
		try {
			Class c = Class.forName(clazz.getName());
			c.getMethod("show", null).invoke(c.newInstance(), null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
