package ss10_stack_queue.bai_tap.palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chuỗi bất kì");
        String str = sc.nextLine();
        String[] array = str.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque();
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            queue.add(array[i]);
        }
        System.out.println(stack);
        System.out.println(queue);
        boolean flag= false;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            if (stack.pop()!=queue.poll()) {
                flag= true;
                break;
            }
        }
        System.out.println(flag);
    }
}
