package designPattern.action.VisitorPattern;

public interface ComputerPart {
	void accept(ComputerPartVisitor compterPartVisitor);
}
