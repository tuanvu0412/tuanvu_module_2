package ss9_arraylist.bai_tap.bai_2;

public class StudentRepository extends ModelStudent implements IList {
    private static ModelStudent[] students;
    static {
        students = new ModelStudent[4];
        ModelStudent s = new ModelStudent(1,"Alex",2000 ,"nam","C0223G1",7);
        ModelStudent s2 = new ModelStudent(2,"Adam",1999 ,"nam","C0223G1",6);
        ModelStudent s3 = new ModelStudent(3,"Eva",2000 ,"nữ","C0223G1",10);
        ModelStudent s4 = new ModelStudent(4,"Genny",1998 ,"nữ","C0223G1",8);
        students[0]=s;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;
    }

    @Override
    public void list() {
        for(ModelStudent s: students){
            if(s == null){
                break;
            }
            System.out.println(s);
        }

    }
}
