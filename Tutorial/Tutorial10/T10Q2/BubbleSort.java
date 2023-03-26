package T10Q2;

import java.util.Arrays;

public class BubbleSort extends SortingAlgorithm {
	BubbleSort() {
		super("Bubble Sort");
	}
	
	@Override
	public void sort(int[] arr) {
		boolean hasSwap = false;
		for(int i = 0; i < arr.length; i++) {
			hasSwap = false;
			System.out.printf(" %3d --> %s\n", (i + 1), Arrays.toString(arr));
			
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					if(j == 0)
						printPos(j, j + 1, MAIN_DECOR);
					else
						printPos(j, j + 1, SUB_DECOR);
					swap(arr, j, j + 1);
					hasSwap = true;
				}
				System.out.printf("   %3d.%-3d --> %s\n", (i + 1), (j + 1), Arrays.toString(arr));
				
			}
			
			if(!hasSwap) 
				break;
		}
	}
}
