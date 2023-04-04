package ss2_loop_array.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        boolean check = false;
        for (int i = 0; i < number; i++) {
            if (number >= 2 && number <= 3) {
                check = true;
                count++;
            } else {
                for (int j = 2; j < Math.sqrt(number); j++) {
                    if (number% j == 0) {
                        check = true;
                        count++;
                        break;
                    }

                }
                if (check == false) {
                    System.out.println(number + "không phải là số nguyên tố");
                } else if (count == 0) {
                    System.out.println(number + "là số nguyên tố");
                } else if (check = true) {
                    System.out.println(number + "là số nguyên tố");
                } else {
                    System.out.println("không phải là số nguyên tố");
                }
            }

        }
    }
}
