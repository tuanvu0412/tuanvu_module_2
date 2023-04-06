package ss4_oop_java.bai_tap.StopWatch;

import java.util.Scanner;

public class StopWatchManagement {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("nhập bất kì");
        watch.end();
        System.out.println(watch.getElapsedTime());

    }
}
