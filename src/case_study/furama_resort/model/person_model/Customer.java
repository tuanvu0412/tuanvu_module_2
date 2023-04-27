package case_study.furama_resort.model.person_model;

public class Customer extends Person{
    private String customerLevel;
    private String address;

    public Customer() {
    }

    public Customer(String id, String name, String dateOfBirth, String male, String citizenIdentificationNumber, String phoneNumber, String email, String customerLevel, String address) {
        super(id, name, dateOfBirth, male, citizenIdentificationNumber, phoneNumber, email);
        this.customerLevel = customerLevel;
        this.address = address;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setCustomerList(String id, String name, String dateOfBirth, String male, String citizenIdentificationNumber, String phoneNumber, String email, String customerLevel, String address) {
        this.getId();
        this.getName();
        this.getDateOfBirth();
        this.getMale();
        this.getCitizenIdentificationNumber();
        this.getPhoneNumber();
        this.getEmail();
        this.getCustomerLevel();
        this.getAddress();
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "customerLevel='" + customerLevel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String customerList(){
        return "Customer{" + super.toString()+
                "customerLevel='" + customerLevel + "," +
                ", address='" + address + "," +
                '}';
    }
}
