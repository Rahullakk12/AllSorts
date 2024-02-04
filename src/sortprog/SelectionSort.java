package sortprog;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String args[]) {
		int arr[] = { 56, 5, 0, 1, 99, 101 , 3, 9, 73};

		int len = arr.length - 1;
		for (int i = 0; i < len; i++) {
			for (int j = len; j > i; j--) {
				if (arr[j] < arr[i]) {

					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
