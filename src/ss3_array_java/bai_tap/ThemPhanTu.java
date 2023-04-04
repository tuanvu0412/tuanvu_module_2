package ss3_array.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;

public class ThemPhanTu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 1};
        System.out.println("mảng ban đầu: " + Arrays.toString(arr));
        int N = arr.length;
        arr = Arrays.copyOf(arr, N + 1);
        arr[N] = 10;
        System.out.println("mảng mới: " + Arrays.toString(arr));
    }
}
