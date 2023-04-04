package ss3_array.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập số dòng của ma trận");
        int m = sc.nextInt();
        System.out.println("nhập số cột của ma trận");
        int n= sc.nextInt();
        int array[][]=new int[m][n];
        System.out.println("nhập các phần tử cho ma trận");
        for(int i = 0 ; i < m; i ++){
            for (int j = 0 ; j < n  ; j ++){
                System.out.println("A["+i+"]["+j+"]");
                array[i][j]= sc.nextInt();
            }
        }
        int max=array[0][0];
        for(int i =0 ; i < m ; i ++){
            for( int j = 0 ; j < n ; j ++){
                if(max < array[i][j]){
                    max=array[i][j];
                }
            }
        }
        System.out.println("phần tử lớn nhất của mảng là: "+max);
    }
}
