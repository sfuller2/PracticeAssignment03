
public class QuickSort implements SortingAlgorithm {

	public void sort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}
	
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public int partition(int []a, int top, int bot) {
	/* Plan: 
	 *  a)Start i at "top" (lowest index) and loop down (forward) until a[i] > a[pivot] * 
	 *  b)Start j at "bot" and loop up until a[j] < a[pivot] *  
	 *  c)Where appropriate, swap a[i] and a[j], but keep an eye on the pivot at all times 
	 *  d) return i since that's either exactly where the pivot is or near enough. */
		int i = top;  
		//Loop down from here.
		int j = bot;  
		//Loop up from here.
		int pivot = (top + bot) /2;   
		// One of several pivot selection strategies.
		while (i <= j) {
			// Find a large value (greater than pivot) in the start of the (sub-)array
			while(a[i] < a[pivot]) {
				i++;
			}
				//Find a small value in the end of the (sub-)array
			while(a[j] > a[pivot]){
				j--;
			}
		// Swap these values, if appropriate.
			if(i <= j) {
			// ... but first: make sure to keep track of the pivot even if it moves.
				if(i == pivot){
					pivot = j;
				}
				else if (j == pivot) {
					pivot =  i;
					
				}
				swap(a, i++, j--);
			}
		//That's all. Return the pivot location (or close enough to it).
		}
		return i;
	}
	
		//Quick sort: a recursive algorithm for sorting.
	public void quickSort(int[] a,int top, int bot) {
		// Call partition to divide the array. Everything above pivot is smaller than everything below.
		int pivot = partition(a, top, bot);
		// Recursively call quick sort on the top and bottom sub-arrays.
		if (top < pivot-1) {
			//Base case 1: must have at least 1 element to sort
			quickSort(a, top, pivot-1);
		}	
		if (pivot < bot) {
			// Base case 2: same for the bottom subarray
			quickSort(a, pivot, bot);	
		}
		
	}
}


