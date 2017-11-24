package designPattern.action.InterpreterPattern;

public class AndExpression implements Expression {

	private Expression e1 = null;
	private Expression e2 = null;

	public AndExpression(Expression e1, Expression e2) {
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public boolean interpret(String context) {
		return e1.interpret(context) && e2.interpret(context);
	}

}
