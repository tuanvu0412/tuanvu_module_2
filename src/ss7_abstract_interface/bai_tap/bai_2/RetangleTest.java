package ss7_abstract_interface.bai_tap.bai_2;

public class RetangleTest {
    public static void main(String[] args) {
        Retangle retangle = new Retangle();
        System.out.println(retangle);
        retangle = new Retangle(3, 2);
        System.out.println(retangle);
        retangle = new Retangle("blue", false, 2, 3);
        System.out.println(retangle);
    }
}
