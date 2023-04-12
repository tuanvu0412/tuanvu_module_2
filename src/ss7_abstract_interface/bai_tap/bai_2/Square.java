package ss7_abstract_interface.bai_tap.bai_2;

public class Square extends Shape implements IColorable {
    private double size = 1.0;

    public Square() {

    }

    public Square(double size) {
        this.size = size;
    }

    public Square(boolean filled, String color, double size) {
        super(filled, color);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea() {
        return size * size;
    }

    @Override
    public void hơwToColor() {
        System.out.println(getColor()+"color all four side");
    }
}
