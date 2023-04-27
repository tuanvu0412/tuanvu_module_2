package case_study.furama_resort.utils.employee;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.time.LocalDate;

public class Regex {
    public static boolean checkIdEmployee(String employeeId){
        String PATTERN_ID="(NV)-\\d{4}";
        return employeeId.matches(PATTERN_ID);
    }
    public static boolean checkNameEmployee(String employeeName){
        String PATTERN_NAME= "([A-Z][a-z]+)+([A-Z][a-z])";
        return employeeName.matches(PATTERN_NAME);
    }
    public static boolean checkDateOfBirth(String employeeDateOfBirth){
        String PATTERN_DATE_OF_BIRTH="^\\d{2}-\\d{2}-\\d{4}";
        return employeeDateOfBirth.matches(PATTERN_DATE_OF_BIRTH);

    }
    public static boolean checkCitizenIdentificationNumber(String employeeCitizenIdentificationNumber ){
        String PATTERN_CODE="^(\\d{9}|\\d{12})";
        return employeeCitizenIdentificationNumber.matches(PATTERN_CODE);
    }
    public static boolean checkPhoneNumber(String employeePhoneNumber){
        String PATTERN_PHONE_NUMBER="^(0)\\d{9}";
        return employeePhoneNumber.matches(PATTERN_PHONE_NUMBER);
    }
}
