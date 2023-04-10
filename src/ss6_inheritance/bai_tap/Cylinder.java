package ss6_inheritance.bai_tap;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
}
