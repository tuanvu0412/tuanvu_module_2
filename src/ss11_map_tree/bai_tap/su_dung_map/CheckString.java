package ss11_map_tree.bai_tap.su_dung_map;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CheckStringg{
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi để kiểm tra");
        String str = sc.nextLine();
        String[] newArray = str.split(" ");
        for (String s : newArray) {
            String str1 = s.toLowerCase(Locale.ROOT);
            if (map.containsKey(str1)) {
                map.put(str1, map.get(str1) + 1);
            } else {
                map.put(str1, 1);
            }
        }
        System.out.println(map);
    }
}