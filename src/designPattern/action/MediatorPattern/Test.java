package designPattern.action.MediatorPattern;

/**
 * 中介者模式（行为型模式）
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		User dwer = new User("DWer");
		User qden = new User("QDen");

		dwer.sendMessage("IOU!");
		qden.sendMessage("Me too.");
	}

}
