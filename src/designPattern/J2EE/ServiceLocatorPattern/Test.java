package designPattern.J2EE.ServiceLocatorPattern;

/**
 * 服务定位器模式（J2EE）
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Service service = ServiceLocator.getService(Service1.class);
		service.execute();
		service = ServiceLocator.getService(Service2.class);
		service.execute();
		service = ServiceLocator.getService(Service1.class);
		service.execute();
		service = ServiceLocator.getService(Service2.class);
		service.execute();

	}
}
