package designPattern.action.VisitorPattern;

/**
 * 访问者模式（行为型模式）
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		ComputerPart computerPart = new Computer();
		computerPart.accept(new ComputerPartDisplayVisitor());
	}

}
