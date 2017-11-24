package designPattern.framework.BridgePattern;

public class redSquare implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {

	}

	@Override
	public void drawSquare(int x, int y) {
		System.out.println("Drawing Square{color:red, x:" + x + ", y:" + y + "}");
	}

}
