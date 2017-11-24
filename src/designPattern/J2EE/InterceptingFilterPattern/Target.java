package designPattern.J2EE.InterceptingFilterPattern;

public class Target {
	public void execute(String request) {
		System.out.println("request success: " + request);
	}
}