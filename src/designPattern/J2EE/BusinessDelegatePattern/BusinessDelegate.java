package designPattern.J2EE.BusinessDelegatePattern;

public class BusinessDelegate {

	private BusinessLockup businessLockup = new BusinessLockup();
	private BusinessService businessService;
	private Class<?> service;

	public void setService(Class<?> clazz) {
		this.service = clazz;
	}

	public void doTask() {
		businessService = businessLockup.getBusinessService(service);
		businessService.doProcessing();
	}

}
