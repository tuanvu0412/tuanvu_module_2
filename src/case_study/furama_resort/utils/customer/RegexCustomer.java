package case_study.furama_resort.utils.customer;

public class RegexCustomer {
    public static boolean checkIdCustomer(String customerId) {
        String PATTERN_ID = "(KH)-\\d{4}";
        return customerId.matches(PATTERN_ID);
    }

    public static boolean checkNameCustomer(String customerName) {
        String PATTERN_NAME = "^([A-Z]{1}[a-z]{1,}\\s)+([A-Z]{1}[a-z]{1,}){1}";
        return customerName.matches(PATTERN_NAME);
    }

    public static boolean checkDateOfBirth(String customerDateOfBirth) {
        String PATTERN_DATE_OF_BIRTH = "^([0-2]{1}\\d{1}-|[3]{1}[0-1]{1}-)([0]{1}\\d-|[1]\\d-|[2]\\d-)([2]{1}[0]{1}[0-1]\\d|[2]{1}[0]{1}[2]{1}[0-3]{1})";
        return customerDateOfBirth.matches(PATTERN_DATE_OF_BIRTH);

    }

    public static boolean checkCitizenIdentificationNumber(String customerCitizenIdentificationNumber) {
        String PATTERN_CODE = "^(\\d{9}|\\d{12})";
        return customerCitizenIdentificationNumber.matches(PATTERN_CODE);
    }

    public static boolean checkPhoneNumber(String customerPhoneNumber) {
        String PATTERN_PHONE_NUMBER = "^(0)\\d{9}$";
        return customerPhoneNumber.matches(PATTERN_PHONE_NUMBER);
    }
}
