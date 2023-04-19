package ss13_sorting_agorithms.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] newArray = {3, 2, 5, 8, 1, 6, 4};
        insertionSort(newArray);
        System.out.println(Arrays.toString(newArray));

    }
}
