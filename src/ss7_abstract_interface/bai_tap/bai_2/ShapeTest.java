package ss7_abstract_interface.bai_tap.bai_2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        shapes[0]  = new Circle ( 2);
        shapes[1]  = new Retangle(4, 5);
        shapes[2]  = new Square( 4);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
            if (shapes[i] instanceof IColorable) {
                ((IColorable) shapes[i]).hơwToColor();
            }
        }


    }
}
