package designPattern.J2EE.InterceptingFilterPattern;

public class DebugFilter implements Filter {

	@Override
	public boolean execute(String request) {
		System.out.println("request log: " + request);
		return true;
	}

}
