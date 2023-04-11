package ss7_abstract_interface.bai_tap.bai_2;

public class Retangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Retangle() {

    }

    public Retangle(double width, double height) {
        this.width = width;
        this.length = height;
    }

    public Retangle(String color, boolean filled, double width, double length) {
        super(filled, color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setHeight(double height) {
        this.length = height;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + getWidth() +
                ", height=" + getLength() + super.toString() +
                '}';
    }

}
