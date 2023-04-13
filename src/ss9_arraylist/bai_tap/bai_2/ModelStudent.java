package ss9_arraylist.bai_tap.bai_2.model;

public class ModelStudent extends Person {
    private String className;
    private double point = 0.0;

    public ModelStudent() {

    }
    public ModelStudent(int id, String name, double date, boolean male, String className, double score) {
        super(id, name, date, male);
        this.className = className;
        this.point = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
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