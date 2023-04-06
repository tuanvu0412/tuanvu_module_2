package ss4_oop_java.bai_tap.Fan;

import ss4_oop_java.bai_tap.Fan.Fan;

public class FanManagement {
    public static void main(String[] args) {
        Fan Fan1 = new Fan(3, true, 10, "yellow");
        Fan Fan2 = new Fan(2, true, 5, "blue");
        Fan Fan3 = new Fan(1, false, 5, "red");
        System.out.println(Fan1.toString());
        System.out.println(Fan2.toString());
        System.out.println(Fan3.toString());
    }


}
