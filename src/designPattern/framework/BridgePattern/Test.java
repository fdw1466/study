package designPattern.framework.BridgePattern;

/**
 * 桥接模式（结构型模式）
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Shape redCircle = new Circle(10, 10, 10, new RedCircle());
		redCircle.drawCircle();
		Shape blueCircle = new Circle(20, 20, 20, new BlueCircle());
		blueCircle.drawCircle();
		Shape redSquare = new Circle(30, 30, new redSquare());
		redSquare.drawSquare();
	}
}
