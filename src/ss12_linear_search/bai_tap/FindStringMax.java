package ss12_linear_search.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindStringMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        System.out.println("nhập chuỗi bất kì");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (list.size() >= 1 && str.charAt(i) <= list.getLast()) {
                list.clear();
            }
            list.add(str.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character s : max) {
            System.out.print(s);
        }

    }
}
