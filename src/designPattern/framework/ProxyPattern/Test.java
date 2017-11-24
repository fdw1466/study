package designPattern.framework.ProxyPattern;

/**
 * 代理模式（结构型模式）
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Image image = new ProxyImage("四不.png");
		// 图像将从磁盘加载
		image.display();
		System.out.println("");

		// 图像将无法从磁盘加载
		image.display();
	}
}
