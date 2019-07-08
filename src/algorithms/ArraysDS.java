package algorithms;

import java.util.Arrays;

public class ArraysDS {

	public static void main(String[] args) {
		
		int[] a = {1,4,3,2};
		
		System.out.println(Arrays.toString(reverseArray(a)));

	}
	
	public static int[] reverseArray(int[] a) {
		
		int[] resultArr = new int[a.length];
		int j = 0;
		for (int i=a.length-1; i>=0; i--) {
			resultArr[j] = a[i];
			j++;
		}
		return resultArr;
	}

}
