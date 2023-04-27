package case_study.furama_resort.repository.employee;

import case_study.furama_resort.model.person_model.Employee;
import case_study.furama_resort.utils.customer.ReadAndWrite2;
import case_study.furama_resort.utils.employee.ReadAndWrite3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private static final String PATH_EMPLOYEE="src/case_study/furama_resort/common/furama.csv";
    static List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> getListEmployee() {
        employees= ReadAndWrite3.Read(PATH_EMPLOYEE);
        return employees;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
        ReadAndWrite3.Write1(employees,PATH_EMPLOYEE);
        ReadAndWrite3.Read(PATH_EMPLOYEE);
    }

    @Override
    public boolean editEmployeeList(String newId, String id, String name, String dateOfBirth, String male, String citizenIdentificationNumber, String phoneNumber, String email, String level, String position, String salary) {
        List<Employee> list = ReadAndWrite3.Read(PATH_EMPLOYEE);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getId().equals(newId)) {
                list.get(i).setEmployList(id, name, dateOfBirth, male, citizenIdentificationNumber, phoneNumber, email, level, position, salary);
                ReadAndWrite3.Write1(list,PATH_EMPLOYEE);
                return true;
            }
        }
        return false;
    }
}
