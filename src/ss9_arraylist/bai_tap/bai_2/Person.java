package ss9_arraylist.bai_tap.bai_2.model;

public class Person {
    private int id;
    private String name;
    private double date=0.0;
    private boolean male= true;

    public Person(){

    }

    public Person(int id, String name, double date, boolean male) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.male = male;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", male=" + male +
                '}';
    }
}
