package ss4_oop_java.thuc_hanh;

import java.util.Scanner;

public class BuildArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập số lượng phần tử");
        int n = sc.nextInt();
        int[]array=new int[n];
        System.out.println("nhập các phần tử trong mảng");
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            array[i]=sc.nextInt();
        }
        System.out.println("các phần tử của mảng");
        show(array);
    }
    public static void show(int[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");

        }
    }
}
