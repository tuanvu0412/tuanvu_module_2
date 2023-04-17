package ss11_map_tree.bai_tap.quan_ly_san_pham.model;

public class Product {
    private String code;
    private String name;
    private String date;
    public Product(){

    }

    public Product(String code, String name, String date) {
        this.code = code;
        this.name = name;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
