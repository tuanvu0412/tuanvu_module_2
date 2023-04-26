package case_study.furama_resort.repository.employee;

import case_study.furama_resort.model.person_model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    static List<Employee>employees=new ArrayList<>();
    @Override
    public List<Employee> getListEmployee() {
        return employees;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public boolean editEmployeeList(String newId, String id, String name, String dateOfBirth, String male, String citizenIdentificationNumber, String phoneNumber, String email, String level, String position, String salary) {
        List<Employee>list= new ArrayList<>();
        int size=list.size();
        for (int i = 0; i < size; i++) {
            if(list.get(i).getId().equals(newId)){
                list.get(i).setEmployList(id,name,dateOfBirth,male,citizenIdentificationNumber,phoneNumber,email,level,position,salary);
                return true;
            }
        }
        return false;
    }
}
