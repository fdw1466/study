package other;

import java.util.HashMap;
import java.util.Map;

public class Other {

	public static void testThreadSleep() {
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println(i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("hehe");
	}

	public static void testEachMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "DWer");
		map.put(2, "QDen");

		for (Integer value : map.keySet()) {
			System.out.println(value + ":" + map.get(value));
		}
	}

	public static void testNewThread() {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println(this.getName());
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println(this.getName());
			}
		};

		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		// Other.testThreadSleep();
		// Other.testEachMap();
		//Other.testNewThread();
	}

}
