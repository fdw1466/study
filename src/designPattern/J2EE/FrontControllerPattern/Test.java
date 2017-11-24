package designPattern.J2EE.FrontControllerPattern;

/**
 * 前端控制器模式（J2EE模式）
 * 
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest(HomeView.class);
		frontController.dispatchRequest(StudentView.class);
	}
}
