package case_study.furama_resort.utils.employee;


import java.time.LocalDate;
import java.time.Period;

public class ValidateEmployee {
    public static boolean checkIdEmployee(String employeeId) {
        String PATTERN_ID = "(NV)-\\d{4}";
        return employeeId.matches(PATTERN_ID);
    }

    public static boolean checkNameEmployee(String employeeName) {
        String PATTERN_NAME = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
        return employeeName.matches(PATTERN_NAME);
    }

    public static boolean checkDateOfBirth(String employeeDateOfBirth) {
        String PATTERN_DATE_OF_BIRTH = "^([0-2]{1}\\d{1}-|[3]{1}[0-1]{1}-)([0]{1}\\d-|[1]\\d-|[2]\\d-)([1]\\d{3}|[2]{1}[0]{1}[0-1]\\d|[2]{1}[0]{1}[2]{1}[0-3]{1})";
        return employeeDateOfBirth.matches(PATTERN_DATE_OF_BIRTH);

    }

    public static boolean checkAge(String employeeDateOfBirth) {
        int date = Integer.parseInt(String.valueOf(employeeDateOfBirth.charAt(0))) * 10 + Integer.parseInt(String.valueOf(employeeDateOfBirth.charAt(1)));
        int month = Integer.parseInt(String.valueOf(employeeDateOfBirth.charAt(3))) * 10 + Integer.parseInt(String.valueOf(employeeDateOfBirth.charAt(4)));
        int year = Integer.parseInt(employeeDateOfBirth.substring(6, 10));
        LocalDate birth = LocalDate.of(year,month,date);
        System.out.println(Period.between(birth, LocalDate.now()).getYears());
        if (Period.between(birth, LocalDate.now()).getYears() >= 18) {
            return true;
        }
        return false;
    }

    public static boolean checkCitizenIdentificationNumber(String employeeCitizenIdentificationNumber) {
        String PATTERN_CODE = "^(\\d{9}|\\d{12})";
        return employeeCitizenIdentificationNumber.matches(PATTERN_CODE);
    }

    public static boolean checkPhoneNumber(String employeePhoneNumber) {
        String PATTERN_PHONE_NUMBER = "^(0)\\d{9}$";
        return employeePhoneNumber.matches(PATTERN_PHONE_NUMBER);
    }
}
