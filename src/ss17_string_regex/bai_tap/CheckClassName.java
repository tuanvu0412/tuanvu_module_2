package ss17_string_regex.bai_tap;

public class CheckClassName {
    public boolean checkClass(String classes) {
        String PATTERN = "(C|A|P)+\\d{4}+(G|H|I|K)+[0-9]";
        return classes.matches(PATTERN);
    }

    public static void main(String[] args) {
        CheckClassName checkClassName = new CheckClassName();
        System.out.println(checkClassName.checkClass("C0223G1"));
    }
}
