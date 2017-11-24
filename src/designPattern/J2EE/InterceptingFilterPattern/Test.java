package designPattern.J2EE.InterceptingFilterPattern;

/**
 * 拦截过滤器模式（J2EE）
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());

		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("DWer");
		client.sendRequest("QDen");
	}

}
