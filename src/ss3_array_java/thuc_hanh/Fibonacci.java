package ss3_array_java.thuc_hanh;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void checkFibonacci() {
        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        while (fn < 100) {
            System.out.println(fn);
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;

        }
    }

    public static void main(String[] args) {
        checkFibonacci();
    }
}
