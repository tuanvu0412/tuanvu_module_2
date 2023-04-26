package case_study.furama_resort.repository.employee;

import case_study.furama_resort.model.person_model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getListEmployee();
    void add(Employee employee);
    boolean editEmployeeList(String newId,String id, String name, String dateOfBirth, String male, String citizenIdentificationNumber, String phoneNumber, String email, String level, String position,String salary);
}
