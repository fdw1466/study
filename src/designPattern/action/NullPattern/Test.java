package designPattern.action.NullPattern;

/**
 * 空对象模式（行为型模式）
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		AbstractCustomer c1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer c2 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer c3 = CustomerFactory.getCustomer("Laura");
		AbstractCustomer c4 = CustomerFactory.getCustomer("DWer");

		System.out.println("===========Customers=========");
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		System.out.println(c4.getName());
	}

}
