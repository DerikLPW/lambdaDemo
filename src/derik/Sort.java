package derik;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 12, 54, 46, 45, 45, 145, 212, 123 };

		int[] arrayResult = xuanZeSortFlag(array);
		for (int i = 0; i < arrayResult.length; i++) {
			System.out.println(arrayResult[i]);
		}
	}

	/**
	 * 基本冒泡法排序
	 * 
	 * @param datas
	 * @return
	 */
	public static int[] maoPaoSortBase(int[] datas) {
		// 一共需要排序的次数: length-1
		for (int i = 0; i < datas.length - 1; i++) {
			System.out.println("外循环次数：" + i);
			// 每一次排序，从第一个开始，相邻两个比较，大的往后排
			for (int j = 0; j < datas.length - i - 1; j++) {
				if (datas[j] > datas[j + 1]) {
					int temp;
					temp = datas[j];
					datas[j] = datas[j + 1];
					datas[j + 1] = temp;
				}
			}
		}
		return datas;
	}

	/**
	 * 外循环优化：添加flag，标记是否发生交换
	 * 
	 * @param datas
	 * @return
	 */
	public static int[] maoPaoSortExt(int[] datas) {
		System.out.println("应执行外循环次数：" + (datas.length - 1));
		for (int i = 0; i < datas.length - 1; i++) {
			System.out.println("外循环次数：" + i);
			int flag = 0;
			for (int j = 0; j < datas.length - i - 1; j++) {
				if (datas[j] > datas[j + 1]) {
					int temp;
					temp = datas[j];
					datas[j] = datas[j + 1];
					datas[j + 1] = temp;
					flag = 1;
				}
			}

			if (flag == 0) {
				System.out.println("实际执行外循环次数：" + (i + 1));
				break;
			}
		}
		return datas;
	}

	/**
	 * 基本选择法排序
	 * 
	 * @param datas
	 * @return
	 */
	public static int[] xuanZeSortBase(int[] datas) {
		for (int i = 0; i < datas.length; i++) {
			for (int j = i + 1; j < datas.length; j++) {
				if (datas[i] < datas[j]) {
					int temp;
					temp = datas[i];
					datas[i] = datas[j];
					datas[j] = temp;
				}
			}
		}
		return datas;
	}

	/**
	 * 标记最小数
	 * 
	 * @param datas
	 * @return
	 */
	public static int[] xuanZeSortFlag(int[] datas) {
		for (int i = 0; i < datas.length; i++) {
			int min = i;
			// 每次记住最小值的下标，则每遍最多交换一次
			for (int j = i + 1; j < datas.length; j++) {
				if (datas[min] > datas[j]) {
					min = j;
				}
			}

			if (min != i) {
//				 int temp;
//				 temp = datas[min];
//				 datas[min] = datas[i];
//				 datas[i] = temp;
				
				datas[i] = datas[i] ^ datas[min];
				datas[min] = datas[i] ^ datas[min];
				datas[i] = datas[i] ^ datas[min];
				
		       //容易越界
//				datas[min] = datas[min] + datas[i];
//				datas[i] = datas[min]- datas[i];
//				datas[min] = datas[min] - datas[i];
			}
		}
		return datas;
	}

}
