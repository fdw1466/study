package designPattern.create.SingletonPattern;

/**
 * 登记式/静态内部类
 * 
 * @author Administrator
 *
 */
public class Singleton5 {
	private static class SingletonHolder {
		private static final Singleton5 INSTANCE = new Singleton5();
	}

	private Singleton5() {
	}

	public static final Singleton5 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}