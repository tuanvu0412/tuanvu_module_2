package ss3_array_java.thuc_hanh;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm cần kiểm tra");
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;

    }
}
