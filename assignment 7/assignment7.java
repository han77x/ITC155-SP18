package ch13;

import java.util.Arrays;

public class assignment7 {

public static void main(String[] args) {
		
		int list[]= {12, 123, 1, 28, 183, 16};
		selectionSort (list);
		System.out.println(Arrays.toString(list));
		}

		public static void swap(int[] list, int i, int b) {
			int temp = list[i];
			list[i] = list[b];
			list[b] = temp;
}
	
	public static void selectionSort(int[] a) {
		
		for(int i = a.length - 1; i >= 0; i--) {
			
			//find index of largest element
			int  largest = i;
			for(int b = i - 1; b >= 0; b--) {
				
				//if next index is larger than the current largest
				//update largest element
				if(a[b] > a[largest]) {
					largest = b;
				}
			}
			swap(a, i, largest);
		}
	}

}
