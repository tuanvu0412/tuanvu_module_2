package SS1_Introduction_java.bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name= sc.nextLine();
        System.out.println("Hello "+ name);
    }
}
