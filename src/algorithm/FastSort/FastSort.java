package algorithm.FastSort;

/**
 * 快速排序
 * @author Administrator
 *
 */
public class FastSort {

	void fastSort(int[] v, int left, int right) {
		if (left < right) {
			int key = v[left];
			int low = left;
			int high = right;
			while (low < high) {
				while (low < high && v[high] > key) {
					high--;
				}
				v[low] = v[high];
				while (low < high && v[low] < key) {
					low++;
				}
				v[high] = v[low];
			}
			v[low] = key;
			fastSort(v, left, low - 1);
			fastSort(v, low + 1, right);
		}
	}

	public static void main(String[] args) {
		int[] v = new int[] { 4, 1, 3, 2, 5 };
		new FastSort().fastSort(v, 0, v.length - 1);
	}

}
