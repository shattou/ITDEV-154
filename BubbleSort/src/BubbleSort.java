package bubblesort;

import java.util.Arrays;

public class BubbleSort {
	void bubbleSrt(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println("Pass " + (i + 1) + ", Interation " + (j + 1) + ": " + Arrays.toString(arr));
            }
        }
    }

}
