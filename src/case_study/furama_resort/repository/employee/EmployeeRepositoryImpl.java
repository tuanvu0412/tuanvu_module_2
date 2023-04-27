package case_study.furama_resort.repository.employee;

import case_study.furama_resort.model.person_model.Employee;
import case_study.furama_resort.utils.employee.ReadAndWriteToEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private static final String PATH_EMPLOYEE = "src/case_study/furama_resort/common/furama.csv";
    static List<Employee> employees =ReadAndWriteToEmployee.read(PATH_EMPLOYEE);;

    @Override
    public List<Employee> getListEmployee() {
        employees = ReadAndWriteToEmployee.read(PATH_EMPLOYEE);
        return employees;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
        ReadAndWriteToEmployee.write1(employees, PATH_EMPLOYEE);
    }

    @Override
    public void editEmployeeList() {
      ReadAndWriteToEmployee.write1(employees,PATH_EMPLOYEE);
    }
    public int checkId(String id){
        int size=employees.size();
        for (int i = 0; i < size; i++) {
            if(employees.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
