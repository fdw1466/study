package designPattern.create.BuilderPattern;

public class HotDog extends Snack {

	@Override
	public String name() {
		return "hot dog";
	}
	
	@Override
	public Packing packing() {
		return new bunch();
	}

	@Override
	public float price() {
		return 3;
	}

}
