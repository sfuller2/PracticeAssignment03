
public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		bubbleSort(a);
	}
	
	protected void bubbleSort(int[] arr) {
		boolean swapped = true;
		for(int i = 0; i < arr.length && swapped; i++) {
			swapped = false;
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j + 1);
					swapped = true;
				}
			}
		}
	}
	
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
