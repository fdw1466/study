package designPattern.framework.BridgePattern;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", y:" + y + "]");
	}

	@Override
	public void drawSquare(int x, int y) {
		
	}

}
