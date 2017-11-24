package designPattern.J2EE.ServiceLocatorPattern;

public class ServiceLocator {

	private static Cache cache;

	static {
		cache = new Cache();
	}

	public static Service getService(Class<?> c) {
		Service service = cache.getService(c.getSimpleName());

		if (service != null)
			return service;

		InitialContext initialContext = new InitialContext();
		Service service2 = (Service) initialContext.lookup(c);
		cache.addService(service2);
		return service2;
	}
}
