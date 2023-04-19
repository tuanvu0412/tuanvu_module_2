package ss13_sorting_agorithms.bai_tap;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số phân tử của mảng");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("nhập " + array.length + " value : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
            array[i] = sc.nextInt();
        }
        System.out.println("các phần tử trong mảng là : ");
        for (int j : array) {
            System.out.println(j+"");
        }
        System.out.println("bắt đầu sắp xếp...");
        insertionSortByStep(array);
    }

    public static void insertionSortByStep(int[] arr) {
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            flag = false;
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                flag = true;
                System.out.println(" đổi " + arr[j] + " với " + arr[j + 1]);
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        if (!flag) {
            System.out.println("mảng đã được sắp xếp không cần sắp xếp nữa");
        }
        for (int j : arr) {
            System.out.println(j + "");
        }
    }
}
