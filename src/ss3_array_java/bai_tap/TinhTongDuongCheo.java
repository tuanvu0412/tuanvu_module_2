package ss3_array_java.bai_tap;

import java.util.Scanner;

public class TinhTongDuongCheo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập hàng");
        int m = sc.nextInt();
        System.out.println("nhập cột");
        int n = sc.nextInt();
        int array[][]=new int[m][n];
        System.out.println("nhập cac phần tử trong mảng");
        for(int i = 0; i < array.length ;  i ++){
            for( int j = 0 ; j < array.length ; j++){
                System.out.println("A["+i+"]["+j+"]");
                array[i][j]=sc.nextInt();
            }
        }
        int num= 0 ;
        for(int i = 0 ; i < array.length ; i ++){
            for ( int j = 0 ; j < array[i].length ; j++){
                if(i==j||i +j==array[i].length-1){
                    num+=array[i][j];

                }
            }
        }
        System.out.println("tổng 2 đường chéo là: "+num);
    }
}
