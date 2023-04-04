package SS1_Introduction_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quyDoi = usd * vnd;
        System.out.println("giá trị VND: " + quyDoi);

    }
}
