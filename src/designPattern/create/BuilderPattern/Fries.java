package designPattern.create.BuilderPattern;

public class Fries extends Snack {

	@Override
	public String name() {
		return "Fries";
	}

	@Override
	public Packing packing() {
		return new Box();
	}

	@Override
	public float price() {
		return 6.5f;
	}

}
