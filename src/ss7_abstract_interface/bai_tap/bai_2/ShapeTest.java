package ss7_abstract_interface.bai_tap.bai_2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle = new Circle(false, "blue", 2);
        Retangle retangle = new Retangle("green", false, 4, 5);
        Square square = new Square(false, "red", 4);
        shapes[0] = circle;
        shapes[1] = retangle;
        shapes[2] = square;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Square) {
                shapes[i] = (Square) shapes[i];
                System.out.println(((Square) shapes[i]).getArea());
            } else if (shapes[i] instanceof Retangle) {
                shapes[i] = (Retangle) shapes[i];
                System.out.println(((Retangle) shapes[i]).getArea());
            } else if (shapes[i] instanceof Circle) {
                shapes[i] = (Circle) shapes[i];
                System.out.println(((Circle) shapes[i]).getArea());
            }
            if (shapes[i] instanceof IColorable) {
                ((IColorable) shapes[i]).hơwToColor();
            }
        }


    }
}
