package ss11_map_tree.bai_tap.quan_ly_san_pham.model;

public class Computer extends Product {
    private String company;

    public Computer() {

    }

    public Computer(String code, String name, String date, String company) {
        super(code, name, date);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "code=" + getCode() +
                "name='" + getName() + '\'' +
                "date='" + getDate() + '\'' +
                "company='" + getCompany() + '\'' +
                '}';
    }
}
