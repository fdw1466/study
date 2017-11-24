package designPattern.J2EE.BusinessDelegatePattern;

public class BusinessLockup {
	public BusinessService getBusinessService(Class<?> clazz) {
		Object object = null;
		try {
			object = Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (BusinessService) object;
	}
}
