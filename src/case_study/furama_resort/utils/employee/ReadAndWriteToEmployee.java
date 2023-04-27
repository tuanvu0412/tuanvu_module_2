package case_study.furama_resort.utils.employee;

import case_study.furama_resort.model.person_model.Customer;
import case_study.furama_resort.model.person_model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToEmployee {
    public static List<Employee> read(String PATH) {
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Employee> list = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp = null;
            String[] newArr;
            Employee employee;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                newArr = temp.split(",");
                employee = new Employee(newArr[0], newArr[1], newArr[2], newArr[3],newArr[4],newArr[5],newArr[6],newArr[7],newArr[8],newArr[9]);
                list.add(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void write1(List<Employee> employees, String filePath) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee c : employees) {
                bufferedWriter.write(c.employeeList());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
