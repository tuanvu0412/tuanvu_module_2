package case_study.furama_resort.repository.employee;

import case_study.furama_resort.model.person.Employee;
import case_study.furama_resort.utils.employee.ReadAndWriteToEmployee;

import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private static final String PATH_EMPLOYEE = "src/case_study/furama_resort/data/employee.csv";
    static List<Employee> employees = ReadAndWriteToEmployee.read(PATH_EMPLOYEE);

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
    public void editEmployeeList(Employee employee) {
        List<Employee> list = ReadAndWriteToEmployee.read(PATH_EMPLOYEE);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(employee.getId())) {
                employees.set(i, employee);
                ReadAndWriteToEmployee.write1(employees, PATH_EMPLOYEE);
                break;
            }
        }
    }

    public int checkId(String id) {
        int size = employees.size();
        for (int i = 0; i < size; i++) {
            if (employees.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
