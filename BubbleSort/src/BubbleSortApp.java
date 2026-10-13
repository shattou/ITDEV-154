package bubblesort;

public class BubbleSortApp {

	public static void main(String[] args) {
		 BubbleSort bsrt = new BubbleSort();
		 int maxSize = 16; // array size
		 int [ ] arr = new int [maxSize];
		 for(int j=0; j<maxSize; j++) // fill array with
		 { // random numbers
		 int n = (int)(java.lang.Math.random()*99);
		 arr[j] = n;
		 }
		 for (int index = 0; index < maxSize; index++)
		 System.out.print(arr[index] + " ");
		 System.out.println("\n\n");

		 long start = System.nanoTime();
		 bsrt.bubbleSrt(arr);
		 long end = System.nanoTime();

		 System.out.println("\n\nThe time required to do the sort was " + (end - start) + " nanoseconds");
	}

}
