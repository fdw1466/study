package designPattern.create.SingletonPattern;

/**
 * 懒汉式，线程不安全
 * 
 * @author Administrator
 *
 */
public class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}