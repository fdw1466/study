package designPattern.framework.FacadePattern;

/**
 * 外观模式（结构型模式）
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		ColorMaker colorMaker = new ColorMaker();
		colorMaker.drawRed();
		colorMaker.drawBlue();
	}

}
