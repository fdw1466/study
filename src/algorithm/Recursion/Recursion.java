package algorithm.Recursion;

public class Recursion {

	/**
	 * 递推算法
	 * 
	 * @param args
	 */
	public int sum(int n) {
		int fn_1, fn_2;
		int fn = 0;
		if (n == 1)
			fn = 3; // 初始化当n=1和n=2时的临界条件
		else if (n == 2)
			fn = 7;
		else {
			fn_1 = 7;
			fn_2 = 3;
			for (int j = 3; j <= n; j++) {
				fn = 2 * fn_1 + fn_2; // 当n>=3时fn的通式
				fn_2 = fn_1;// 更新fn_1和fn_2的值
				fn_1 = fn;
			}
		}
		return fn;
	}

	/**
	 * 递归算法
	 * 
	 */
	public int sum2(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + sum2(n - 1);
		}
	}

	public static void main(String[] args) {
		Recursion r = new Recursion();
		System.out.println("一共有：" + r.sum(3) + "种走法");
		System.out.println("1加到10的和为:" + r.sum2(10));
	}

}
