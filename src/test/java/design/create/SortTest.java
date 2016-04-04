package design.create;

import java.util.Random;

import org.junit.Test;

public class SortTest {

	@Test(timeout = 200)
	public void test() throws Exception {
		int[] a = new int[100000];
		Random random = new Random();
		for(int i = 0; i < a.length; i++)
		{
			a[i] = random.nextInt(50);
		}
		Sort.QuickSort(a, 0, a.length - 1);		
	}
	
}
