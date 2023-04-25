package ss17_string_regex.bai_tap;

public class CheckPhoneNumber {
    public boolean phoneNumber(String num) {
        String PATTERN = "^84+0+\\d{7}";
        return num.matches(PATTERN);
    }

    public static void main(String[] args) {
        CheckPhoneNumber checkPhoneNumber = new CheckPhoneNumber();
        System.out.println(checkPhoneNumber.phoneNumber("8401234567"));

    }
}
