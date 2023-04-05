package ss3_array_java.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class TimUocSo {
    public static int checkSize(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] timUocSo(int number) {
        checkSize(number);
        int count = 0;
        int[] array = new int[checkSize(number)];
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                array[count] = i;
                count++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số cần check");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(Arrays.toString(timUocSo(number)));
    }
}
