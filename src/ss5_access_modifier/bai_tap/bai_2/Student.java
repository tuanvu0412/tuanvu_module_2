package ss5_access_modifier.bai_tap.bai_2;

public class Student {
    public String name = "john";
    public String classes = "C02";

    public Student() {
    }

    public void setName() {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
