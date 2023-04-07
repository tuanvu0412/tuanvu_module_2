package ss5_access_modifier.bai_tap.bai_1;

public class Circle {
    private double radius = 5.0;
    private String color = "red";
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;

    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }
}
