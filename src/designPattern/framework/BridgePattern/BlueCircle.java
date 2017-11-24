package designPattern.framework.BridgePattern;

public class BlueCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: blue, radius: " + radius + ", x: " + x + ", y:" + y + "]");
	}

	@Override
	public void drawSquare(int x, int y) {
		
	}

}
