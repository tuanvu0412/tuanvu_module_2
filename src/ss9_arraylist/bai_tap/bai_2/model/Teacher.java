package ss9_arraylist.bai_tap.bai_2.model;


public class Teacher extends Person {
    private String specialize;

    public Teacher(String code, String name, String date, String sex, String specialize) {
        super(code, name, date, sex);
        this.specialize = specialize;
    }

    public Teacher(int id, String name, int date, boolean male, String specialize) {
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" + "code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", date=" + getDate() + '\'' +
                ", sex='" + getMale() + '\'' +
                "specialize='" + specialize + '\'' +
                '}';
    }
}