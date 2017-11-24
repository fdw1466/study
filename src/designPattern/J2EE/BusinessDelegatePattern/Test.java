package designPattern.J2EE.BusinessDelegatePattern;

/**
 * 业务代表模式（J2EE模式）
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setService(EJBService.class);

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setService(JMSService.class);
		client.doTask();
	}
}
