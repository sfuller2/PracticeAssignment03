
public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		selectionSort(a);

	}
	
	protected void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int smallest = smallest(arr, i);
			swap(arr, smallest, i);
		}
	}
	
	private int smallest(int[] arr, int start) {
		int smallest = start;
		for(int i = start + 1; i < arr.length; i++) {
			if(arr[i] < arr[smallest]) {
				smallest = i;
			}
		}
		return smallest;
	}
	
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
