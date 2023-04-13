package ss9_arraylist.bai_tap.bai_2.model;

public class ModelTeacher extends Person {
    private String specialize;

    public  ModelTeacher(){

    }

    public ModelTeacher(String specialize) {
        this.specialize = specialize;
    }

    public ModelTeacher(int id, String name, double date, boolean male, String specialize) {
        super(id, name, date, male);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "ModelTeacher{" +
                "specialize='" + specialize + '\'' +
                '}';
    }
}


