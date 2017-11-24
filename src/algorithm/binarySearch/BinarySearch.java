package algorithm.binarySearch;

public class BinarySearch {

	public static int binarySearch(int[] array, int res) {
		return binarySearch(array, 0, array.length - 1, res);
	}

	/**
	 * 二分查找
	 * @param array
	 * @param low
	 * @param high
	 * @param res
	 * @return
	 */
	public static int binarySearch(int[] array, int low, int high, int res) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (res == array[mid])
			return mid;
		else if (res < array[mid]) {
			return binarySearch(array, low, mid - 1, res);
		} else
			return binarySearch(array, mid + 1, high, res);
	}

	public static void main(String[] args) {
		System.out.println(BinarySearch.binarySearch(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 4));
	}

}
