package designPattern.action.VisitorPattern;

public class Computer implements ComputerPart {

	ComputerPart[] parts;

	public Computer() {
		parts = new ComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
	}

	@Override
	public void accept(ComputerPartVisitor compterPartVisitor) {
		for (int i = 0; i < parts.length; i++) {
			parts[i].accept(compterPartVisitor);
		}
		compterPartVisitor.visit(this);
	}

}
