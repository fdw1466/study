package designPattern.J2EE.FrontControllerPattern;

public class FrontController {

	private Dispatcher dispatcher;

	public FrontController() {
		dispatcher = new Dispatcher();
	}

	private boolean isAuthenticUser() {
		System.out.println("User is authenticated successfully.");
		return true;
	}

	private void trackRequest(String request) {
		System.out.println("Page requested: " + request);
	}

	public void dispatchRequest(Class<?> clazz) {
		// 记录每一个请求
		trackRequest(clazz.getSimpleName());
		// 对用户进行身份验证
		if (isAuthenticUser()) {
			dispatcher.dispatch(clazz);
		}
	}
}
