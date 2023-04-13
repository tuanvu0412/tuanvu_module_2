package ss9_arraylist.bai_tap.bai_2;

public class ModelStudent extends Person {
    private String className;
    private int point ;

    public ModelStudent() {

    }

    public ModelStudent(int id, String name, int date, String male, String className, int point) {
        super(id, name, date, male);
        this.className = className;
        this.point= point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "ModelStudent{" +
                "classes=" + className +
                ", score=" + point +
                '}';
    }
}