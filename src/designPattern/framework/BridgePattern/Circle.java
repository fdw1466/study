package designPattern.framework.BridgePattern;

public class Circle extends Shape {
	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public Circle(int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
	}

	@Override
	public void drawCircle() {
		drawAPI.drawCircle(radius, x, y);
	}

	@Override
	public void drawSquare() {
		drawAPI.drawSquare(x, y);
	}

}
