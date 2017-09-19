
public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		insertionSort(a);
	}
	
	protected void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i ++) {
			int temp = arr[i];
			int j = i - 1;
			for(j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	}
}
