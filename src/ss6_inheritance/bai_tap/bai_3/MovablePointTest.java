package ss6_inheritance.bai_tap.bai_3;

public class MovablePointTest {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        System.out.println(p.toString());
        MovablePoint m = new MovablePoint(1, 2, 3, 5);
        System.out.println(m.move());


    }
}
