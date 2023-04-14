package ss10_stack_queue.bai_tap.decimal;

import java.util.Scanner;
import java.util.Stack;

public class DecimalBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập một số bất kì ");
        int n = Integer.parseInt(sc.nextLine());
        while (n != 0) {
            int display = n % 2;
            stack.push(display);
            n /= 2;
        }
        System.out.println(stack);
    }

}
