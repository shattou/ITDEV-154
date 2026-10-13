package partitionsort;

public class Partition {

	public int medianOfThree(int[] data, int left, int right) {
		int center = (left + right) / 2;
		// order left & center
		if (data[left] > data[center])
			swap(data, left, center);
		// order left & right
		if (data[left] > data[right])
			swap(data, left, right);
		// order center & right
		if (data[center] > data[right])
			swap(data, center, right);

		swap(data, center, right - 1); // put pivot on right
		return data[right - 1]; // return median value
	}

	public int partition(int[] data, int left, int right, int pivot) {
		int leftPtr = left; // right of first elem
		int rightPtr = right - 1; // left of pivot
		while (true) {
			while (data[++leftPtr] < pivot) // find bigger
				; // (nop)
			while (data[--rightPtr] > pivot) // find smaller
				; // (nop)
			if (leftPtr >= rightPtr) // if pointers cross,
				break; // partition done
			else // not crossed, so
				swap(data, leftPtr, rightPtr); // swap elements
		} // end while(true)
		swap(data, leftPtr, right - 1); // restore pivot
		return leftPtr; // return pivot location
	}
	
	private static void swap(int[] data, int i, int j) {
	    int temp = data[i];
	    data[i] = data[j];
	    data[j] = temp;
	}
}
