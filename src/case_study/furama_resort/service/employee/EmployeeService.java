package case_study.furama_resort.service.employee;

import case_study.furama_resort.model.person.Employee;
import case_study.furama_resort.repository.employee.EmployeeRepositoryImpl;
import case_study.furama_resort.utils.employee.ValidateEmployee;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner sc = new Scanner(System.in);
    EmployeeRepositoryImpl employeeRepository = new EmployeeRepositoryImpl();
    List<Employee> list = employeeRepository.getListEmployee();


    @Override
    public void displayEmployeeList() {
        for (Employee e : list) {
            if (e.getLevel() != null || e.getPosition() != null) {
                System.out.println(e + " ");
            }
        }
    }

    @Override
    public void addNewEmployee() {
        employeeRepository.getListEmployee();
        String id;
        boolean flag;
        do {
            System.out.print("Enter ID of Employee (EX:NV-XXXX): ");
            id = sc.nextLine();
            flag = true;
            if (ValidateEmployee.checkIdEmployee(id)) {
                for (Employee employee : list) {
                    if (employee.getId().equals(id)) {
                        flag = false;
                        continue;
                    }
                }
                if (flag) {
                    System.out.print("Added Employee ID.\n");
                    break;
                } else {
                    System.err.print("id already exists");
                    continue;
                }
            }
        } while (!flag);
        String name;
        do {
            System.out.print("Enter name of Employee (EX: Tuan Vu): ");
            name = sc.nextLine();
            if (ValidateEmployee.checkNameEmployee(name)) {
                System.out.print("Added Employee Name.\n");
            } else {
                System.err.print("Enter the Name not same format.");
            }
        } while (!ValidateEmployee.checkNameEmployee(name));
        String dateOfBirth;
        do {
            System.out.print("Enter dateOfBirth of Employee(EX: 04-12-1990): ");
            dateOfBirth = sc.nextLine();
            if (!ValidateEmployee.checkDateOfBirth(dateOfBirth)) {
                System.err.println("Enter not same format, please Enter again.");
                continue;
            } else if (ValidateEmployee.checkAge(dateOfBirth)) {
                System.out.println("Added Employee dateOfBirth.");
                break;
            } else {
                System.err.println("not enough 18yearsOld");
                continue;
            }
        } while (true);
        String gender;
        boolean flag5 = true;
        do {
            System.out.print("Enter gender: enter number 1: is male, enter number 2: is famale , enter number 3: different genger: ");
            gender = sc.nextLine();
            if (gender.equals("1")) {
                System.out.print("male.\n");
                flag5 = false;
            } else if (gender.equals("2")) {
                System.out.print("female.\n");
                flag5 = false;
            } else if (gender.equals("3")) {
                System.out.print("different gender.\n");
                flag5 = false;
            } else {
                System.out.println("Enter not same format");
            }
        } while (flag5);
        String citizenIdentificationNumber;
        do {
            System.out.print("Enter CitizenIdentificationNumber or Passport(9 or 12 number): ");
            citizenIdentificationNumber = sc.nextLine();
            if (ValidateEmployee.checkCitizenIdentificationNumber(citizenIdentificationNumber)) {
                System.out.println("Add done.\n");
            } else {
                System.err.println("Enter not same format.");
            }
        } while (!ValidateEmployee.checkCitizenIdentificationNumber(citizenIdentificationNumber));
        String phoneNumber;
        do {
            System.out.print("Enter PhoneNumber(Ex:0123456789): ");
            phoneNumber = sc.nextLine();
            if (ValidateEmployee.checkPhoneNumber(phoneNumber)) {
                System.out.println("Added Employee PhoneNumber.\n");
            } else {
                System.err.println("Enter not same format. ");
            }
        } while (!ValidateEmployee.checkPhoneNumber(phoneNumber));
        System.out.print("Enter email of Employee(Ex: vu@gmail.com): ");
        String email = sc.nextLine();
        System.out.print("Enter qualification of Employee: ");
        String level = null;
        boolean flag1 = true;
        do {
            System.out.println("---Qualification of Employee---\n" +
                    "1. Intermediate.\n" +
                    "2. College.\n" +
                    "3. University.\n" +
                    "4. After graduation.\n" +
                    "Please choice Qualification: ");
            String choice = sc.nextLine();
            if (choice.equals("")) {
                try {
                    throw new Exception("Please, Choice a number form 1 to 4: ");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                switch (choice) {
                    case "1":
                        flag1 = false;
                        level = "Intermediate.";
                        break;
                    case "2":
                        flag1 = false;
                        level = "College.";
                        break;
                    case "3":
                        flag1 = false;
                        level = "University.";
                        break;
                    case "4":
                        flag1 = false;
                        level = "After graduation.";
                        break;
                    default:
                        System.err.println("Not Found.");
                }
            }
        } while (flag1);
        System.out.print("Enter position of Employee: ");
        String position = null;
        boolean flag2 = true;
        do {
            System.out.println("---Position Of Employee---\n" +
                    "1. Receptionist.\n" +
                    "2. Waitress.\n" +
                    "3. Expert.\n" +
                    "4. Supervisor.\n" +
                    "5. Manager.\n" +
                    "6. Director.\n");
            System.out.print("Please choice Position: ");
            String choice = sc.nextLine();
            if (choice.equals("")) {
                try {
                    throw new Exception("Please, Choice a number form 1 to 6: ");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                switch (choice) {
                    case "1":
                        position = "Receptionist.";
                        flag2 = false;
                        break;
                    case "2":
                        position = " Waitress.";
                        flag2 = false;
                        break;
                    case "3":
                        position = " Expert.";
                        flag2 = false;
                        break;
                    case "4":
                        position = "Supervisor.";
                        flag2 = false;
                        break;
                    case "5":
                        position = "Manager.";
                        flag2 = false;
                        break;
                    case "6":
                        position = "Director.";
                        flag2 = false;
                        break;
                    default:
                        System.err.println("Not Found.");
                }
            }
        } while (flag2);
        double salary;
        do {
            System.out.print("Enter salary of Employee: ");
            salary = Integer.parseInt(sc.nextLine());
            if (salary < 0) {
                System.out.println("Please enter salary must be greater than 0.");
                continue;
            }
        } while (salary <= 0);
        employeeRepository.add(new Employee(id, name, dateOfBirth, gender, citizenIdentificationNumber, phoneNumber, email, level, position, String.valueOf(salary)));
    }

    @Override
    public void editEmployeeList() {
        System.out.print("Enter ID you want to change(NV-XXXX) : ");
        String editEmployee = sc.nextLine();
        int edit = employeeRepository.checkId(editEmployee);
        Employee employeeEdit = employeeRepository.getListEmployee().get(edit);
        if (editEmployee == null) {
            System.err.println("ID not found");
        } else {
            String id;
            do {
                System.out.print("Enter newID(NV-XXXX): ");
                id = sc.nextLine();
                if (ValidateEmployee.checkIdEmployee(id)) {
                    System.out.println("Edit done.\n");
                } else {
                    System.err.println(" Not same format.");
                }
            } while (!ValidateEmployee.checkIdEmployee(id));
            employeeEdit.setId(id);
            String name;
            do {
                System.out.print("Enter newName(A-z A-z...): ");
                name = sc.nextLine();
                if (ValidateEmployee.checkNameEmployee(name)) {
                    System.out.println("Edit done.\n");
                } else {
                    System.err.println("Enter not same format.");
                }
            } while (!ValidateEmployee.checkNameEmployee(name));
            employeeEdit.setName(name);
            String dateOfBirth;
            do {
                System.out.print("Enter dateOfBirth(dd-mm-yy): ");
                dateOfBirth = sc.nextLine();
                if (!ValidateEmployee.checkDateOfBirth(dateOfBirth)) {
                    System.err.println("Enter not same format, please enter again");
                    continue;
                }
                if (ValidateEmployee.checkAge(dateOfBirth)) {
                    System.out.println("Edit done");
                    break;
                } else {
                    System.out.println("not enough 18yearsOld");
                    continue;
                }
            } while (true);
            employeeEdit.setDateOfBirth(dateOfBirth);
            System.out.print("Enter gender for employee, choice 1 is male, choice 2 is female, choice 3 is different gender");
            String gender;
            boolean flag = true;
            do {
                System.out.print("Enter gender: enter number 1: is male, enter number 2: is female , enter number 3: different genger: ");
                gender = sc.nextLine();
                if (gender.equals("1")) {
                    System.out.print("male.\n");
                    flag = false;
                } else if (gender.equals("2")) {
                    System.out.print("female.\n");
                    flag = false;
                } else if (gender.equals("3")) {
                    System.out.print("different gender.\n");
                    flag = false;
                } else {
                    System.out.println("Enter not same format");
                }
            } while (flag);
            employeeEdit.setGender(gender);
            String citizenIdentificationNumber;
            do {
                System.out.print("Enter citizenIdentificationNumber of passport(9 or 12 numbers): ");
                citizenIdentificationNumber = sc.nextLine();
                if (ValidateEmployee.checkCitizenIdentificationNumber(citizenIdentificationNumber)) {
                    System.out.println("edit done.\n");
                } else {
                    System.err.println("enter not same format, please enter again.");
                }
            } while (!ValidateEmployee.checkCitizenIdentificationNumber(citizenIdentificationNumber));
            employeeEdit.setCitizenIdentificationNumber(citizenIdentificationNumber);
            String phoneNumber;
            do {
                System.out.print("Enter PhoneNumber((0)123456789): ");
                phoneNumber = sc.nextLine();
                if (ValidateEmployee.checkPhoneNumber(phoneNumber)) {
                    System.out.println("Edit done.\n");
                } else {
                    System.err.println("Enter not same format, please enter again.");
                }
            } while (!ValidateEmployee.checkPhoneNumber(phoneNumber));
            employeeEdit.setPhoneNumber(phoneNumber);

            System.out.print("Enter email: ");
            String email = sc.nextLine();
            employeeEdit.setEmail(email);
            System.out.println("Enter Position: ");
            String level = null;
            boolean flag1 = true;
            do {
                System.out.println("---Qualification of Employee---\n" +
                        "1. Intermediate \n" +
                        "2. College\n" +
                        "3. University\n" +
                        "4. After graduation\n" +
                        "5. Exit\n" +
                        "Please choice Position");
                String choice = sc.nextLine();
                if (choice.equals("")) {
                    try {
                        throw new Exception("the string must not be empty, Please choice a number");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    switch (choice) {
                        case "1":
                            flag1 = false;
                            level = "Intermediate.";
                            break;
                        case "2":
                            flag1 = false;
                            level = "College.";
                            break;
                        case "3":
                            flag1 = false;
                            level = "University.";
                            break;
                        case "4":
                            flag1 = false;
                            level = "After graduation.";
                            break;
                        default:
                            System.err.println("not found.");
                    }
                }
            } while (flag1);
            employeeEdit.setLevel(level);
            System.out.println("Enter employeePosition ");
            String position = null;
            boolean flag2 = true;
            do {
                System.out.println("---Position of Employee---\n" +
                        "1. Reception\n" +
                        "2. Waitress\n" +
                        "3. Expert\n" +
                        "4. Supervisor\n" +
                        "5. Manager\n" +
                        "6. Director\n" +
                        "7. Exit menu");
                System.out.println("Please choice newPosition: ");
                String choice = sc.nextLine();
                if (choice.equals("")) {
                    try {
                        throw new Exception("the string must not be empty, Please choice a number");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    switch (choice) {
                        case "1":
                            position = "Reception.";
                            flag2 = false;
                            break;
                        case "2":
                            position = " Waitress.";
                            flag2 = false;
                            break;
                        case "3":
                            position = "Expert.";
                            flag2 = false;
                            break;
                        case "4":
                            position = "Supervisor.";
                            flag2 = false;
                            break;
                        case "5":
                            position = "Manager.";
                            flag2 = false;
                            break;
                        case "6":
                            position = "Director.";
                            flag2 = false;
                            break;
                        default:
                            System.err.println("not found.");
                    }
                }
            } while (flag2);
            employeeEdit.setPosition(position);
            double salary;
            do {
                System.out.print("Enter salary: ");
                salary = Integer.parseInt(sc.nextLine());
            } while (salary <= 0);
            employeeEdit.setSalary(String.valueOf(salary));
            System.out.print("Edit done.\n");
            employeeRepository.editEmployeeList(employeeEdit);
        }
    }
}
