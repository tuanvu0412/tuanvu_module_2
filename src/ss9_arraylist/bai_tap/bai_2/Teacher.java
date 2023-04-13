package ss9_arraylist.bai_tap.bai_2;

public class ModelTeacher extends Person {
    private String specialize;

    public  ModelTeacher(){
    }

    public ModelTeacher(int id, String name, int date, String male, String specialize) {
        super(id, name, date, male);
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "ModelTeacher{" +
                "specialize='" + specialize + '\'' +
                '}';
    }
}


