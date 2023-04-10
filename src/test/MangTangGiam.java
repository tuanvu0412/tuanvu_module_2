package test;

import java.util.Scanner;

public class BuildArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử của mảng");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("nhập các phần tử của mảng");
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            array[i] = sc.nextInt();
        }
        check(array);
        System.out.println("dãy số tăng dần là: ");
        show(array);
        System.out.println("dãy số giảm dần là: ");
        check2(array);
        show(array);
    }

    public static void check(int[] array) {
        int newArray = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    newArray = array[j];
                    array[j] = array[i];
                    array[i] = newArray;
                }

            }

        }
    }

    public static void check2(int[] array) {
        int newArray = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    newArray = array[j];
                    array[j] = array[i];
                    array[i] = newArray;
                }

            }

        }
    }

    public static void show(int[] array) {
        for (int j : array) {
            System.out.println(j + " ");

        }
    }
}
