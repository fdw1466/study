package designPattern.framework.BridgePattern;

public abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void drawCircle();
	
	public abstract void drawSquare();

}
