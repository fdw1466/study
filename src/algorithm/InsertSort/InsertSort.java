package algorithm.InsertSort;

import java.util.Random;

public class InsertSort {

	/*
	 * 从前向后查找的插入排序
	 * 
	 * @param pDataArray
	 * 
	 * @param iDataNum
	 */
	public void insertSort(int[] pDataArray, int iDataNum) {
		long start = System.currentTimeMillis();
		for (int i = 1; i < iDataNum; i++) // 从第2个数据开始插入
		{
			int j = 0;
			while (j < i && pDataArray[j] <= pDataArray[i]) // 寻找插入的位置
				j++;

			if (j < i) // i位置之前，有比pDataArray[i]大的数，则进行挪动和插入
			{
				int k = i;
				int temp = pDataArray[i];
				while (k > j) // 挪动位置
				{
					pDataArray[k] = pDataArray[k - 1];
					k--;
				}
				pDataArray[k] = temp; // 插入
			}
		}
		System.out.println("耗时：" + (System.currentTimeMillis() - start));
	}

	/**
	 * 从后向前查找的插入排序
	 * 
	 * @param pDataArray
	 * @param iDataNum
	 */
	void insertSort2(int[] pDataArray, int iDataNum) {
		long start = System.currentTimeMillis();
		for (int i = 1; i < iDataNum; i++) // 从第2个数据开始插入
		{
			int j = i - 1;
			int temp = pDataArray[i]; // 记录要插入的数据
			while (j >= 0 && pDataArray[j] > temp) // 从后向前，找到比其小的数的位置
			{
				pDataArray[j + 1] = pDataArray[j]; // 向后挪动
				j--;
			}

			if (j != i - 1) // 存在比其小的数
				pDataArray[j + 1] = temp;
		}
		System.out.println("耗时：" + (System.currentTimeMillis() - start));
	}

	// 查找数值iData在长度为iLen的pDataArray数组中的插入位置
	int FindInsertIndex(int[] pDataArray, int iLen, int iData) {
		int iBegin = 0;
		int iEnd = iLen - 1;
		int index = -1; // 记录插入位置
		while (iBegin <= iEnd) {
			index = (iBegin + iEnd) / 2;
			if (pDataArray[index] > iData)
				iEnd = index - 1;
			else
				iBegin = index + 1;
		}
		if (pDataArray[index] <= iData)
			index++;
		return index;
	}

	/********************************************************
	 * 函数名称：BinaryInsertSort 参数说明：pDataArray 无序数组； iDataNum为无序数据个数 说明： 二分查找插入排序
	 *********************************************************/
	void BinaryInsertSort(int[] pDataArray, int iDataNum) {
		long start = System.currentTimeMillis();
		for (int i = 1; i < iDataNum; i++) // 从第2个数据开始插入
		{
			int index = FindInsertIndex(pDataArray, i, pDataArray[i]); // 二分寻找插入的位置

			if (i != index) // 插入位置不为i，才挪动、插入
			{
				int j = i;
				int temp = pDataArray[i];
				while (j > index) // 挪动位置
				{
					pDataArray[j] = pDataArray[j - 1];
					j--;
				}
				pDataArray[j] = temp; // 插入
			}
		}
		System.out.println("耗时：" + (System.currentTimeMillis() - start));
	}

	public static void main(String[] args) {
		int[] array = new int[100000];
		for (int i = 0; i < 100000; i++) {
			array[i] = new Random().nextInt(100000);
		}
		// new InsertSort().insertSort(array, array.length);
		// new InsertSort().insertSort2(array, array.length);
		// new InsertSort().BinaryInsertSort(array, array.length);
	}
}
