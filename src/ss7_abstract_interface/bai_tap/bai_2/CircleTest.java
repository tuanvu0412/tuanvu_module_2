package ss7_abstract_interface.bai_tap.bai_2;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(false,"blue",3);
        System.out.println(circle);
        circle = new Circle(true, "red",3);
        System.out.println(circle);
    }

}
