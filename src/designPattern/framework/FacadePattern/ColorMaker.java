package designPattern.framework.FacadePattern;

public class ColorMaker {

	private Color red;
	private Color blue;

	public ColorMaker() {
		red = new Red();
		blue = new Blue();
	}

	public void drawRed() {
		red.draw();
	}

	public void drawBlue() {
		blue.draw();
	}
}
