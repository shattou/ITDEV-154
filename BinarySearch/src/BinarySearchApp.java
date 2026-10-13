package binarysearch;

import java.util.Scanner;

public class BinarySearchApp {
	
	public static int binarySearchAlgorithm(int element, int[] orderedArray) {
	    int left = 0;
	    int right = orderedArray.length - 1;
	    int middle;

	    while (left <= right) {
	        middle = (left + right) / 2;
	        if (orderedArray[middle] == element) {
	            return middle;
	        } else if (orderedArray[middle] < element) {
	            left = middle + 1;
	        } else {
	            right = middle - 1;
	        }
	    }
	    return -1;
	}
	
	public static void main(String[] args) {
        int[] orderedArray = {8, 10, 12, 15, 19, 22, 28, 31, 34, 42, 47, 54, 60, 66, 72, 78, 80, 81, 94, 98, 100};
        int element, index;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an element to find in the ordered array: ");
        element = keyboard.nextInt();
        
        index = binarySearchAlgorithm(element, orderedArray);

        if (index < 0)
            System.out.println("\n\nElement " + element + " does not exist in this array");
        else
            System.out.println("\n\nElement " + element + " resides at index " + index);
    }
	
	
}
