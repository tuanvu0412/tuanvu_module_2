package ss4_oop_java.bai_tap.Quadratic;

import ss4_oop_java.bai_tap.Quadratic.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquationManagement {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a,b,c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        QuadraticEquation num = new QuadraticEquation(a, b, c);
        if (num.getDiscriminant() < 0) {
            System.out.println("chương trình vô nghiệm");
        } else if (num.getDiscriminant() == 0) {
            System.out.println("chương trình có một nghiệm" + num.getRoot1());
        } else {
            System.out.println("chương trình có 2 nghiệm là: ");
            System.out.println("nghiệm thứ nhất: " + num.getRoot1());
            System.out.println("nghiệm thứ hai: " + num.getRoot2());
        }
    }

}
