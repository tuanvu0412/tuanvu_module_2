package ss3_array_java.bai_tap;

import java.util.Scanner;

public class TinhTongMotCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập hàng");
        int m = sc.nextInt();
        System.out.println("nhập cột");
        int n = sc.nextInt();
        int array[][] = new int[m][n];
        System.out.println("nhập các phần tử");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("A[" + i + "]["+j+"]");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("nhập cột muốn tính");
        int total= sc.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
                    sum += array[i][total];
        }
        System.out.println("tổng của cột là: "+sum);

    }
}