package case_study.furama_resort.service.customer;

import case_study.furama_resort.model.person.Customer;
import case_study.furama_resort.repository.customer.CustomerRepositoryImpl;
import case_study.furama_resort.utils.customer.ValidateCustomer;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    Scanner sc = new Scanner(System.in);
    CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
    List<Customer> list = customerRepository.getListCustomer();

    @Override
    public void displayCustomerList() {
        for (Customer c : list) {
            if (c.getCustomerLevel() != null) {
                System.out.println(c + " ");
            }
        }
    }

    @Override
    public void add() {
        String id;
        boolean flag0 = true;
        do {
            System.out.print("Enter id of Customer(ex:KH-XXXX): ");
            id = sc.nextLine();
            if (ValidateCustomer.checkIdCustomer(id)) {
                for (Customer c : list) {
                    if (c.getId().equals(id)) {
                        flag0 = false;
                        continue;
                    }
                }
                if (flag0) {
                    System.out.println("add done.");
                    break;
                } else {
                    System.err.println("Enter not same the format.");
                    continue;
                }
            }
        } while (!flag0);
        String name;
        do {
            System.out.print("Enter name of Customer(EX:Tuan Vu): ");
            name = sc.nextLine();
            if (ValidateCustomer.checkNameCustomer(name)) {
                System.out.println("Added name of customer.");
            } else {
                System.err.println("Enter not same format, please.");
            }
        } while (!ValidateCustomer.checkNameCustomer(name));
        String dateOfBirth;
        do {
            System.out.print("Enter dateOfBirth(dd-mm-yyyy): ");
            dateOfBirth = sc.nextLine();
            if (ValidateCustomer.checkDateOfBirth(dateOfBirth)) {
                System.out.println("add done.");
            } else {
                System.err.println("Enter not same format, please enter again.");
            }
        } while (!ValidateCustomer.checkDateOfBirth(dateOfBirth));
        System.out.println("Enter gender: 1 is male, 2 is female, 3 is another gender");
        int gender;
        boolean flag3 = true;
        do {
            gender = Integer.parseInt(sc.nextLine());
            if (gender == 1) {
                System.out.println("male.");
                flag3 = false;
            } else if (gender == 2) {
                System.out.println("female.");
                flag3 = false;
            } else if (gender == 3) {
                System.out.println("another gender.");
                flag3 = false;
            } else {
                System.err.println("not found gender.");
            }
        } while (flag3);
        String citizenIdentificationNumber;
        do {
            System.out.print("Enter citizenIdentificationNumber(ex:9 or 12 number) : ");
            citizenIdentificationNumber = sc.nextLine();
            if (ValidateCustomer.checkCitizenIdentificationNumber(citizenIdentificationNumber)) {
                System.out.println("add done.");
            } else {
                System.err.println("Enter not same format, please enter again.");
            }
        } while (!ValidateCustomer.checkCitizenIdentificationNumber(citizenIdentificationNumber));
        String phoneNumber;
        do {
            System.out.print("Enter phoneNumber (ex:0123456789): ");
            phoneNumber = sc.nextLine();
            if (ValidateCustomer.checkPhoneNumber(phoneNumber)) {
                System.out.println("add done.");
            } else {
                System.err.println("enter not same format, please enter again.");
            }
        } while (!ValidateCustomer.checkPhoneNumber(phoneNumber));
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Choice level of customer: ");
        String customerLevel = null;
        boolean flag = true;
        do {
            System.out.println("---Customer Level----\n" +
                    "1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Sivel\n" +
                    "5. Member\n" +
                    "mời bạn chọn ");
            int customerLevel1 = Integer.parseInt(sc.nextLine());
            switch (customerLevel1) {
                case 1:
                    flag = false;
                    customerLevel = "Diamond.";
                    break;
                case 2:
                    flag = false;
                    customerLevel = "Platinum.";
                    break;
                case 3:
                    flag = false;
                    customerLevel = "Gold.";
                    break;
                case 4:
                    flag = false;
                    customerLevel = "Sivel.";
                    break;
                case 5:
                    flag = false;
                    customerLevel = "member.";
                    break;
                default:
                    System.err.println("not found level.");

            }
        } while (flag);
        System.out.println("Enter address of customer: ");
        String address = sc.nextLine();
        customerRepository.add(new Customer(id, name, dateOfBirth, String.valueOf(gender), citizenIdentificationNumber, phoneNumber, email, customerLevel, address));
        System.out.println("Congratulation!!!!");
    }

    @Override
    public void editCustomerList() {
        System.out.print("Enter id of Customer you want Edit");
        String editCustomer = sc.nextLine();
        int edit = customerRepository.findId(editCustomer);
        Customer customerEdit = customerRepository.getListCustomer().get(edit);
        if (customerEdit == null) {
            System.err.println("Id not found ");
        } else {
            String id;
            do {
                System.out.print("Enter again old ID(KH-XXXX): ");
                id = sc.nextLine();
                if (ValidateCustomer.checkIdCustomer(id)) {
                    System.out.println("edit done.");
                } else {
                    System.err.println("Enter not same format, please enter again.");
                }
            } while (!ValidateCustomer.checkIdCustomer(id));
            customerEdit.setId(id);
            String name;
            do {
                System.out.print("Edit new CustomerName(ex:Tuan Vu): ");
                name = sc.nextLine();
                if (ValidateCustomer.checkNameCustomer(name)) {
                    System.out.println("edit DONE.");
                } else {
                    System.err.println("Enter not same format, please enter again.");
                }
            } while (!ValidateCustomer.checkNameCustomer(name));
            customerEdit.setName(name);
            String dateOfBirth;
            do {
                System.out.print("Edit newDateOfBirth of Customer (ex:dd-mm-yyyy: ");
                dateOfBirth = sc.nextLine();
                if (ValidateCustomer.checkDateOfBirth(dateOfBirth)) {
                    System.out.println("edit done.");
                } else {
                    System.err.println("edit not same format, please enter again.");
                }
            } while (!ValidateCustomer.checkDateOfBirth(dateOfBirth));
            customerEdit.setDateOfBirth(dateOfBirth);
            System.out.print("edit gender, input 1 for male, 2 for female, 3 for another gender.");
            int gender;
            boolean flag3 = true;
            do {
                gender = Integer.parseInt(sc.nextLine());
                if (gender == 1) {
                    System.out.println("male.");
                    flag3 = false;
                } else if (gender == 2) {
                    System.out.println("female.");
                    flag3 = false;
                } else if (gender == 3) {
                    System.out.println("another gender.");
                    flag3 = false;
                } else {
                    System.err.println("not found.");
                }
            } while (flag3);
            customerEdit.setGender(String.valueOf(gender));
            String citizenIdentificationNumber;
            do {
                System.out.print("Edit newCitizenIdentificationNumber(input 9 or 12) : ");
                citizenIdentificationNumber = sc.nextLine();
                if (ValidateCustomer.checkCitizenIdentificationNumber(citizenIdentificationNumber)) {
                    System.out.println("Edit done.");
                } else {
                    System.err.println("Edit not same format, please Edit again.");
                }
            } while (!ValidateCustomer.checkCitizenIdentificationNumber(citizenIdentificationNumber));
            customerEdit.setCitizenIdentificationNumber(citizenIdentificationNumber);
            String phoneNumber;
            do {
                System.out.print("Edit phoneNumber(ex:(0)123456789: ");
                phoneNumber = sc.nextLine();
                if (ValidateCustomer.checkPhoneNumber(phoneNumber)) {
                    System.out.println("Edit Done.");
                } else {
                    System.err.println("Edit not same format, please enter again.");
                }
            } while (!ValidateCustomer.checkPhoneNumber(phoneNumber));
            customerEdit.setPhoneNumber(phoneNumber);
            System.out.print("Edit email: ");
            String email = sc.nextLine();
            customerEdit.setEmail(email);
            System.out.print("choice level of Customer: ");
            String customerLevel = null;
            boolean flag = true;
            do {
                System.out.println("---Customer Level----\n" +
                        "1. Diamond\n" +
                        "2. Platinum\n" +
                        "3. Gold\n" +
                        "4. Sivel\n" +
                        "5. Member\n" +
                        "Enter your choice: ");
                int customerLevel1 = Integer.parseInt(sc.nextLine());
                switch (customerLevel1) {
                    case 1:
                        flag = false;
                        customerLevel = "Diamond.";
                        break;
                    case 2:
                        flag = false;
                        customerLevel = "Platinum.";
                        break;
                    case 3:
                        flag = false;
                        customerLevel = "Gold.";
                        break;
                    case 4:
                        flag = false;
                        customerLevel = "Sivel.";
                        break;
                    case 5:
                        flag = false;
                        customerLevel = "member.";
                        break;
                    default:
                        System.out.println("not found .");

                }
            } while (flag);
            customerEdit.setCustomerLevel(customerLevel);
            System.out.print("Edit address of Customer: ");
            String address = sc.nextLine();
            customerEdit.setAddress(address);
            System.out.println("Edit Done.");
            System.out.println("Congratulation!!!!");
        }
    }
}
