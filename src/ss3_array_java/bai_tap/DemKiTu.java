package ss3_array_java.bai_tap;

import java.util.Scanner;

public class DemKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập kí tự để check");
        String a = sc.nextLine();
        char man='i';
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)==man){
                count++;
            }
            System.out.println("số kí tự bạn đếm xuất hiện :"+ count + "lần");
        }
    }
}
