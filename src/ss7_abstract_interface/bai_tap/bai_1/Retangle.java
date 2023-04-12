package ss7_abstract_interface.bai_tap.bai_1;

public class Retangle extends Shape implements IResizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Retangle() {

    }

    public Retangle(double width, double height) {
        this.width = width;
        this.length = height;
    }

    public Retangle(String color, boolean filled, double width, double length) {
        super(color, filled);
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

    public void setLength(double Length) {
        this.length = Length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Retangle{Area" + getArea()+
                "width = " + getWidth() +
                ", height = " + getLength() + super.toString() +
                '}';
    }

    @Override
    public void resize(double percent) {
        setWidth(width + width * percent / 100);
        setLength( + length * percent / 100);
    }
}
