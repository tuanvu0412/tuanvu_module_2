package ss9_arraylist.bai_tap.bai_2.model;

public class Person {
    private String code;
    private String name;
    private String date;
    private String sex;

    public Person(String code, String name, String date, String sex) {
        this.code = code;
        this.name = name;
        this.date = date;
        this.sex = sex;
    }

    public Person() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMale() {
        return sex;
    }

    public void setMale(String male) {
        this.sex = male;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", sex='" + sex + '\'' +
                '}';
    }
}
