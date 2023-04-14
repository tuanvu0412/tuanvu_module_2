package ss10_stack_queue.bai_tap.stackempty;

import java.util.Scanner;
import java.util.Stack;

public class StackEmpty {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập các phần tử : " + i);
            array[i] = scanner.nextInt();
            stack.push(array[i]);
        }
        System.out.println(stack);
        int s;
        for (int i = 0; i < n; i++) {
            s = stack.pop();
            System.out.print(s);
        }
    }

}
