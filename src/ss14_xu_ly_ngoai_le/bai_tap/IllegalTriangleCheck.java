package ss14_xu_ly_ngoai_le.bai_tap;

import java.util.Scanner;

public class IllegalTriangleCheck {
    public void illegalTriangleException(double a, double b, double c) throws IllegalAccessException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalAccessException("các cạnh của tam giác phải lớn hơn 0");
        } else if (a + b <= c || b + c <= a || a + c <= b) {
            throw new IllegalAccessException("lỗi: tam giác không hợp lệ");
        } else {
            System.out.println("là tam giác hợp lệ");
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        IllegalTriangleCheck check = new IllegalTriangleCheck();
        double a = 0;
        double b = 0;
        double c = 0;
        System.out.println("nhập vào cạnh thứ nhất: ");
        try {
            a = sc.nextInt();
        } catch (NumberFormatException e) {
            System.err.println("phải nhập số, không thể nhập chữ");
        }
        System.out.println("nhập vào cạnh thứ hai: ");
        try {
            b = sc.nextInt();
        } catch (NumberFormatException e) {
            System.err.println("phải nhập số, khong thể nhập chữ");
        }
        System.out.println("nhập vào cạnh thứ ba: ");
        try {
            c = sc.nextInt();
        } catch (NumberFormatException e) {
            System.err.println("phải nhập số, không thể nhập chữ");
        }
        check.illegalTriangleException(a, b, c);
    }
}
