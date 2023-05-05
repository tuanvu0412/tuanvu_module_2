package case_study.furama_resort.utils.booking;

public class ValidateBooking {
    public static boolean checkDate(String dateOfBooking) {
        String PATTERN_DATE = "^([0-2]{1}\\d{1}-|[3]{1}[0-1]{1}-)([0]{1}\\d-|[1]\\d-|[2]\\d-)([1]\\d{3}|[2]{1}[0]{1}[0-1]\\d|[2]{1}[0]{1}[2]{1}[0-3]{1})";
        return dateOfBooking.matches(PATTERN_DATE);

    }
}
