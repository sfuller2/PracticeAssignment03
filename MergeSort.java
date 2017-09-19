
public class MergeSort implements SortingAlgorithm {

	public void sort(int[] a) {
		int low = 0;
		int high = a.length-1;
		mergeSort(a, low, high);
		
	}
	
	/*Plan:
	*Split the array into little baby arrays of length 1, do this recursively splitting at the middle
	*Once they're all tiny arrays, call merge to sort them and place them back together
	*/
	
	void mergeSort(int[] array, int low, int high){
		if(low < high){
			int middle = (low + high) / 2;
			mergeSort(array, low, middle);
			mergeSort(array, middle+1, high);
			merge(array, low, middle, high);
		}	
	}

	void merge(int[] array, int low, int middle, int high){
		//initialize temp array of the same length and copy all the elements over
		int[] temp = new int[array.length];
		for (int i = low; i <= high; i++) {
			temp[i] = array[i];
		}
		
		//initialize temp index positions to compare to the elements of the indices of array
		int tempLow = low;
		int tempHigh = middle+1;
		int current = low;
		
		//while tempLow is less than the middle of array and tempHigh is less than the end of array
		while (tempLow <= middle && tempHigh <=high) {
			if(temp[tempLow] <= temp[tempHigh]){ //compare the values 
				array[current] = temp[tempLow]; //if its lower, place into the array at the current index
				tempLow++;
				
			}else{ //if tempHigh is greater, place tempHigh in current index in array
				array[current] = temp[tempHigh];
				tempHigh++;
			}
			current ++; //increment the current index of array
		}
		
		int remaining = middle - tempLow; //copy down the remaining elements if we run out of elements to compare 
		for (int i = 0; i <= remaining; i++) {
			array[current+i] = temp[tempLow+ i];
		}
	}
}
