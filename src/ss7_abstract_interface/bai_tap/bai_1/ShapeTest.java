package ss7_abstract_interface.bai_tap.bai_1;

public class ShapeTest extends Shape {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        Circle circle = new Circle("green", false, 4.5);
        Retangle retangle = new Retangle("blue", false, 4, 6);
        Square square = new Square("red", true, 4);
        shape[0] = circle;
        shape[1] = retangle;
        shape[2] = square;
        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i].toString());
            shape[i].resize(Math.random() * 100);
        }
    }
}
