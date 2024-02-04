	package sortprog;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String args[]) {
		int arr[] = {56,5,0,1,99,101};
		int len = arr.length-1;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
