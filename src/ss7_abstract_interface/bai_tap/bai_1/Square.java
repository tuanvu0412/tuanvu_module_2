package ss7_abstract_interface.bai_tap.bai_1;

public class Square extends Shape implements IResizeable {
    private double size = 1.0;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
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
    public String toString() {
        return "Square{" +
                "size= " + size + super.toString() +
                '}';
    }

    public void resize(double percent) {
        System.out.println(size + size * percent / 100);

    }
}
