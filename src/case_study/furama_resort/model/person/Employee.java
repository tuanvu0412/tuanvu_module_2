package case_study.furama_resort.model.person;

public class Employee extends Person {
    private String level;
    private String position;
    private String salary;

    public Employee() {

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

    @Override
    public String toString() {
        return "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", male='" + getGender() + '\'' +
                ", citizenIdentificationNumber='" + getCitizenIdentificationNumber() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String employeeList() {
        return getId() + "," +
                getName() + "," +
                getDateOfBirth() + "," +
                getGender() + "," +
                getCitizenIdentificationNumber() + "," +
                getPhoneNumber() + "," +
                getEmail() + "," +
                level + "," +
                position + "," +
                salary;
    }
}
