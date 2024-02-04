package search;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {56,5,0,1,99,101};
		
		int num = 99;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==num) {
				System.out.println(i);
			}
		}

	}

}
