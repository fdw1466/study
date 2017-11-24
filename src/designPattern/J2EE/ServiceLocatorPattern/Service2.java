package designPattern.J2EE.ServiceLocatorPattern;

public class Service2 implements Service {

	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}

	@Override
	public void execute() {
		System.out.println("Executing Service2");
	}

}
