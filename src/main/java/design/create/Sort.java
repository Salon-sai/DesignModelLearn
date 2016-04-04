package design.create;

import java.util.Random;

public class Sort {

	public static void QuickSort(int[] array, int low ,int high)
	{
		if(low < high)
		{
			int pos = Partition(array, low, high);
			QuickSort(array, low, pos - 1);
			QuickSort(array,pos + 1, high);
		}
	}
	
	public static int Partition(int[] array, int low, int high)
	{
		int pivot = array[low];
		while(low < high)
		{
			while(low < high && array[high] >= pivot)high--;
			array[low] = array[high];
			while(low < high && array[low] <= pivot)low++;
			array[high] = array[low];
		}
		array[low] = pivot;
		return low;
	}
	
	public static int[] Martoriy()
	{
		int[] martoriy = new int[50];
		Random random = new Random();
		for(int i = 0; i < martoriy.length; i++)
		{
			int result = random.nextInt(41) + 10;
			martoriy[result]++;
		}
		return martoriy;
	}
}
