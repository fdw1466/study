package designPattern.J2EE.CompositeEntityPattern;

/**
 * 组合实体模式（J2EE模式）
 * 
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Client client = new Client();
		client.setData("Test", "Data1");
		client.printData();
		client.setData("Second Test", "Data2");
		client.printData();
	}
}
