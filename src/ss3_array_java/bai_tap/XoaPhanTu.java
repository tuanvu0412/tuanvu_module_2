package ss3_array_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 8, 10, 14};
        int[] arr = new int[array.length-1];
        int number =6;
        int num=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                arr[num] = array[i];
                num++;
            }
        }
        System.out.println("trước khi xóa: " + Arrays.toString(array));
        System.out.println("sau khi xóa: "+ Arrays.toString(arr));

    }
}

