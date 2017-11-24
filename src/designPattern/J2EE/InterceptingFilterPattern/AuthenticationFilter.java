package designPattern.J2EE.InterceptingFilterPattern;

public class AuthenticationFilter implements Filter {

	@Override
	public boolean execute(String request) {
		if (request.equals("DWer")){
			System.out.println("Authenticating request success: " + request);
			return true;
		}
		return false;
	}

}
