package designPattern.create.SingletonPattern;

/**
 * 单例模式（创建型模式）
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		SingleObject.getInstance().showMessage();
		
		System.out.println(Singleton.getInstance().hashCode());
		System.out.println(Singleton.getInstance().hashCode());
		
		System.out.println(Singleton2.getInstance().hashCode());
		System.out.println(Singleton2.getInstance().hashCode());
		
		System.out.println(Singleton3.getInstance().hashCode());
		System.out.println(Singleton3.getInstance().hashCode());
		
		System.out.println(Singleton4.getInstance().hashCode());
		System.out.println(Singleton4.getInstance().hashCode());
		
		System.out.println(Singleton5.getInstance().hashCode());
		System.out.println(Singleton5.getInstance().hashCode());
		
		System.out.println(Singleton6.INSTANCE);
		
		System.out.println(new notSingleton().hashCode());
		System.out.println(new notSingleton().hashCode());
	}
}
