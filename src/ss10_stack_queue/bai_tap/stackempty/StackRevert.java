package ss10_stack_queue.bai_tap.stackempty;

import java.util.Stack;

class StackRevert {
    public static String ReverseString(String str) {
        char[] wStack = new char[str.length()];
        Stack<Character> mWord = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            mWord.push(str.charAt(i));
        }
        int i = 0;
        while (!mWord.isEmpty()) {
            wStack[i++] = mWord.pop();
        }
        return new String(wStack);
    }

    public static void main(String[] args) {
        String str1 = "Đặng Tuấn Vũ";
        System.out.println(str1 + " <- Reverse -> " + ReverseString(str1));
        String str2 = "Hello World";
        System.out.println(str2 + " <- Reverse -> " + ReverseString(str2));
    }
}