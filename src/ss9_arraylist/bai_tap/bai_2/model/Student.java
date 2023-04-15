package ss9_arraylist.bai_tap.bai_2.model;



public class Student extends Person {
    private int score;
    private String classes;

    public Student(String code, String name, String date, String sex, String classes, int score) {
        super(code, name, date, sex);
        this.classes = classes;
        this.score = score;
    }

    public Student() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", date=" + getDate() + '\'' +
                ", sex='" + getMale() + '\'' +
                "score=" + score + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
