package algorithm.Exhaustion;

import java.util.Scanner;

public class Exhaustion {

	/**
	 * 穷举算法（鸡兔同笼）
	 * 
	 * @param head
	 * @param foot
	 */
	public void exhaustion(int head, int foot) {
		int chicken, rabbit;
		for (chicken = 0; chicken < head; chicken++) {
			rabbit = head - chicken;
			if (chicken * 2 + rabbit * 4 == foot) {
				System.out.println("chicken=" + chicken + ",rabbit=" + rabbit);
			}
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("请输入头和脚的数量：");
		new Exhaustion().exhaustion(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt());
	}

}
