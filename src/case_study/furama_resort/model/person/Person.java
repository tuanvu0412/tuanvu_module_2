package case_study.furama_resort.model.person;

public abstract class Person {
    private String id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String citizenIdentificationNumber;
    private String phoneNumber;
    private String email;

    public Person() {

    }

    public Person(String id, String name, String dateOfBirth, String male, String citizenIdentificationNumber, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = male;
        this.citizenIdentificationNumber = citizenIdentificationNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCitizenIdentificationNumber() {
        return citizenIdentificationNumber;
    }

    public void setCitizenIdentificationNumber(String citizenIdentificationNumber) {
        this.citizenIdentificationNumber = citizenIdentificationNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", male='" + gender + '\'' +
                ", citizenIdentificationNumber='" + citizenIdentificationNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
