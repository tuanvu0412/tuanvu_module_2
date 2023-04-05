package ss3_array_java.thuc_hanh;

import java.util.Scanner;

public class SoNguyenTo {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số cần check");
        int number = sc.nextInt();
        System.out.println(isPrime(number));
    }
}
