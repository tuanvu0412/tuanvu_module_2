package case_study.furama_resort.repository.employee;

import case_study.furama_resort.model.person_model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getListEmployee();

    void add(Employee employee);

    void editEmployeeList();
}
