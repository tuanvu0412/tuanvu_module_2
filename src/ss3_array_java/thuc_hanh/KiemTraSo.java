package ss3_array_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSo {
    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra");
        int num = sc.nextInt();
        System.out.println(isOdd(num));
    }
}
