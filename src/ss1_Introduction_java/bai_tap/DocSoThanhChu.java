package SS1_Introduction_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số muốn đọc dưới 3 chữ số :");
        int number = Integer.parseInt(scanner.nextLine());
        int[] so = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] chuoiSo1 = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] chuoiSo2 = {" ", "one", "twen", "thir", "for", "fif", "six", "seven", "eight", "nine"};
        switch ((number + "").length()) {
            case 1:
                for (int i = 0; i < so.length; i++) {
                    if (number == so[i]) {
                        System.out.println(chuoiSo1[i]);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < so.length; i++) {
                    if (number == 10) {
                        System.out.println("ten");
                        break;
                    } else if (number == 11) {
                        System.out.println("eleven");
                        break;
                    } else if (number == 12) {
                        System.out.println("twelve");
                        break;
                    } else if (number == 13) {
                        System.out.println("thirteen");
                        break;
                    } else if (number < 20) {
                        System.out.println(chuoiSo1[i] + "teen");
                    } else {
                        System.out.println(chuoiSo2[number / 10] + "ty " + chuoiSo1[number % 10]);
                        break;
                    }
                }
            case 3:
                for (int i = 0; i < so.length; i++) {
                    if ((number - (number / 100 * 100)) == 11) {
                        System.out.println(chuoiSo1[number / 100] + "Hundred" + "Eleven");
                        break;
                    } else if ((number - (number / 100 * 100)) == 12) {
                        System.out.println(chuoiSo1[number / 100] + "Hundred" + "Twelve");
                        break;
                    } else if ((number - (number / 100 * 100)) == 13) {
                        System.out.println(chuoiSo1[number / 100] + "Hundred" + "Thirteen");
                        break;
                    } else {
                        System.out.println(chuoiSo1[number / 100] + " Hundred " + chuoiSo2[(number - (number / 100 * 100)) / 10] + chuoiSo1[(number / 100) / 10]);
                        break;

                    }
                }
        }
    }
}