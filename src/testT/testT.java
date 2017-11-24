package testT;

public class testT<T> {
	private int a;
	private T b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}

	public static void main(String[] args) {
		testT<String> t = new testT<String>();
		t.setA(1);
		t.setB("b");
		System.out.println(t.getA() + "," + t.getB());
	}

}
