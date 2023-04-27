package case_study.furama_resort.model.person_model;

public class Employee extends Person{
    private String level;
    private String position;
    private String salary;

    public Employee(){

    }

    public Employee(String id, String name, String dateOfBirth, String male, String citizenIdentificationNumber, String phoneNumber, String email, String level, String position, String salary) {
        super(id, name, dateOfBirth, male, citizenIdentificationNumber, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setEmployList(String id, String name, String dateOfBirth, String male, String citizenIdentificationNumber, String phoneNumber, String email, String level, String position, String salary) {
        this.getId();
        this.getName();
        this.getDateOfBirth();
        this.getMale();
        this.getCitizenIdentificationNumber();
        this.getPhoneNumber();
        this.getEmail();
        this.getLevel();
        this.getSalary();
    }
    @Override
    public String toString() {
        return "Employee{" + super.toString()+
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
    public String employeeList(){
        return "Employee{" + super.toString()+
                "level='" + level + "," +
                ", position='" + position + "," +
                ", salary='" + salary + "," +
                '}';
    }
}
