package ss10_stack_queue.bai_tap.breaket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập kí tự bất kì");
        String str = sc.nextLine();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                right.push(str.charAt(i));
            } else if (str.charAt(i) == '(') {
                left.push(str.charAt(i));
            }
            if (right.size() > left.size()) {
                flag = false;
                break;
            }

        }
        if (flag == true && left.size() == right.size()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

