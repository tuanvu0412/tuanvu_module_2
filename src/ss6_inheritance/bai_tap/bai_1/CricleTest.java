package ss6_inheritance.bai_tap.bai_1;

public class CricleTest {
    public static void main(String[] args) {
        Circle c= new Circle();
        c.setRadius(5);
        System.out.println("Cricle Area:"+ c.getRadius());
        Cylinder l= new Cylinder(c.getRadius(),c.getColor(),15);
        System.out.println(l.getTotalArea());
    }
}
