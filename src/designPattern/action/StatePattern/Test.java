package designPattern.action.StatePattern;

/**
 * 状态模式（行为型模式）
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(startState.toString());

		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(stopState.toString());
	}

}
