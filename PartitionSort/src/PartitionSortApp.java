package partitionsort;

public class PartitionSortApp {
		public static void main(String[] args) {
			final String BLANKS = " ";
			int pivot, partition;
			int[] data = { 100, 80, 23, 50, 88, 70, 60, 90, 20, 72, 40, 8, 9 };

			Partition part = new Partition();
			Insertion is = new Insertion();

			// Print the array before sorting:
			System.out.println("Here is the entire original array:");
			for (int i : data) {
				System.out.print(i + BLANKS);
			}
			System.out.println();

			// Calculate the pivot and partition the array
			pivot = part.medianOfThree(data, 0, data.length - 1);
			partition = part.partition(data, 0, data.length - 1, pivot);

			// Display pivot and partition
			System.out.println("\nThe pivot is " + pivot + " and the partition is at index " + partition);

			// Display the partitioned array
			System.out.println("\nAfter partitioning the numbers are now:");
			for (int i : data) {
				System.out.print(i + BLANKS);
			}
			System.out.println();

			// Sort the lower partition using insertion sort
			is.insertionSort(data, 0, partition - 1);

			// Display the array after sorting the lower partition
			System.out.println("\nAfter sorting the lower partition numbers are now:");
			for (int i : data) {
				System.out.print(i + BLANKS);
			}
			System.out.println();

			// Sort the upper partition using insertion sort
			is.insertionSort(data, partition + 1, data.length - 1);

			// Display the entire sorted array
			System.out.println("\nAfter sorting the upper partition numbers are now:");
			for (int i : data) {
				System.out.print(i + BLANKS);
			}
			System.out.println("\n\nThe entire array is now sorted");
		}
	}

