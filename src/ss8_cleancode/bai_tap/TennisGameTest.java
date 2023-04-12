package ss8_cleancode.bai_tap;

import java.util.Scanner;

public class TennisGameTest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int score1=Integer.parseInt(sc.nextLine());
        int score2=Integer.parseInt(sc.nextLine());
        System.out.println(TennisGame.getScore(score1,score2));

    }
}
